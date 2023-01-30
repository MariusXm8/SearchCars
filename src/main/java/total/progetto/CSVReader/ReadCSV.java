package total.progetto.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

import org.springframework.beans.factory.annotation.Autowired;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import total.progetto.mapper.VeicoloMapper;
import total.progetto.model.Veicolo;
import total.progetto.repository.VeicoloRepository;
import total.progetto.service.VeicoloService;

public class ReadCSV {

	@Autowired
	static VeicoloService vs;
	@Autowired
    static VeicoloMapper vm;
	@Autowired
	static Veicolo v;
	/*
	 * in teoria sono arrivato quasi alla fine di risolvere il problema
	 * ma siccome il tempo è quello e per sfortuna sono impegnato
	 * 
	 * Se siete sodd
	 */

	public static void main(String[] args) throws IOException, CsvException{
		String fileName = "input.csv";
		
		
		CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
		  try(CSVReader reader = new CSVReaderBuilder(
		          new FileReader(fileName))
		          .withCSVParser(csvParser)   // custom CSV parser
		          //.withSkipLines(1)           // skip the first line, header info
		          .build()){
		      List<String[]> r = reader.readAll();
		      
		      
		      for (String[] strings : r) {
				System.out.println(Arrays.toString(strings));
				int i=0;
				for (String strings2 : strings) {
					System.out.println(strings2);
					//in questo modo non ci sono possibilità che va a salvare i dati sbagliato nel modello
					switch (i) {
					case 0:
						v.setMarca(strings2);
						i++;
					break;				
					case 1:
						v.setModello(strings2);
						i++;
					break;
					case 2:
						v.setPrezzo(Long.valueOf(strings2));
						i++;
					break;
					case 3:
						v.setTarga(strings2);
						i++;
					break;
					case 4:
						v.setNumeroRuote(Long.valueOf(strings2));
						i++;
					break;

					
					}
				}
				i=0;
				//salvo ogni veicolo nel database
				vs.aggiungiVeicolo(vm.veicoloToVeicoloDTO(v));
				
			} 
		      
		     
		     
		      
		      
		  }

	}

}

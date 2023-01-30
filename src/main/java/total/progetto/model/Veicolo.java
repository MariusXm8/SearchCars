package total.progetto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Entity
@Data
@Table(name="veicolo")
public class Veicolo {
	@Id
	//genrated value viene usato per incrementare il primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="marca")
	@CsvBindByName(column = "marca")
	private String marca;
	
	@Column(name="modello")
	@CsvBindByName(column = "modello")
	private String modello;
	
	@Column(name="prezzo")
	@CsvBindByName(column = "prezzo")
	private Long prezzo;
	
	@Column(name="targa")
	@CsvBindByName(column = "targa")
	private String targa;
	
	@Column(name="numeroRuote")
	@CsvBindByName(column = "numero_ruote")
	private Long numeroRuote;

	
	

}

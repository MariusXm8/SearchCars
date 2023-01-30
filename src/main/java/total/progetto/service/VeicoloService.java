package total.progetto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import total.progetto.mapper.VeicoloMapper;
import total.progetto.model.Veicolo;
import total.progetto.openapi.api.VeicoloApiDelegate;
import total.progetto.openapi.model.VeicoloDTO;
import total.progetto.repository.VeicoloRepository;

@Service
@RestController
public class VeicoloService implements VeicoloApiDelegate {

	@Autowired
	private VeicoloRepository rp;

	@Autowired
	private VeicoloMapper vm;

	// ------------------------------------------GET
	@Override
	public ResponseEntity<List<VeicoloDTO>> cercaTutti() {
		return ResponseEntity.ok(vm.veicoloToVeicoloDTO(rp.findAll()));
	}

	@Override
	public ResponseEntity<VeicoloDTO> aggiungiVeicolo(VeicoloDTO veicoloDTO) {
		/*
		 * per poter aggiungere il veicolo al database devo prima transformarlo
		 * in questo caso sia veicolo che veicoloDTO hanno i stessi parametri
		 * 
		 * In teoria si dovrebbe fare anche la validazione dei dati per ogni parametro
		 */
		Veicolo v = vm.veicoloDTOToVeicolo(veicoloDTO);
		rp.save(v);
		VeicoloDTO vDTO = vm.veicoloToVeicoloDTO(v);
		return ResponseEntity.ok(vDTO);
	}

	@Override
	public ResponseEntity<List<VeicoloDTO>> ricercaPrezzo(Long prezzo) {
		
		/*
		 * per la ricerca del prezzo è il suo problema come deve trovare 
		 * tutti i prezzi
		 */
		return ResponseEntity.ok(vm.veicoloToVeicoloDTO(rp.findByPrezzo(prezzo)));

	}

	@Override
	public ResponseEntity<List<VeicoloDTO>> ricercaTarga(String targa) {

		return ResponseEntity.ok(vm.veicoloToVeicoloDTO(rp.findByTarga(targa)));
	}

	@Override
	public ResponseEntity<List<VeicoloDTO>> ricercaTipologia(Long tipologia) {

		return ResponseEntity.ok(vm.veicoloToVeicoloDTO(rp.findByNumeroRuote(tipologia)));
	}

}

package total.progetto.mapper;

import java.util.List;

import org.mapstruct.Mapper;


import total.progetto.model.Veicolo;
import total.progetto.openapi.model.VeicoloDTO;

@Mapper(componentModel = "spring", uses = { VeicoloMapper.class })

public interface VeicoloMapper {
	/*
	 * Essendo che devo mappera gli oggeti in entrato o uscita, 
	 * quindi vado a mappera
	 */
	
	
	VeicoloDTO veicoloToVeicoloDTO(Veicolo v);
	 
	Veicolo veicoloDTOToVeicolo(VeicoloDTO v);

	List<VeicoloDTO> veicoloToVeicoloDTO(List<Veicolo> v);
}

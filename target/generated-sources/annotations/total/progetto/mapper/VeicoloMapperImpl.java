package total.progetto.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import total.progetto.model.Veicolo;
import total.progetto.openapi.model.VeicoloDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-24T11:51:03+0100",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class VeicoloMapperImpl implements VeicoloMapper {

    @Override
    public VeicoloDTO veicoloToVeicoloDTO(Veicolo v) {
        if ( v == null ) {
            return null;
        }

        VeicoloDTO veicoloDTO = new VeicoloDTO();

        veicoloDTO.setMarca( v.getMarca() );
        veicoloDTO.setModello( v.getModello() );
        if ( v.getPrezzo() != null ) {
            veicoloDTO.setPrezzo( BigDecimal.valueOf( v.getPrezzo() ) );
        }
        veicoloDTO.setTarga( v.getTarga() );
        if ( v.getNumeroRuote() != null ) {
            veicoloDTO.setNumeroRuote( BigDecimal.valueOf( v.getNumeroRuote() ) );
        }

        return veicoloDTO;
    }

    @Override
    public Veicolo veicoloDTOToVeicolo(VeicoloDTO v) {
        if ( v == null ) {
            return null;
        }

        Veicolo veicolo = new Veicolo();

        veicolo.setMarca( v.getMarca() );
        veicolo.setModello( v.getModello() );
        if ( v.getNumeroRuote() != null ) {
            veicolo.setNumeroRuote( v.getNumeroRuote().longValue() );
        }
        if ( v.getPrezzo() != null ) {
            veicolo.setPrezzo( v.getPrezzo().longValue() );
        }
        veicolo.setTarga( v.getTarga() );

        return veicolo;
    }

    @Override
    public List<VeicoloDTO> veicoloToVeicoloDTO(List<Veicolo> v) {
        if ( v == null ) {
            return null;
        }

        List<VeicoloDTO> list = new ArrayList<VeicoloDTO>( v.size() );
        for ( Veicolo veicolo : v ) {
            list.add( veicoloToVeicoloDTO( veicolo ) );
        }

        return list;
    }
}

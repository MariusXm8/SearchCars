/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package total.progetto.openapi.api;

import total.progetto.openapi.model.VeicoloDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-30T17:31:00.935323800+01:00[Europe/Paris]")
@Validated
@Api(value = "veicolo", description = "the veicolo API")
public interface VeicoloApi {

    default VeicoloApiDelegate getDelegate() {
        return new VeicoloApiDelegate() {};
    }

    /**
     * POST /veicolo
     * Aggiunge veicolo nel db
     *
     * @param veicoloDTO crea prima il body per inserire nel db (required)
     * @return Veicolo aggiunto (status code 200)
     *         or Input non valido (status code 401)
     */
    @ApiOperation(value = "", nickname = "aggiungiVeicolo", notes = "Aggiunge veicolo nel db", response = VeicoloDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Veicolo aggiunto", response = VeicoloDTO.class),
        @ApiResponse(code = 401, message = "Input non valido") })
    @PostMapping(
        value = "/veicolo",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<VeicoloDTO> aggiungiVeicolo(@ApiParam(value = "crea prima il body per inserire nel db" ,required=true )  @Valid @RequestBody VeicoloDTO veicoloDTO) {
        return getDelegate().aggiungiVeicolo(veicoloDTO);
    }


    /**
     * GET /veicolo
     * Ritorna tutti i veicoli
     *
     * @return operazione riuscita (status code 200)
     *         or errore (status code 401)
     */
    @ApiOperation(value = "", nickname = "cercaTutti", notes = "Ritorna tutti i veicoli", response = VeicoloDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operazione riuscita", response = VeicoloDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "errore") })
    @GetMapping(
        value = "/veicolo",
        produces = { "application/json" }
    )
    default ResponseEntity<List<VeicoloDTO>> cercaTutti() {
        return getDelegate().cercaTutti();
    }


    /**
     * GET /veicolo/prezzo/{prezzo} : Ricerca veicolo da prezzo
     *
     * @param prezzo Il prezzo (required)
     * @return Ricerca riuscita (status code 200)
     *         or Persona not found (status code 401)
     */
    @ApiOperation(value = "Ricerca veicolo da prezzo", nickname = "ricercaPrezzo", notes = "", response = VeicoloDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ricerca riuscita", response = VeicoloDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Persona not found") })
    @GetMapping(
        value = "/veicolo/prezzo/{prezzo}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<VeicoloDTO>> ricercaPrezzo(@ApiParam(value = "Il prezzo",required=true) @PathVariable("prezzo") Long prezzo) {
        return getDelegate().ricercaPrezzo(prezzo);
    }


    /**
     * GET /veicolo/targa/{targa} : Ricerca veicolo da prezzo
     *
     * @param targa ID della targa (required)
     * @return Ricerca riuscita (status code 201)
     *         or Targa non trovata (status code 401)
     */
    @ApiOperation(value = "Ricerca veicolo da prezzo", nickname = "ricercaTarga", notes = "", response = VeicoloDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Ricerca riuscita", response = VeicoloDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Targa non trovata") })
    @GetMapping(
        value = "/veicolo/targa/{targa}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<VeicoloDTO>> ricercaTarga(@ApiParam(value = "ID della targa",required=true) @PathVariable("targa") String targa) {
        return getDelegate().ricercaTarga(targa);
    }


    /**
     * GET /veicolo/tipologia/{tipologia} : Ricerca veicolo da prezzo
     *
     * @param tipologia La Tipologia (2/4) ruote (required)
     * @return Ricerca riuscita (status code 200)
     *         or Tipologia non trovata (status code 401)
     */
    @ApiOperation(value = "Ricerca veicolo da prezzo", nickname = "ricercaTipologia", notes = "", response = VeicoloDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ricerca riuscita", response = VeicoloDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Tipologia non trovata") })
    @GetMapping(
        value = "/veicolo/tipologia/{tipologia}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<VeicoloDTO>> ricercaTipologia(@ApiParam(value = "La Tipologia (2/4) ruote",required=true) @PathVariable("tipologia") Long tipologia) {
        return getDelegate().ricercaTipologia(tipologia);
    }

}

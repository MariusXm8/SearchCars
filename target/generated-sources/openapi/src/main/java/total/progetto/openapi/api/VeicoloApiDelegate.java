package total.progetto.openapi.api;

import total.progetto.openapi.model.VeicoloDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link VeicoloApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-30T17:31:00.935323800+01:00[Europe/Paris]")
public interface VeicoloApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /veicolo
     * Aggiunge veicolo nel db
     *
     * @param veicoloDTO crea prima il body per inserire nel db (required)
     * @return Veicolo aggiunto (status code 200)
     *         or Input non valido (status code 401)
     * @see VeicoloApi#aggiungiVeicolo
     */
    default ResponseEntity<VeicoloDTO> aggiungiVeicolo(VeicoloDTO veicoloDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marca\" : \"marca\", \"prezzo\" : 0.8008281904610115, \"numeroRuote\" : 6.027456183070403, \"modello\" : \"modello\", \"targa\" : \"targa\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /veicolo
     * Ritorna tutti i veicoli
     *
     * @return operazione riuscita (status code 200)
     *         or errore (status code 401)
     * @see VeicoloApi#cercaTutti
     */
    default ResponseEntity<List<VeicoloDTO>> cercaTutti() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marca\" : \"marca\", \"prezzo\" : 0.8008281904610115, \"numeroRuote\" : 6.027456183070403, \"modello\" : \"modello\", \"targa\" : \"targa\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /veicolo/prezzo/{prezzo} : Ricerca veicolo da prezzo
     *
     * @param prezzo Il prezzo (required)
     * @return Ricerca riuscita (status code 200)
     *         or Persona not found (status code 401)
     * @see VeicoloApi#ricercaPrezzo
     */
    default ResponseEntity<List<VeicoloDTO>> ricercaPrezzo(Long prezzo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marca\" : \"marca\", \"prezzo\" : 0.8008281904610115, \"numeroRuote\" : 6.027456183070403, \"modello\" : \"modello\", \"targa\" : \"targa\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /veicolo/targa/{targa} : Ricerca veicolo da prezzo
     *
     * @param targa ID della targa (required)
     * @return Ricerca riuscita (status code 201)
     *         or Targa non trovata (status code 401)
     * @see VeicoloApi#ricercaTarga
     */
    default ResponseEntity<List<VeicoloDTO>> ricercaTarga(String targa) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marca\" : \"marca\", \"prezzo\" : 0.8008281904610115, \"numeroRuote\" : 6.027456183070403, \"modello\" : \"modello\", \"targa\" : \"targa\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /veicolo/tipologia/{tipologia} : Ricerca veicolo da prezzo
     *
     * @param tipologia La Tipologia (2/4) ruote (required)
     * @return Ricerca riuscita (status code 200)
     *         or Tipologia non trovata (status code 401)
     * @see VeicoloApi#ricercaTipologia
     */
    default ResponseEntity<List<VeicoloDTO>> ricercaTipologia(Long tipologia) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marca\" : \"marca\", \"prezzo\" : 0.8008281904610115, \"numeroRuote\" : 6.027456183070403, \"modello\" : \"modello\", \"targa\" : \"targa\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

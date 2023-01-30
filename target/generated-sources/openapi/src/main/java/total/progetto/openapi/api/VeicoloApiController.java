package total.progetto.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-30T17:31:00.935323800+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.gestioneProgetto.base-path:}")
public class VeicoloApiController implements VeicoloApi {

    private final VeicoloApiDelegate delegate;

    public VeicoloApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) VeicoloApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new VeicoloApiDelegate() {});
    }

    @Override
    public VeicoloApiDelegate getDelegate() {
        return delegate;
    }

}

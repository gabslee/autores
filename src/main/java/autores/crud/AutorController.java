package autores.crud;

import br.com.farm.crud.apis.AutorApi;

import br.com.farm.crud.components.RequestPayloadAutor;
import br.com.farm.crud.components.ResponseAutor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AutorController implements AutorApi {

    @Override
    public ResponseEntity<ResponseAutor> alteraAutor(Integer id, RequestPayloadAutor requestPayloadAutor) {
        List<Autor> autoresFromService = new ArrayList<>();
        ResponseAutor responseAutor = new ResponseAutor();
        responseAutor.setData(AutorMapper.toResponse(autoresFromService));
        return ResponseEntity.ok().body(responseAutor);
    }
}

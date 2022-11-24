package autores.crud;

import br.com.farm.crud.components.ResponseAutor;
import br.com.farm.crud.components.ResponseAutorData;

import java.util.ArrayList;
import java.util.List;

public class AutorMapper {

    static ResponseAutorData toResponse(Autor autor){
        ResponseAutorData responseAutor = new ResponseAutorData();
        responseAutor.setId(autor.getId().intValue());
        responseAutor.setNome(autor.getNome());
        responseAutor.setStatus(String.valueOf(autor.getStatus().getStatus()));
        responseAutor.setNascimento(autor.getNascimento());
        return responseAutor;
    }

    static List<ResponseAutorData> toResponse(List<Autor> autores){
        List<ResponseAutorData> responseAutorData = new ArrayList<>();
        autores.forEach(autor -> {
            responseAutorData.add(toResponse(autor));
        });
        return responseAutorData;
    }

    static Autor toModel(ResponseAutorData responseAutorData){
        Autor autor = new Autor();
        autor.setId(responseAutorData.getId().longValue());
        autor.setNome(responseAutorData.getNome());
        autor.setStatus(status.toStatus(Integer.valueOf(responseAutorData.getStatus())));
        autor.setNascimento(responseAutorData.getNascimento());
        return autor;
    }

    static List<Autor> toModel(List<ResponseAutorData> responseAutorDatas){
        List<Autor> autores = new ArrayList<>();
        responseAutorDatas.forEach(responseAutorData -> {
            autores.add(toModel(responseAutorData));

        });
        return autores;
    }

}

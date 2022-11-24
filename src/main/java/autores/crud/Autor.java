package autores.crud;

import lombok.Data;

@Data
public class Autor {

    Long id;
    String nome;
    String nascimento;
    status status = autores.crud.status.ATIVO;

}

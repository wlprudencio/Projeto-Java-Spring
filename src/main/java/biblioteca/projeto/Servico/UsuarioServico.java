package biblioteca.projeto.Servico;

import biblioteca.projeto.dtos.UsuarioDto;
import biblioteca.projeto.model.Usuario;

public interface UsuarioServico {

   Usuario findByUsuario(UsuarioDto usuario);



    boolean validaUsuario(String email, String senha);


}

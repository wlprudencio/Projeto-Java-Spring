package biblioteca.projeto.Controller;


import biblioteca.projeto.Servico.UsuarioServico;
import biblioteca.projeto.dtos.UsuarioDto;
import biblioteca.projeto.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioServico servico;

    @GetMapping("/login")
    public String usuariologin(UsuarioDto usuarioDto) {
        return "loginusuario"; // Retorna a página de login
    }


    @PostMapping("/login")
    public String validausuario(@Valid @ModelAttribute UsuarioDto usuarioDto, BindingResult result) {
        if(result.hasErrors())
            return "loginusuario";
        // Verifica se o usuário existe no banco de dados
        Usuario user = this.servico.findByUsuario(usuarioDto);

        if (user != null && user.getSenha().equals(usuarioDto.getSenha()))
            return "redirect:/home";

        return "loginusuario";
    }

}



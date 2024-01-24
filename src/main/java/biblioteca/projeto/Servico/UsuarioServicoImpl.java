package biblioteca.projeto.Servico;

import biblioteca.projeto.Repositorio.UsuarioRepository;
import biblioteca.projeto.dtos.UsuarioDto;
import biblioteca.projeto.model.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UsuarioServicoImpl implements UsuarioServico {


    private UsuarioRepository repository;

    @Autowired
    public UsuarioServicoImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario findByUsuario(UsuarioDto usuario) {
        log.info("UsuarioServicoImpl.findByUsuario Usuario:{}", usuario);
        Optional<Usuario> optional = this.repository.findByEmail(usuario.getEmail());
        if (optional.isPresent())
            return optional.get();
        return null;
    }

    @Override
    public boolean validaUsuario(String email, String senha) {

        Usuario user = UsuarioRepository.findByUsuario(email, senha);
        if (user != null && user.getSenha().equals(senha)) {
            return true; // Login válido
        }
        return false; // Login inválido
    }
}

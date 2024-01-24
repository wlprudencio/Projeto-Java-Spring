package biblioteca.projeto.Repositorio;


import biblioteca.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    static Usuario findByUsuario(String email, String senha) {
        return null;
    }

    @Transactional(readOnly = true)
    Optional<Usuario> findByEmail(String email);
}

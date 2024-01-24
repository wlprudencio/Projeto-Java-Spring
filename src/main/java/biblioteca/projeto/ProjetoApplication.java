package biblioteca.projeto;

import biblioteca.projeto.Repositorio.ClienteRepository;
import biblioteca.projeto.Repositorio.LivroRepository;
import biblioteca.projeto.Repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoApplication.class, args);
    }

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private LivroRepository repository1;

}

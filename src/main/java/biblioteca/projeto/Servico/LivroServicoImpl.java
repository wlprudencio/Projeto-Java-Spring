package biblioteca.projeto.Servico;

import biblioteca.projeto.Repositorio.LivroRepository;
import biblioteca.projeto.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServicoImpl implements LivroServico {

    @Autowired
    private LivroRepository repository;


    @Override
    public List<Livro> listarLivros() {
        return null;
    }

    @Override
    public void guardarLivros() {

    }

    @Override
    public Livro guardarLivros(Livro livros) {
        return null;
    }

    @Override
    public Livro obterLivrosPorId(Long id) {
        return null;
    }

    @Override
    public void eliminarLivros() {

    }

    @Override
    public void eliminarlivros(Long id) {

    }

    @Override
    public Object listarTodosOsLivros() {
        return null;
    }
}

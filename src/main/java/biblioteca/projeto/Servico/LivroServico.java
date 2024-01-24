package biblioteca.projeto.Servico;
import biblioteca.projeto.model.Livro;

import java.util.List;

public interface LivroServico {

    public List<Livro> listarLivros();

    void guardarLivros();

    public Livro guardarLivros(Livro livros);

   Livro obterLivrosPorId(Long id);


    void eliminarLivros();

    public void eliminarlivros(Long id);

    Object listarTodosOsLivros();
}

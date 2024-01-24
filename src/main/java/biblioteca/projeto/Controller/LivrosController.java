package biblioteca.projeto.Controller;


import biblioteca.projeto.Servico.LivroServicoImpl;
import biblioteca.projeto.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LivrosController {

    @Autowired
    private LivroServicoImpl servico;

    @GetMapping("/livros")
    public String mostrarFormularioDeRegistroLivro(Model modelo) {
        modelo.addAttribute("livros", servico.listarTodosOsLivros());
        return "listalivro";
    }

    @GetMapping("/livros/cadastro")
    public String novoLivro(Livro livro) {
        return "formLivro";
    }

    @PostMapping("/livros")
    public String guardarLivros(@ModelAttribute("livros") Livro livro) {
        servico.guardarLivros(livro);
        return "redirect:/livros";
    }

    @GetMapping("/livros/{id}")
    public String eliminarLivro(@PathVariable Long id) {
        servico.eliminarlivros(id);
        return "redirect:/livros";
    }
}



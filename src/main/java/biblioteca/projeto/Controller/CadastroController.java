package biblioteca.projeto.Controller;

import biblioteca.projeto.Servico.ClienteServicoImpl;
import biblioteca.projeto.model.Cliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CadastroController {

    @Autowired
    private ClienteServicoImpl servico;

    @GetMapping("/clientes")
    public String mostraFormularioCliente(Model model) {
        model.addAttribute("clientes", servico.listarCliente());
        return "listacliente";
    }

    @GetMapping("/clientes/cadastro")
    public String criarCliente(Cliente cliente) {
        return "formcliente";
    }

    @PostMapping("/clientes")
    public String guardarCliente(@ModelAttribute("clientes") Cliente cliente) {
        servico.guardarCliente(cliente);
        return "redirect:/clientes";

    }
    @PostMapping("/clientes/editar")
    public String obterClientePorId(@PathVariable("id") Long id) {
        servico.obterClientePorId(id);
        return "redirect:/clientes";
    }

    @GetMapping("/clientes/{id}")
    public String eliminarCliente(@PathVariable("id") Long id) {
        servico.eliminarCliente(id);
        return "redirect:/clientes";

    }

}



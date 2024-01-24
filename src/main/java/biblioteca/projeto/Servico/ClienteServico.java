package biblioteca.projeto.Servico;
import biblioteca.projeto.model.Cliente;
import java.util.List;

public interface ClienteServico {

    public List<Cliente> listarCliente();

    void guardarCliente();

    public  Cliente guardarCliente(Cliente cliente);

    Cliente obterClientePorId(Long id);

    void eliminarCliente();

    public void eliminarCliente(Long id);
}

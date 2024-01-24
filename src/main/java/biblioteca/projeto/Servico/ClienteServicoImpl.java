package biblioteca.projeto.Servico;

import biblioteca.projeto.Repositorio.ClienteRepository;
import biblioteca.projeto.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteServicoImpl implements ClienteServico {
    @Autowired
    private ClienteRepository repository;


    @Override
    public List<Cliente> listarCliente() {
        List<Cliente> cliente = repository.findAll();
        return cliente;

    }
    @Override
    public void guardarCliente() {
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return repository.save(cliente);

    }

    @Override
    public Cliente obterClientePorId(Long id) {

        return repository.findById(id).get();
    }

    @Override
    public void eliminarCliente() {

    }

    @Override
    public void eliminarCliente(Long id) {
     repository.deleteById(id);

    }
}


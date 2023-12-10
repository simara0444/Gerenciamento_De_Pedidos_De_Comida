package br.com.projeto.prova.DAO;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO implements IDao<Cliente> {
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    @Override
    public void adicionar(Cliente objeto) {
        listaClientes.add(objeto);
    }

    @Override
    public Cliente buscar(int id) {
        for (Cliente cliente: listaClientes) {
            if (cliente.getId() == id){
                System.out.println("\nCliente encontrado: ");
                System.out.println("Nome : " + cliente.getNome());
                System.out.println("Endereço: " + cliente.getEndereco());
                System.out.println("ID: " + cliente.getId() + "\n");
                return cliente;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> listarTodos() {
        System.out.println(listaClientes + "\n");
        return listaClientes;
    }

    @Override
    public boolean remover(Cliente objeto) {
        return listaClientes.remove(objeto);
    }

    @Override
    public void atualizar(int id, Cliente objeto) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId() == id) {
                listaClientes.set(i, objeto);
                return;
            }
        }
    }
}
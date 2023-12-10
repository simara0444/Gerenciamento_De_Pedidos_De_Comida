package br.com.projeto.prova.DAO;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Model.Cliente;
import br.com.projeto.prova.Model.Entrega;
import br.com.projeto.prova.Model.Pedido;
import java.util.ArrayList;


public class PedidoDAO implements IDao<Pedido> {

    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    @Override
    public void adicionar(Pedido objeto) {
        listaPedidos.add(objeto);
    }

    @Override
    public Pedido buscar(int id) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getIdPedido() == id) {
                System.out.println("\nPedido encontrado: ");
                System.out.println("Valor do pedido : " + pedido.getValorDoPedido());
                System.out.println("Pedido: " + pedido.getPedido());
                System.out.println("ID:  " + pedido.getIdPedido() + "\n");
                return pedido;
            }
        }
        return null;
    }


    @Override
    public ArrayList<Pedido> listarTodos() {
        System.out.println(listaPedidos + "\n");
        return listaPedidos;
    }

    @Override
    public boolean remover(Pedido objeto) {
        return listaPedidos.remove(objeto);
    }

    @Override
    public void atualizar(int id, Pedido objeto) {
        for (int i = 0; i < listaPedidos.size(); i++) {
            if (listaPedidos.get(i).getIdPedido() == id) {
                listaPedidos.set(i, objeto);
                return;
            }
        }
    }
}
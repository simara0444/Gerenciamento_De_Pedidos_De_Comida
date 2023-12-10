package br.com.projeto.prova.DAO;

import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Model.Pagamento;

import java.util.ArrayList;

public class PagamentoDAO implements IDao<Pagamento> {
    ArrayList<Pagamento> listaPagamentos = new ArrayList<>();

    @Override
    public void adicionar(Pagamento objeto) {
        listaPagamentos.add(objeto);
    }

    @Override
    public Pagamento buscar(int id) {
        for (Pagamento pagamento : listaPagamentos) {
            if (pagamento.getIdPagamento()== id) {
                System.out.println("\nPagamento encontrado: ");
                System.out.println("Forma de pagamento: " + pagamento.getFormaDePagamento());
                System.out.println("ID: " + pagamento.getIdPagamento());
                System.out.println("Valor Total Dos Pedidos Do Cliente:  " + pagamento.getValorTotalDosPedidosDoCliente());
                System.out.println("Status pagamento: " + pagamento.getStatusPagamento());
                System.out.println("Número do cartao: " + pagamento.getNumeroDoCartao() + "\n");
                return pagamento;
            }
        }
        return null;
    }


    @Override
    public ArrayList<Pagamento> listarTodos() {
        System.out.println(listaPagamentos + "\n");
        return listaPagamentos;
    }

    @Override
    public boolean remover(Pagamento objeto) {
        return listaPagamentos.remove(objeto);
    }

    @Override
    public void atualizar(int id, Pagamento objeto) {
        for (int i = 0; i < listaPagamentos.size(); i++) {
            if (listaPagamentos.get(i).getIdPagamento() == id) {
                listaPagamentos.set(i, objeto);
                return;
            }
        }
    }
}
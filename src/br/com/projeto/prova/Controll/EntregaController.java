package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IEntregaController;
import br.com.projeto.prova.Exception.*;
import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.EntregaDAO;
import br.com.projeto.prova.Model.Entrega;
import br.com.projeto.prova.Model.Entregador;
import br.com.projeto.prova.Model.Pagamento;

import java.util.ArrayList;

public class EntregaController implements IController<Entrega>, IEntregaController {
    private EntregadorController entregadorController;
    private Pagamento pagamento;
    private IDao<Entrega> dao;

    public EntregaController(EntregadorController entregadorController) {
        this.dao = new EntregaDAO();
        this.entregadorController = entregadorController;

    }

    public void definirPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public void adicionar(Entrega objeto) {
        try {
            Entregador entregador = entregadorController.buscar(objeto.getIdDoEntregadorDaEntrega());

            if (entregador != null) {
                if (pagamento != null && pagamento.getStatusPagamento()) {
                    objeto.setStatusEntrega(true);
                    System.out.println("Entrega cadastrada com sucesso!");
                    System.out.println(objeto.getStatusEntrega());
                    dao.adicionar(objeto);
                } else {
                    throw new PagamentoNaoRealizadoException();
                }
            } else {
                throw new EntregadorNaoEncontradoException();
            }
        } catch (EntregadorNaoEncontradoException | PagamentoNaoRealizadoException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Entrega buscar(int id) {
        Entrega entrega = dao.buscar(id);
        if (entrega == null) {
            try {
                throw new IdNaoExisteException();
            } catch (IdNaoExisteException e) {
                System.out.println(e.getMessage());
            }
        }
        return entrega;
    }

    @Override
    public boolean remover(Entrega objeto) {
        if (dao.buscar(objeto.getIdEntrega()) != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new EntregaNaoEncontradaException();
            } catch (EntregaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    @Override
    public void atualizar(int id, int novoId) {
        Entrega entregaExistente = dao.buscar(id);
        if (entregaExistente != null) {
            try {
                Entrega entregaNova = dao.buscar(novoId);
                if (entregaNova == null || novoId == id) {
                    entregaExistente.setIdEntrega(novoId);
                    dao.atualizar(id, entregaExistente);
                    System.out.println("Entrega atualizada com sucesso!");
                } else {
                    throw new IdJaExistenteException();
                }
            } catch (IdJaExistenteException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new EntregaNaoEncontradaException();
            } catch (EntregaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public ArrayList<Entrega> listarTodos() {
        return dao.listarTodos();
    }
}

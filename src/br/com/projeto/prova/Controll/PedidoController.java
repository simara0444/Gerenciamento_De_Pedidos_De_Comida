package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.PedidoDAO;
import br.com.projeto.prova.Exception.EntregadorNaoEncontradoException;
import br.com.projeto.prova.Exception.IdJaExistenteException;
import br.com.projeto.prova.Exception.IdNaoExisteException;
import br.com.projeto.prova.Exception.PedidoNaoEncontradoException;
import br.com.projeto.prova.Model.Entregador;
import br.com.projeto.prova.Model.Pedido;

import java.util.ArrayList;

public class PedidoController implements IController<Pedido> {

    private IDao<Pedido> dao;

    public PedidoController() {
        this.dao = new PedidoDAO();
    }

    @Override
    public void adicionar(Pedido objeto) {
        try {
            if (dao.buscar(objeto.getIdPedido()) == null) {
                dao.adicionar(objeto);
                System.out.println("Pedido cadastrado com sucesso!");
            } else {
                throw new IdJaExistenteException();
            }
        } catch (IdJaExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Pedido buscar(int id) {
        Pedido pedido = dao.buscar(id);
        if (pedido == null) {
            try {
                throw new IdNaoExisteException();
            } catch (IdNaoExisteException e) {
                System.out.println(e.getMessage());
            }
        }
        return pedido;
    }

    @Override
    public boolean remover(Pedido objeto) {
        if (dao.buscar(objeto.getIdPedido()) != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new PedidoNaoEncontradoException();
            } catch (PedidoNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    //achei melhor fazer o metodo assim
    @Override
    public void atualizar(int id, int novoId) {
        Pedido pedidoExistente = dao.buscar(id);
        if (pedidoExistente != null) {
            try {
                Pedido pedidoNovo = dao.buscar(novoId);
                if (pedidoNovo == null || novoId == id) {
                    pedidoExistente.setIdPedido(novoId);
                    dao.atualizar(id, pedidoExistente);
                    System.out.println("Entregador atualizado com sucesso!");
                } else {
                    throw new IdJaExistenteException();
                }
            } catch (IdJaExistenteException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new PedidoNaoEncontradoException();
            } catch (PedidoNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public ArrayList<Pedido> listarTodos() {
        return dao.listarTodos();
    }
}
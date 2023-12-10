package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.EntregadorDAO;
import br.com.projeto.prova.Exception.EntregadorNaoEncontradoException;
import br.com.projeto.prova.Exception.IdJaExistenteException;
import br.com.projeto.prova.Model.Entregador;
import br.com.projeto.prova.Exception.MenorDeIdadeException;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class EntregadorController implements IController<Entregador> {

    private IDao<Entregador> dao;

    public EntregadorController() {
        this.dao = new EntregadorDAO();
    }

    @Override
    public void adicionar(Entregador objeto) {
        try {
            if (dao.buscar(objeto.getIdEntregador()) == null) {
                if (objeto.getIdade() >= 18) {
                    dao.adicionar(objeto);
                    System.out.println("Entregador cadastrado com sucesso!");
                } else {
                    throw new MenorDeIdadeException();
                }
            } else {
                throw new IdJaExistenteException();
            }
        } catch (IdJaExistenteException | MenorDeIdadeException s) {
            System.out.println(s.getMessage());
        }
    }

    @Override
    public Entregador buscar(int id) {
        Entregador entregador = dao.buscar(id);
        if (entregador == null) {
            try {
                throw new EntregadorNaoEncontradoException();
            } catch (EntregadorNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return entregador;
    }


    @Override
    public boolean remover(Entregador objeto) {
        Entregador entregadorExistente = dao.buscar(objeto.getIdEntregador());
        if (entregadorExistente != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new EntregadorNaoEncontradoException();
            } catch (EntregadorNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    @Override
    public void atualizar(int id, int novoId) {
        Entregador entregadorExistente = dao.buscar(id);
        if (entregadorExistente != null) {
            try {
                Entregador entregadorNovo = dao.buscar(novoId);
                if (entregadorNovo == null || novoId == id) {
                    entregadorExistente.setIdEntregador(novoId);
                    dao.atualizar(id, entregadorExistente);
                    System.out.println("Entregador atualizado com sucesso!");
                } else {
                    throw new IdJaExistenteException();
                }
            } catch (IdJaExistenteException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new EntregadorNaoEncontradoException();
            } catch (EntregadorNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public ArrayList<Entregador> listarTodos() {
        return dao.listarTodos();
    }
}

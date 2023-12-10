package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.AvaliacaoDAO;
import br.com.projeto.prova.Exception.AvaliacaoNaoEncontradaException;
import br.com.projeto.prova.Exception.IdJaExistenteException;
import br.com.projeto.prova.Exception.IdNaoExisteException;
import br.com.projeto.prova.Model.Avaliacao;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class AvaliacaoController implements IController<Avaliacao> {

    private IDao<Avaliacao> dao;

    public AvaliacaoController() {
        this.dao = new AvaliacaoDAO();
    }

    @Override
    public void adicionar(Avaliacao objeto) {
        try {
            if (dao.buscar(objeto.getIdAvaliacao()) == null) {
                dao.adicionar(objeto);
                System.out.println("Avaliação cadastrada com sucesso!");
            } else {
                throw new IdJaExistenteException();
            }
        } catch (IdJaExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Avaliacao buscar(int id) {
        Avaliacao avaliacao = dao.buscar(id);
        if (avaliacao == null) {
            try {
                throw new IdNaoExisteException();
            } catch (IdNaoExisteException e) {
                System.out.println(e.getMessage());
            }
        }
        return avaliacao;
    }

    @Override
    public boolean remover(Avaliacao objeto) {
        Avaliacao avaliacaoExistente = dao.buscar(objeto.getIdAvaliacao());
        if (avaliacaoExistente != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new AvaliacaoNaoEncontradaException();
            } catch (AvaliacaoNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }


    @Override
    public void atualizar(int id, int novoId) {
        Avaliacao avaliacaoExistente = dao.buscar(id);
        if (avaliacaoExistente != null) {
            try {
                Avaliacao novaAvaliacao = dao.buscar(novoId);
                if (novaAvaliacao == null || novoId == id) {
                    avaliacaoExistente.setIdAvaliacao(novoId);
                    dao.atualizar(id, avaliacaoExistente);
                    System.out.println("Avaliação atualizada com sucesso!");
                } else {
                    throw new IdJaExistenteException();
                }
            } catch (IdJaExistenteException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new AvaliacaoNaoEncontradaException();
            } catch (AvaliacaoNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public ArrayList<Avaliacao> listarTodos() {
        return dao.listarTodos();
    }
}


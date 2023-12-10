package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.FuncionarioDAO;
import br.com.projeto.prova.Exception.FuncionarioNaoEncontradoException;
import br.com.projeto.prova.Exception.IdJaExistenteException;
import br.com.projeto.prova.Exception.MenorDeIdadeException;
import br.com.projeto.prova.Model.Funcionario;

import java.util.ArrayList;

public class FuncionarioController implements IController<Funcionario> {
    private IDao<Funcionario> dao;

    public FuncionarioController(){
        this.dao = new FuncionarioDAO();
    }

    @Override
    public void adicionar(Funcionario objeto) {
        try {
            if (dao.buscar(objeto.getIdDoFuncionario()) == null) {
                if (objeto.getIdadeDoFuncionario() >= 18) {
                    dao.adicionar(objeto);
                    System.out.println("Funcionario cadastrado com sucesso!");
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
    public Funcionario buscar(int id) {
        Funcionario funcionario = dao.buscar(id);
        if (funcionario == null) {
            try {
                throw new FuncionarioNaoEncontradoException();
            } catch (FuncionarioNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return funcionario;
    }


    @Override
    public boolean remover(Funcionario objeto) {
        Funcionario funcionarioExistente = dao.buscar(objeto.getIdDoFuncionario());
        if (funcionarioExistente != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new FuncionarioNaoEncontradoException();
            } catch (FuncionarioNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    @Override
    public void atualizar(int id, int novoId) {
        Funcionario funcionarioExistente = dao.buscar(id);
        if (funcionarioExistente != null) {
            try {
                Funcionario novoFuncionario = dao.buscar(novoId);
                if (novoFuncionario == null || novoId == id) {
                    funcionarioExistente.setIdDoFuncionario(novoId);
                    dao.atualizar(id, funcionarioExistente);
                    System.out.println("Entregador atualizado com sucesso!");
                } else {
                    throw new IdJaExistenteException();
                }
            } catch (IdJaExistenteException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new FuncionarioNaoEncontradoException();
            } catch (FuncionarioNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public ArrayList<Funcionario> listarTodos() {
        return dao.listarTodos();
    }
}

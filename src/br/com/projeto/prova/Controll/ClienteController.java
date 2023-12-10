package br.com.projeto.prova.Controll;
import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.ClienteDAO;
import br.com.projeto.prova.Exception.ClienteNaoEncontradoException;
import br.com.projeto.prova.Exception.EntregadorNaoEncontradoException;
import br.com.projeto.prova.Exception.IdJaExistenteException;
import br.com.projeto.prova.Exception.IdNaoExisteException;
import br.com.projeto.prova.Model.Cliente;
import br.com.projeto.prova.Model.Entregador;

import java.util.ArrayList;

public class ClienteController implements IController<Cliente> {

    private IDao<Cliente> dao;

    public ClienteController(){
        this.dao = new ClienteDAO();
    }

    @Override
    public void adicionar(Cliente objeto) {
        try {
            if (dao.buscar(objeto.getId()) == null) {
                dao.adicionar(objeto);
                System.out.println("Cliente cadastrado com sucesso!");
            }
            else {
                throw new IdJaExistenteException();
            }
        } catch (IdJaExistenteException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Cliente buscar ( int id){
        Cliente cliente = dao.buscar(id);
        if (cliente == null) {
            try {
                throw new IdNaoExisteException();
            } catch (IdNaoExisteException e) {
                System.out.println(e.getMessage());
            }
        }
        return cliente;
    }

    @Override
    public boolean remover(Cliente objeto) {
        Cliente clienteExistente = dao.buscar(objeto.getId());
        if (clienteExistente != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new ClienteNaoEncontradoException();
            } catch (ClienteNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    @Override
    public void atualizar(int id, int novoId) {
       Cliente clienteExistente = dao.buscar(id);
        if (clienteExistente != null) {
            try {
                Cliente clienteNovo = dao.buscar(novoId);
                if (clienteNovo == null || novoId == id) {
                    clienteExistente.setId(novoId);
                    dao.atualizar(id, clienteExistente);
                    System.out.println("Cliente atualizado com sucesso!");
                } else {
                    throw new IdJaExistenteException();
                }
            } catch (IdJaExistenteException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new ClienteNaoEncontradoException();
            } catch (ClienteNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public ArrayList<Cliente> listarTodos() {
       return dao.listarTodos();
    }
}
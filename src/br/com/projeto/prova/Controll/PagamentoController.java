package br.com.projeto.prova.Controll;

import br.com.projeto.prova.Contratos.IController;
import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.DAO.PagamentoDAO;
import br.com.projeto.prova.Exception.*;
import br.com.projeto.prova.Model.Cliente;
import br.com.projeto.prova.Model.Pagamento;
import br.com.projeto.prova.Exception.ValorTotalInvalidoException;

import java.util.ArrayList;


import br.com.projeto.prova.Controll.ClienteController; // Importe a classe ClienteController

public class PagamentoController implements IController<Pagamento> {
    private RelacionamentoPedidoClienteController relacionamentoPedidoClienteController;
    private RelacionamentoPagamentoClienteController relacionamentoPagamentoClienteController;
    private IDao<Pagamento> dao;
    private ClienteController clienteController;

    public PagamentoController(RelacionamentoPedidoClienteController relacionamentoPedidoClienteController,
                               RelacionamentoPagamentoClienteController relacionamentoPagamentoClienteController,
                               ClienteController clienteController) {
        this.relacionamentoPedidoClienteController = relacionamentoPedidoClienteController;
        this.dao = new PagamentoDAO();
        this.relacionamentoPagamentoClienteController = relacionamentoPagamentoClienteController;
        this.clienteController = clienteController;
    }

    @Override
    public void adicionar(Pagamento pagamento) {
        int idClienteAssociado = relacionamentoPagamentoClienteController.encontrarClienteAssociadoAoPagamento
                (pagamento.getIdPagamento());
        if (idClienteAssociado != -1) {
            Cliente clienteAssociado = clienteController.buscar(idClienteAssociado);
            if (clienteAssociado != null) {
                double valorTotalPedidosCliente = relacionamentoPedidoClienteController.calcularValorTotalPedidosCliente
                        (clienteAssociado);
                try {
                    if (pagamento.getValorTotalDosPedidosDoCliente() == valorTotalPedidosCliente) {
                        pagamento.setStatusPagamento(true);
                        dao.adicionar(pagamento);
                        System.out.println("Pagamento concluído com sucesso!");
                    } else {
                        throw new ValorTotalInvalidoException();
                    }
                } catch (ValorTotalInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            try {
                throw new PagamentoNaoAssociadoANenhumCliente();
            } catch (PagamentoNaoAssociadoANenhumCliente s) {
                System.out.println(s.getMessage());
            }
        }
    }


    @Override
    public Pagamento buscar(int id) {
        Pagamento pagamento = dao.buscar(id);
        if (pagamento == null) {
            try {
                throw new PagamentoNaoEncontradoException();
            } catch (PagamentoNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return pagamento;
    }

    @Override
    public boolean remover(Pagamento objeto) {
        Pagamento pagamentoExsitente = dao.buscar(objeto.getIdPagamento());
        if (pagamentoExsitente != null) {
            return dao.remover(objeto);
        } else {
            try {
                throw new PagamentoNaoEncontradoException();
            } catch (PagamentoNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    @Override
    public void atualizar(int id, int novoId) {
        Pagamento pagamentoExistente = dao.buscar(id);
        if (pagamentoExistente != null) {
            try {
                Pagamento novoPagamento = dao.buscar(novoId);
                if (novoPagamento == null || novoId == id) {
                    pagamentoExistente.setIdPagamento(novoId);
                    dao.atualizar(id, pagamentoExistente);
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
    public ArrayList<Pagamento> listarTodos() {
        return dao.listarTodos();
    }
}


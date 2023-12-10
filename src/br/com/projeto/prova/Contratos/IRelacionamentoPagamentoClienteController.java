package br.com.projeto.prova.Contratos;

public interface IRelacionamentoPagamentoClienteController {
    public void associarPagamentoCliente(int idPagamento, int idCliente);
    public int encontrarClienteAssociadoAoPagamento(int idPagamento);
}

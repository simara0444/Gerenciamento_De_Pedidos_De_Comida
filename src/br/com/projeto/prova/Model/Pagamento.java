package br.com.projeto.prova.Model;

import br.com.projeto.prova.Controll.PagamentoController;

public class Pagamento {
    private String formaDePagamento;
    private int numeroDoCartao;
    private boolean statusPagamento;
    private double valorTotalDosPedidosDoCliente;
    private int idPagamento;

    public Pagamento(String formaDePagamento, int numeroDoCartao, double valorTotalDosPedidosDoCliente, int idPagamento){
        this.formaDePagamento = formaDePagamento;
        this.numeroDoCartao = numeroDoCartao;
        this.valorTotalDosPedidosDoCliente = valorTotalDosPedidosDoCliente;
        this.idPagamento = idPagamento;
    }
    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    public int getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(int numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    public boolean getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    public double getValorTotalDosPedidosDoCliente() {
        return valorTotalDosPedidosDoCliente;
    }

    public void setValorTotalDosPedidosDoCliente(double valorTotalDosPedidosDoCliente) {
        this.valorTotalDosPedidosDoCliente = valorTotalDosPedidosDoCliente;

    }
    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "formaDePagamento='" + formaDePagamento + '\'' +
                ", numeroDoCartao=" + numeroDoCartao +
                ", statusPagamento=" + statusPagamento +
                ", valorTotalDosPedidosDoCliente=" + valorTotalDosPedidosDoCliente + "R$" +
                ", idPagamento=" + idPagamento +
                "\n}";
    }
}


package br.com.projeto.prova.Model;

public class Pedido {
    private double valorDoPedido;
    private String pedido;
    private int idPedido;
    private double valorTotalPedido;

    public Pedido(String pedido, double valorDoPedido, int idPedido) {
        this.pedido = pedido;
        this.valorDoPedido = valorDoPedido;
        this.idPedido = idPedido;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valorDoPedido=" + valorDoPedido + "R$" +
                ", pedido='" + pedido + '\'' +
                ", idPedido=" + idPedido +
                "\n}";
    }
}



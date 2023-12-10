package br.com.projeto.prova.Contratos;

import br.com.projeto.prova.Model.Cliente;
import br.com.projeto.prova.Model.Pedido;

public interface IRelacionamentoPedidoClienteController {
    void associarPedidoCliente(Cliente cliente, Pedido pedido);
    void exibirPedidosDoCliente(Cliente cliente);
    double calcularValorTotalPedidosCliente(Cliente cliente);
}

package br.com.projeto.prova.Controll;
import br.com.projeto.prova.Contratos.IRelacionamentoPedidoClienteController;
import br.com.projeto.prova.Exception.ClienteNaoEncontradoException;
import br.com.projeto.prova.Exception.PedidoNaoEncontradoException;
import br.com.projeto.prova.Model.Cliente;
import br.com.projeto.prova.Model.Pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelacionamentoPedidoClienteController implements IRelacionamentoPedidoClienteController {
    private Map<Cliente, List<Pedido>> clienteParaPedidos;

    public RelacionamentoPedidoClienteController() {
        clienteParaPedidos = new HashMap<>();
    }

    @Override
    public void associarPedidoCliente(Cliente cliente, Pedido pedido) {
        try {
            if (cliente != null && pedido != null) {
                if (!clienteParaPedidos.containsKey(cliente)) {
                    clienteParaPedidos.put(cliente, new ArrayList<>());
                }
                clienteParaPedidos.get(cliente).add(pedido);
                System.out.println("Pedido adicionado ao cliente: " + cliente.getNome());
            } else {
                throw new ClienteNaoEncontradoException();
            }
        } catch (ClienteNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void exibirPedidosDoCliente(Cliente cliente) {
        try {
            List<Pedido> pedidosCliente = clienteParaPedidos.getOrDefault(cliente, new ArrayList<>());
            if (!pedidosCliente.isEmpty()) {
                System.out.println("\nPedidos do cliente " + cliente.getNome() + ":");
                for (Pedido pedido : pedidosCliente) {
                    System.out.println(pedido);
                }
            } else {
                throw new PedidoNaoEncontradoException();
            }
        } catch (PedidoNaoEncontradoException s){
            System.out.println(s.getMessage());
        }
    }

    @Override
    public double calcularValorTotalPedidosCliente(Cliente cliente) {
        List<Pedido> pedidosCliente = clienteParaPedidos.getOrDefault(cliente, new ArrayList<>());
        double valorTotal = 0.0;

        for (Pedido pedido : pedidosCliente) {
            valorTotal += pedido.getValorDoPedido();
        }
        System.out.println("Valor total dos pedidos do cliente " + cliente.getNome() + ": " + valorTotal + "R$");
        return valorTotal;
    }


}
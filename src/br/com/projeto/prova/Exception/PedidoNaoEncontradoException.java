package br.com.projeto.prova.Exception;

public class PedidoNaoEncontradoException extends Exception {
    public PedidoNaoEncontradoException(){
        super("ERROR > pedido não encontrado");
    }
}

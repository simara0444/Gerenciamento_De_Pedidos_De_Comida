package br.com.projeto.prova.Exception;

public class PagamentoNaoRealizadoException extends Exception {
    public PagamentoNaoRealizadoException(){
        super("ERROR > Não é possivel cadastrar a entrega, pois o pagamento não foi realizado!");
    }
}

package br.com.projeto.prova.Exception;

public class PagamentoNaoEncontradoException extends Exception {
    public PagamentoNaoEncontradoException (){
        super("ERROR > Pagamento não encontrado! ");
    }
}

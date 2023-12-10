package br.com.projeto.prova.Exception;

public class PagamentoNaoAssociadoANenhumCliente extends Exception {
    public PagamentoNaoAssociadoANenhumCliente(){
        super("ERROR > Pagamento não está associado a nenhum cliente.");
    }
}

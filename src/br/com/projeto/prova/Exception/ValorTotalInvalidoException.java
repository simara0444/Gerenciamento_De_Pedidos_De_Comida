package br.com.projeto.prova.Exception;

public class ValorTotalInvalidoException extends Exception{
    public ValorTotalInvalidoException(){
        super("ERROR > O valor total do pagamento está incorreto.");
    }
}

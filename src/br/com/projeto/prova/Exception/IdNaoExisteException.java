package br.com.projeto.prova.Exception;

public class IdNaoExisteException extends Exception {
    public IdNaoExisteException(){
            super("ERROR > ID inexistente\n");
    }
}

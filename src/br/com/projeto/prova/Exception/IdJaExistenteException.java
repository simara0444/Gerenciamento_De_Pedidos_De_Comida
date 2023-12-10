package br.com.projeto.prova.Exception;

public class IdJaExistenteException extends Exception {

    public IdJaExistenteException(){
        super("ERROR > Esse id já existe! \n");
    }
}

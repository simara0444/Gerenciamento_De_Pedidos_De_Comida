package br.com.projeto.prova.Exception;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super("ERROR > cliente não encontrado");
    }
}

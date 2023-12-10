package br.com.projeto.prova.Exception;

public class FuncionarioNaoEncontradoException extends Exception {
    public FuncionarioNaoEncontradoException(){
        super("ERROR > Funcionário não encontrado! ");
    }
}

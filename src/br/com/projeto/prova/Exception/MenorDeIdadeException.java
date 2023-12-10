package br.com.projeto.prova.Exception;

public class MenorDeIdadeException extends Exception {
    public MenorDeIdadeException (){
        super("ERROR > não pode ter menos de 18 anos! ");
    }
}

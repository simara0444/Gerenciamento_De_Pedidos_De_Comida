package br.com.projeto.prova.Contratos;

import java.util.ArrayList;

public interface IController<T> {
    void adicionar(T objeto);
    T buscar(int id);
    boolean remover(T objeto);
    public void atualizar(int id, int novoId);
    ArrayList<T> listarTodos();
}

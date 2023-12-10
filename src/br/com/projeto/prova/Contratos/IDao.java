package br.com.projeto.prova.Contratos;

import java.util.ArrayList;

public interface IDao<T> {
    //Create, Read, Update, Delete
    //Criar, buscar, Atualizar, Excluir, Listar
    void adicionar(T objeto);
    T buscar(int id);
    ArrayList<T> listarTodos();
    boolean remover(T objeto);
    void atualizar(int id, T objeto);
}
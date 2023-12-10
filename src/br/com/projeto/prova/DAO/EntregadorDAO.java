package br.com.projeto.prova.DAO;

import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Exception.EntregadorNaoEncontradoException;
import br.com.projeto.prova.Model.Entregador;
import br.com.projeto.prova.Model.Pedido;

import java.util.ArrayList;

public class EntregadorDAO implements IDao<Entregador> {
    ArrayList<Entregador> listaEntregadores = new ArrayList<>();

    public void adicionar(Entregador objeto) {
        listaEntregadores.add(objeto);
    }

    @Override
    public Entregador buscar(int id) {
        for (Entregador entregador : listaEntregadores) {
            if (entregador.getIdEntregador() == id) {
                System.out.println("\nEntregador encontrado: ");
                System.out.println("Nome : " + entregador.getNomeDoEntregador());
                System.out.println("ID: " + entregador.getIdEntregador());
                System.out.println("Idade : " + entregador.getIdade());
                System.out.println("Cor da moto: " + entregador.getCorDaMoto() + "\n");
                return entregador;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Entregador> listarTodos() {
        System.out.println(listaEntregadores + "\n");
        return listaEntregadores;
    }

    @Override
    public boolean remover(Entregador entregador) {
        return listaEntregadores.remove(entregador);
    }

    @Override
    public void atualizar(int id, Entregador objeto) {
        for (int i = 0; i < listaEntregadores.size(); i++) {
            if (listaEntregadores.get(i).getIdEntregador() == id) {
                listaEntregadores.set(i, objeto);
                return;
            }
        }
    }
}
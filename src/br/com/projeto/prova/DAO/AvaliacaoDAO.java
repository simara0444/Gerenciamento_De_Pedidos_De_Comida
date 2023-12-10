package br.com.projeto.prova.DAO;

import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Model.Avaliacao;

import java.util.ArrayList;

public class AvaliacaoDAO implements IDao<Avaliacao> {

    ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<>();


    @Override
    public void adicionar(Avaliacao objeto) {
        listaAvaliacoes.add(objeto);
    }

    @Override
    public Avaliacao buscar(int id) {
        for (Avaliacao avaliacao : listaAvaliacoes) {
            if (avaliacao.getIdAvaliacao() == id) {
                System.out.println("\nAvaliacao encontrada: ");
                System.out.println("Comentário : " + avaliacao.getComentario());
                System.out.println("ID: " + avaliacao.getIdAvaliacao());
                System.out.println("Nota: " + avaliacao.getNota() + "\n");
                return avaliacao;
            }
        }
        return null;
    }


    @Override
    public ArrayList<Avaliacao> listarTodos() {
        System.out.println(listaAvaliacoes + "\n");
        return null;
    }

    @Override
    public boolean remover(Avaliacao objeto) {
        listaAvaliacoes.remove(objeto);
        return false;
    }

    @Override
    public void atualizar(int id, Avaliacao objeto) {
        for (int i = 0; i < listaAvaliacoes.size(); i++) {
            if (listaAvaliacoes.get(i).getIdAvaliacao() == id) {
                listaAvaliacoes.set(i, objeto);
                return;
            }
        }
    }
}



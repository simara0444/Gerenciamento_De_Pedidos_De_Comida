package br.com.projeto.prova.DAO;

import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Model.Cliente;
import br.com.projeto.prova.Model.Entrega;

import java.util.ArrayList;

public class EntregaDAO implements IDao<Entrega> {

    ArrayList<Entrega> listaDeEntregas = new ArrayList<>();

    @Override
    public void adicionar(Entrega objeto) {
        listaDeEntregas.add(objeto);
    }

    @Override
    public Entrega buscar(int id) {
        for (Entrega entrega : listaDeEntregas) {
            if (entrega.getIdEntrega() == id) {
                System.out.println("\nEntrega encontrada: ");
                System.out.println("Tipo de entrega : " + entrega.getTipoDeEntrega());
                System.out.println("Status entrega: " + entrega.getStatusEntrega());
                System.out.println("ID: " + entrega.getIdEntrega() + "\n");
                return entrega;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Entrega> listarTodos() {
        System.out.println(listaDeEntregas + "\n");
        return listaDeEntregas;
    }
    

    @Override
    public boolean remover(Entrega objeto) {
        return listaDeEntregas.remove(objeto);
    }

    @Override
    public void atualizar(int id, Entrega objeto) {
        for (int i = 0; i < listaDeEntregas.size(); i++) {
            if (listaDeEntregas.get(i).getIdEntrega() == id) {
                listaDeEntregas.set(i, objeto);
                return;
            }
        }
    }
}
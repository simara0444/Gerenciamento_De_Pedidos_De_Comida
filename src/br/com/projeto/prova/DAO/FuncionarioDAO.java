package br.com.projeto.prova.DAO;

import br.com.projeto.prova.Contratos.IDao;
import br.com.projeto.prova.Model.Funcionario;

import java.util.ArrayList;

public class FuncionarioDAO implements IDao<Funcionario> {
    ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    @Override
    public void adicionar(Funcionario objeto) {
        listaFuncionarios.add(objeto);
    }

    @Override
    public Funcionario buscar(int id) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getIdDoFuncionario() == id){
                System.out.println("\nFuncionário encontrado: ");
                System.out.println("Nome: " + funcionario.getNomeDoFuncionario());
                System.out.println("Idade: " + funcionario.getIdadeDoFuncionario());
                System.out.println("ID: " + funcionario.getIdDoFuncionario() + "\n");
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Funcionario> listarTodos() {
        System.out.println(listaFuncionarios + "\n");
        return listaFuncionarios;
    }

    @Override
    public boolean remover(Funcionario objeto) {
        return listaFuncionarios.remove(objeto);
    }

    @Override
    public void atualizar(int id, Funcionario objeto) {
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.get(i).getIdDoFuncionario() == id) {
                listaFuncionarios.set(i, objeto);
                return;
            }
        }
    }
}

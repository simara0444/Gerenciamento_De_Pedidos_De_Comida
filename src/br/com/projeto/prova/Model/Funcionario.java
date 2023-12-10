package br.com.projeto.prova.Model;

public class Funcionario {
    String nomeDoFuncionario;
    int idDoFuncionario;
    int idadeDoFuncionario;

    public Funcionario(String nomeDoFuncionario, int idDoFuncionario, int idadeDoFuncionario){
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.idDoFuncionario = idDoFuncionario;
        this.idadeDoFuncionario = idadeDoFuncionario;
    }
    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public int getIdDoFuncionario() {
        return idDoFuncionario;
    }

    public void setIdDoFuncionario(int idDoFuncionario) {
        this.idDoFuncionario = idDoFuncionario;
    }

    public int getIdadeDoFuncionario() {
        return idadeDoFuncionario;
    }

    public void setIdadeDoFuncionario(int idadeDoFuncionario) {
        this.idadeDoFuncionario = idadeDoFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeDoFuncionario='" + nomeDoFuncionario + '\'' +
                ", idDoFuncionario=" + idDoFuncionario +
                ", idadeDoFuncionario=" + idadeDoFuncionario +
                '}';
    }
}

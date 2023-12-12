package br.com.projeto.prova.Model;

public class Entregador {
    private String nomeDoEntregador;
    private int idEntregador;
    private int idade;
    private String corDaMoto;

    public Entregador(String nomeDoEntregador, int idEntregador, int idade, String corDaMoto) {
        this.nomeDoEntregador = nomeDoEntregador;
        this.idEntregador = idEntregador;
        this.idade = idade;
        this.corDaMoto = corDaMoto;
    }
    public String getNomeDoEntregador() {
        return nomeDoEntregador;
    }

    public void setNomeDoEntregador(String nomeDoEntregador) {
        this.nomeDoEntregador = nomeDoEntregador;
    }

    public int getIdEntregador() {
        return idEntregador;
    }

    public void setIdEntregador(int idEntregador) {
        this.idEntregador = idEntregador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDaMoto() {
        return corDaMoto;
    }

    public void setCorDaMoto(String corDaMoto) {
        this.corDaMoto = corDaMoto;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "nomeDoEntregador= '" + nomeDoEntregador + '\'' +
                ", idEntregador= " + idEntregador +
                ", idade= " + idade +
                ", corDaMoto= '" + corDaMoto + '\'' + " }\n";
    }
}

package br.com.projeto.prova.Model;

public class Cliente {
    private String nome;
    private String endereco;
    private int id;

    public Cliente(String nome, String endereco, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public  void setNome(String nome){
        this.nome= nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome= '" + nome + '\'' +
                ", endereco= '" + endereco + '\'' +
                ", id= " + id + " }\n";
    }
}

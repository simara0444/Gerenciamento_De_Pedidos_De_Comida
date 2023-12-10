package br.com.projeto.prova.Model;

import br.com.projeto.prova.Contratos.IRestaurante;

public class Restaurante implements IRestaurante {

    private String nomeDoRestaurante;
    private String tipoDeCozinha;
    private String abreFinaisDeSemana;
    private String turno;

    public Restaurante(String nomeDoRestaurante, String tipoDeCozinha, String abreFinaisDeSemana, String turno) {
        this.nomeDoRestaurante = nomeDoRestaurante;
        this.tipoDeCozinha = tipoDeCozinha;
        this.abreFinaisDeSemana = abreFinaisDeSemana;
        this.turno = turno;
    }

    public String getTipoDeCozinha() {
        return tipoDeCozinha;
    }

    public void setTipoDeCozinha(String tipoDeCozinha) {
        this.tipoDeCozinha = tipoDeCozinha;
    }


    public String getNomeDoRestaurante() {
        return nomeDoRestaurante;
    }

    public void setNomeDoRestaurante(String nomeDoRestaurante) {
        this.nomeDoRestaurante = nomeDoRestaurante;
    }
    public String getAbreFinaisDeSemana() {
        return abreFinaisDeSemana;
    }

    public void setAbreFinaisDeSemana(String abreFinaisDeSemana) {
        this.abreFinaisDeSemana = abreFinaisDeSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void ExibirRestaurante(){
        System.out.println("\nNome do restaurante: " + getNomeDoRestaurante() );
        System.out.println("Tipo de cozinha: " + getTipoDeCozinha());
        System.out.println("Abre finais de semana: " + getAbreFinaisDeSemana());
        System.out.println("Turno:" + getTurno() + "\n");
    }
}

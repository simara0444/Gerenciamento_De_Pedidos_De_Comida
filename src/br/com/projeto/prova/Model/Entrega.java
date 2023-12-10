package br.com.projeto.prova.Model;

public class Entrega {
    private boolean statusEntrega;
    private int idDoEntregadorDaEntrega;
    private String tipoDeEntrega;
    private int IdEntrega;

    public Entrega( int idDoEntregadorDaEntrega, String tipoDeEntrega, int IdEntrega) {
        this.tipoDeEntrega = tipoDeEntrega;
        this.idDoEntregadorDaEntrega = idDoEntregadorDaEntrega;
        this.IdEntrega = IdEntrega;
    }

    public int getIdDoEntregadorDaEntrega() {
        return idDoEntregadorDaEntrega;
    }

    public void setIdDoEntregadorDaEntrega(int idDoEntregadorDaEntrega) {
        this.idDoEntregadorDaEntrega = idDoEntregadorDaEntrega;
    }
    public boolean getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(boolean statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
    public String getTipoDeEntrega() {
        return tipoDeEntrega;
    }

    public void setTipoDeEntrega(String tipoDeEntrega) {
        this.tipoDeEntrega = tipoDeEntrega;
    }

    public int getIdEntrega() {
        return IdEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        IdEntrega = idEntrega;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "statusEntrega=" + statusEntrega +
                ", ID do entregador=" + idDoEntregadorDaEntrega +
                ", tipoDeEntrega='" + tipoDeEntrega + '\'' +
                ", IdEntrega=" + IdEntrega +
                "\n}";
    }
}


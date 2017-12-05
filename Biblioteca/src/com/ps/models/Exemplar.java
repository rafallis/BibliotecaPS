package com.ps.models;
public class Exemplar {

    private int idExemplar;

    private Impresso impresso;

    private boolean disponivel;

    public int getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(int idExemplar) {
        this.idExemplar = idExemplar;
    }

    public Impresso getImpresso() {
        return impresso;
    }

    public void setImpresso(Impresso impresso) {
        this.impresso = impresso;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}

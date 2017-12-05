package com.ps.models;
public class Exemplar {

    private int idExemplar;

    private ImpressoService impresso;

    private boolean disponivel;

    public int getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(int idExemplar) {
        this.idExemplar = idExemplar;
    }

    public ImpressoService getImpresso() {
        return impresso;
    }

    public void setImpresso(ImpressoService impresso) {
        this.impresso = impresso;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}

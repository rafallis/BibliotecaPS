package com.ps.models;
public class Exemplar {

    private int idExemplar;

    private String local;

    private Impresso impresso;

    public Exemplar(int idExemplar, String local, Impresso impresso) {
        this.idExemplar = idExemplar;
        this.local = local;
        this.impresso = impresso;
    }
    
    public int getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(int idExemplar) {
        this.idExemplar = idExemplar;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Impresso getImpresso() {
        return impresso;
    }

    public void setImpresso(Impresso impresso) {
        this.impresso = impresso;
    }

}

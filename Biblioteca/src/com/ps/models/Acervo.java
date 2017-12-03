package com.ps.models;

import java.util.LinkedList;

public class Acervo {

    private LinkedList<Impresso> impressos;

    private Impresso impresso;

    private int idAcervo;

    public void addImpresso(Impresso impresso) {

    }

    public LinkedList<Impresso> getImpressos() {
        return impressos;
    }

    public void setImpressos(LinkedList<Impresso> impressos) {
        this.impressos = impressos;
    }

    public Impresso getImpresso() {
        return impresso;
    }

    public void setImpresso(Impresso impresso) {
        this.impresso = impresso;
    }

    public int getIdAcervo() {
        return idAcervo;
    }

    public void setIdAcervo(int idAcervo) {
        this.idAcervo = idAcervo;
    }

}

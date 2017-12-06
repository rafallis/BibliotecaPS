package com.ps.models;

import java.util.Date;

public class ExemplarService {

    private int idExemplar;

    private ImpressoService impresso;

    private boolean disponivel;

    public ExemplarService(int id, String titulo, String editora, Date datapublicacao, String autores, int tipo) {
        
    }
    
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

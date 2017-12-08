package com.ps.models.services;

import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class AcervoService {

    private ImpressoService impresso;
    
    private int idAcervo;
        
    public void removeImpresso(int id) {
        // buscar no banco
        // retirar impresso
    }

    public ImpressoService getImpresso() {
        return impresso;
    }

    public void setImpresso(ImpressoService impresso) {
        this.impresso = impresso;
    }

    public int getIdAcervo() {
        return idAcervo;
    }

    public void setIdAcervo(int idAcervo) {
        this.idAcervo = idAcervo;
    }
}

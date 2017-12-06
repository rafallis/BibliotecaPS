package com.ps.models;

import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class AcervoService {

    private LinkedList<ImpressoService> impressos;

    private ImpressoService impresso;
    
    private int idAcervo;
  

    public void addImpresso(int id, String titulo, String editora, Date datapublicacao, String autores, int tipo) {
        
    }
        
    public void removeImpresso(int id) {
        // buscar no banco
        // retirar impresso
    }

    public LinkedList<ImpressoService> getImpressos() {
        return impressos;
    }

    public void setImpressos(LinkedList<ImpressoService> impressos) {
        this.impressos = impressos;
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

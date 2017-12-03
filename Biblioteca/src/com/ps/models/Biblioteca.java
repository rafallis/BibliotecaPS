package com.ps.models;

import java.util.LinkedList;

public class Biblioteca {

    private String campus;

    private String endereco;

    private LinkedList<Acervo> acervos;

    public void addAcervo(Acervo acervo) {

    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LinkedList<Acervo> getAcervos() {
        return acervos;
    }

    public void setAcervos(LinkedList<Acervo> acervos) {
        this.acervos = acervos;
    }

    
}

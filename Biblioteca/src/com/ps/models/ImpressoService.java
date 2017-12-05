package com.ps.models;

import java.util.Date;
import java.util.LinkedList;

public abstract class ImpressoService {

    private int id;

    private String titulo;

    private String editora;

    private Date dataPublicacao;
    
    private String autor;

    private LinkedList<Exemplar> exemplares;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LinkedList<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(LinkedList<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }  
}

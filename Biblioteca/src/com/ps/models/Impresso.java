package com.ps.models;

import java.util.Date;
import java.util.LinkedList;

public abstract class Impresso {

    private int id;

    private String titulo;

    private Editora editora;

    private Date dataPublicacao;
    
    private LinkedList<Autor> autores;

    private LinkedList<Exemplar> exemplares;

    /******************* Métodos ******************/
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public LinkedList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(LinkedList<Autor> autores) {
        this.autores = autores;
    }

    public LinkedList<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(LinkedList<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public void addExemplar(Exemplar exemplar) {
        this.exemplares.add(exemplar);
    }

    public int quantidadeExemplares(LinkedList<Exemplar> exemplares) {
        return exemplares.size();
    }
}

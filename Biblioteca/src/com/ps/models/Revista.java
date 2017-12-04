package com.ps.models;

import java.util.Date;
import java.util.LinkedList;

public class Revista extends Impresso {

    private int id;

    private String titulo;

    private Editora editora;

    private Date dataPublicacao;
    
    private LinkedList<Autor> autores;
    
    public Revista(int id, String titulo, Editora editora, Date datapublicacao, LinkedList<Autor> autores, LinkedList<Exemplar> exemplares) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        //this.dataPublicacao = Date
        this.autores = autores;
    }
}

package com.ps.models;

import java.util.Date;
import java.util.LinkedList;

public class Livro extends Impresso {
    
    private int id;

    private String titulo;

    private Editora editora;

    private Date dataPublicacao;
    
    private LinkedList<Autor> autores;
    
    public Livro(int id, String titulo, Editora editora, Date datapublicacao, LinkedList<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        //this.dataPublicacao = Date
        this.autores = autores;
    }

}

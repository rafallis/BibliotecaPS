package com.ps.models;

import java.util.Date;

public class ImpressoService {

    private int id;

    private String titulo;

    private String editora;

    private Date dataPublicacao;
    
    private String autores;
    
    private String tipo;
    
    public ImpressoService(String titulo) {
        this.titulo = titulo;
    }
    
    public ImpressoService(String titulo, String autores) {
        this.titulo = titulo;
        this.autores = autores;
    }
    
    public ImpressoService(int id, String titulo, String editora, Date dataPublicacao, String autores, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.autores = autores;
        this.tipo = tipo;
        
        //ImpressoData dbImpresso = new ImpressoData(this);
        
        //chamar ImpressoData
    }
    
    public String buscaImpresso(String nome) {
        String impresso = null;
        
        
        
        return impresso;
    }
    
    public String buscaImpresso(String nome, String autor) {
        String impresso = null;
        
        ImpressoData id = new ImpressoData();
        
        impresso = id.buscaImpresso(this);
        
        return impresso;
    }

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
        return autores;
    }

    public void setAutor(String autor) {
        this.autores = autor;
    }
}

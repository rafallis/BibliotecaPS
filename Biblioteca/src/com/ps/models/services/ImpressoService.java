package com.ps.models.services;

import com.ps.models.datas.ImpressoData;
import java.util.Date;
import java.sql.ResultSet;

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
    
    public ImpressoService(int id) {
        this.id = id;
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
    
    public ResultSet buscaImpresso(String nome) {
        ResultSet impresso = null;
        
        ImpressoData id = new ImpressoData();
        
        impresso = id.buscaImpresso(this);
        
        return impresso;
    }
    
    public ResultSet buscaImpresso(String nome, String autor) {
        ResultSet impresso;
        
        ImpressoData id = new ImpressoData();
        
        impresso = id.buscaImpresso(this);
        
        return impresso;
    }
    
    public ResultSet buscaImpressoDevolver(int idImpresso, int matricula) {
        ResultSet impresso;
        
        ImpressoData id = new ImpressoData();
        
        impresso = id.buscaImpressoDevolver(this, matricula);
        
        return impresso;
    }
    
    public boolean emprestaImpresso(int idImpresso, int matricula) {
        ImpressoData id = new ImpressoData();
        
        if(id.verificaDisponibilidadeImpresso(this)) {
            id.atualizaDisponibilidade(this);
            id.insereRetirada(this, matricula);
            return true;
        } else {
            return false;
        }
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

    public ResultSet buscaImpressoDevolver(int matricula) {
        ImpressoData impressoData = new ImpressoData();
        return impressoData.buscaImpressoDevolver(this, matricula);
    }
}

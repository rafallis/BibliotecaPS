/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.controllers;

import com.ps.models.ImpressoService;
import java.util.Date;
import java.sql.ResultSet;

/**
 *
 * @author rafallis
 */
public class ImpressoController {
    
    public void adicionaImpresso(int id, String titulo, String editora, Date dataPublicacao, String autores, String tipo) {
        //verificações de consistência
        ImpressoService impresso = new ImpressoService(id, titulo, editora, dataPublicacao, autores, tipo);
        //trocar dados com o banco
    }
    
    public ResultSet buscaImpresso(String nome) {
        ImpressoService is = new ImpressoService(nome);
        ResultSet livro = is.buscaImpresso(nome);
        
        return livro;
    }
    
    public ResultSet buscaImpresso(String nome, String autor) {
        ImpressoService is = new ImpressoService(autor, autor);
        ResultSet livro = is.buscaImpresso(nome, autor);
        
        return livro;
    }
}

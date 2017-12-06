/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.models;

/**
 *
 * @author rafallis
 */
public class ImpressoData {
    public ImpressoData(ImpressoService impresso){
        //ENVIAR AO BANCO DE DADOS ESTA COISA MARAVILHOSA ABAIXO;
        insertInDataBase(impresso);
        
        
    }
    
    public void insertInDataBase(ImpressoService impresso){
        //USAR SQL E BLABLABLA
        impresso.getAutor();
        impresso.getDataPublicacao();
        impresso.getEditora();
        impresso.getId();
        impresso.getTitulo();
    }
}

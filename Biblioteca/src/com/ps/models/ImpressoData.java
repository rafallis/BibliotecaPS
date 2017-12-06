/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.models;

import java.sql.*;

/**
 *
 * @author rafallis
 */
public class ImpressoData {
    
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    public void insertInDataBase(ImpressoService impresso){
        //USAR SQL E BLABLABLA
        impresso.getAutor();
        impresso.getDataPublicacao();
        impresso.getEditora();
        impresso.getId();
        impresso.getTitulo();
    }
    
    public String buscaImpresso(ImpressoService IS) {
        String livro="", autor="", disponibilidade="";
        
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            // buscar aqui
            String query = "SELECT * FROM Impresso";
            rs = st.executeQuery(query);
            
            System.out.println("Pesquisando impresso...");
            while(rs.next()) {
                livro = rs.getString("Título");
                autor = rs.getString("");
                disponibilidade = rs.getString("");
                
                if(livro.equals(IS.getTitulo())) break;
            }
            
            String result = livro + ":" + autor + ":" + disponibilidade;
            return result;
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return "";
    }
}

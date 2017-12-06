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
    
    public ResultSet buscaImpresso(ImpressoService IS) {
        
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            // alterar pesquisa no banco
            String query = "SELECT * FROM Impresso NATURAL JOIN Exemplar WHERE Título='" + IS.getTitulo() + "'";
            rs = st.executeQuery(query);
            
            System.out.println("Pesquisando impresso...");
            
            return rs;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
}

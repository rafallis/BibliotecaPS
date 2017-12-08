/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author elrafa
 */
public class RetiradaData {
    
    private Connection conn;
    private Statement st;
    private ResultSet rs;
        
    public ResultSet buscaImpresso(Login login) {
        
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            // alterar pesquisa no banco
            String query = "SELECT * FROM Impresso NATURAL JOIN Exemplar WHERE Título like '%" + "" + "%'";
            rs = st.executeQuery(query);
            
            System.out.println("Pesquisando impresso...");
            
            return rs;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
}

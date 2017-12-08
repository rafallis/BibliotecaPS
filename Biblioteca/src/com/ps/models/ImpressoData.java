/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.models;

import java.sql.*;
import java.text.SimpleDateFormat;

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
            String query = "SELECT * FROM Impresso NATURAL JOIN Exemplar WHERE Título like '%" + IS.getTitulo() + "%'";
            rs = st.executeQuery(query);
            
            System.out.println("Pesquisando impresso...");
            
            return rs;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
    
    public boolean verificaDisponibilidadeImpresso(ImpressoService IS) {
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            String query = "SELECT disponivel FROM Exemplar WHERE idExemplar=" +IS.getId();
            System.out.println(query);
            
            rs = st.executeQuery(query);
            rs.next();
            
            System.out.println("Verificando disponibilidade...");
            
            if(Integer.parseInt(rs.getString("disponivel"))==1) {
                return true;
            } else {
                return false;
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return false;
    }
    
    public boolean atualizaDisponibilidade(ImpressoService IS) {
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            String query = "UPDATE Exemplar SET disponivel = 0 WHERE idExemplar='" +IS.getId()+ "'";
            int t = st.executeUpdate(query);
            System.out.println("Atualizando disponibilidade do impresso...");
            System.out.println(t);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean insereRetirada(ImpressoService IS, int matricula) {
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            Date data = new Date(System.currentTimeMillis());
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
            formatador.format( data );
            
            String query = "INSERT INTO Retirada (Matrícula, idExemplar, DataRetirada, Devolvido) VALUES\n" +
"("+matricula+", "+IS.getId()+",'"+data+"', 0)";
            int t = st.executeUpdate(query);
            System.out.println("Inserindo em retirada...");
            System.out.println(t);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}

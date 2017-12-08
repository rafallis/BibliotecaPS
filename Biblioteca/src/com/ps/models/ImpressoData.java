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
    
    public ResultSet buscaImpressoDevolver(ImpressoService IS, int matricula) {
        
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            System.out.println("Pesquisando impressos para devovler...");
            
            String query = "SELECT * FROM Retirada WHERE Matrícula='" +matricula+ "' AND Devolvido='0'";
            rs = st.executeQuery(query);
            
            return rs;
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return null;
    }
    
    public boolean devolveImpresso(ImpressoService IS) {
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            Date data = new Date(System.currentTimeMillis());
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
            formatador.format( data );
            
            System.out.println("Atualizando disponibilidade do impresso...");
            String query = "UPDATE Exemplar SET disponivel = 1 WHERE idExemplar='" +IS.getId()+ "'";
            st.executeUpdate(query);
            
            String query1 = "UPDATE Retirada SET Devolvido=1 WHERE idRetirada=ID_DA_RETIRADA";
            st.executeUpdate(query1);
            
            String query2 = "UPDATE Retirada SET DataDevolucao= '2000-11-01' WHERE idRetirada=ID_DA_RETIRADA";
            st.executeUpdate(query2);
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean verificaDisponibilidadeImpresso(ImpressoService IS) {
        try {
            conn = DBConnect.getInstance().getConnection();
            st = conn.createStatement();
            
            System.out.println("Verificando disponibilidade...");
            
            String query = "SELECT disponivel FROM Exemplar WHERE idExemplar=" +IS.getId();
            System.out.println(query);
            
            rs = st.executeQuery(query);
            rs.next();
            
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
            
            System.out.println("Atualizando disponibilidade do impresso...");
            
            String query = "UPDATE Exemplar SET disponivel = 0 WHERE idExemplar='" +IS.getId()+ "'";
            int t = st.executeUpdate(query);
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
            
            System.out.println("Inserindo em retirada...");
            String query = "INSERT INTO Retirada (Matrícula, idExemplar, DataRetirada, Devolvido) VALUES\n" +
"("+matricula+", "+IS.getId()+",'"+data+"', 0)";
            int t = st.executeUpdate(query);
            System.out.println(t);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}

package com.ps.models;

import java.sql.*;

public class DBConnect {

    private static Connection connection;
    //private static Statement st;
    //private static ResultSet rs;
    
    /*
    public DBConnect() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","password");

            st = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    */
    public static Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","password");
            } catch (SQLException e) {
                System.out.println("Não foi possível conectar ao banco de dados.");
            }
        }
        return connection;
    }
    /*
    public void getTestData() {
        try {

            String query = "SELECT * FROM teste";
            rs = st.executeQuery(query);

            System.out.println("Mostrando dados no banco.....");
            while(rs.next()) {
                String name = rs.getString("nome");
                String age = rs.getString("idade");
                System.out.println("Nome: "+name+" Idade: "+age);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    */
}

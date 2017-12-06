package com.ps.models;

import java.sql.*;

public class DBConnect {

    private static DBConnect instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/biblioteca";
    private String username = "root";
    private String password = "password";
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
    private DBConnect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possível conectar ao banco de dados -> " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static DBConnect getInstance() throws SQLException {
        if(instance == null) {
            instance = new DBConnect();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnect();
        }
        
        return instance;
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

package biblioteca;

import java.sql.*;

public class DBConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnect() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","password");

            st = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

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
}

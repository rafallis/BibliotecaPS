
package biblioteca;

import java.util.LinkedList;

public class Biblioteca {

    private String campus;
    private String endereco;
    private LinkedList<Acervo> acervos;

    public static void main(String[] args) {


        DBConnect connect = new DBConnect();

        connect.getTestData();

    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

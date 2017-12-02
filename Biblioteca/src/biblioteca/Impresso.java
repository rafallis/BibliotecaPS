package biblioteca;

import java.util.Date;
import java.util.LinkedList;

public class Impresso {

    private int id;
    private String titulo;
    private Editora editora;
    private Date dataPublicacao;
    private LinkedList<Autor> autores;
    private LinkedList<Exemplar> exemplares;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}

package biblioteca;

import java.util.Date;
import java.util.LinkedList;

public abstract class Impresso {

	private int id;

	private String titulo;

	private Editora editora;

	private Date dataPublicacao;

	private LinkedList<Autor> autores;

	private LinkedList<Exemplar> exemplares;

	public void addExemplar(Exemplar exemplar) {

	}

}

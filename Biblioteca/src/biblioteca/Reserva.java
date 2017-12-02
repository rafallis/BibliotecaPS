package biblioteca;

import java.util.Date;
import java.util.Queue;

public class Reserva {

    private int idReserva;
    private Exemplar exemplar;
    private Cliente pessoa;
    private Queue<Date> dataReserva;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Cliente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa) {
        this.pessoa = pessoa;
    }

    public Queue<Date> getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Queue<Date> dataReserva) {
        this.dataReserva = dataReserva;
    }
}

package com.ps.models;

import java.util.Date;

public class Retirada {

    private int idRetirada;

    private ExemplarService exemplar;

    private Date dataRetirada;

    private Date dataDevolucao;

    public int getIdRetirada() {
        return idRetirada;
    }

    public void setIdRetirada(int idRetirada) {
        this.idRetirada = idRetirada;
    }

    public ExemplarService getExemplar() {
        return exemplar;
    }

    public void setExemplar(ExemplarService exemplar) {
        this.exemplar = exemplar;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}

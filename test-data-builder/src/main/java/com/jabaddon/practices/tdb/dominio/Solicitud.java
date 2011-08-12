package com.jabaddon.practices.tdb.dominio;

import java.util.Date;

public class Solicitud {
    private Date fechaLevantamiento;
    private Cliente cliente;

    public Solicitud(Date fechaLevantamiento, Cliente cliente) {
        this.fechaLevantamiento = fechaLevantamiento;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

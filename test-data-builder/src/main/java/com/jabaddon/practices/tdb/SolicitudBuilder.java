package com.jabaddon.practices.tdb;

import com.jabaddon.practices.tdb.dominio.Cliente;
import com.jabaddon.practices.tdb.dominio.Solicitud;

import java.util.Date;

public class SolicitudBuilder {
    private Date fechaLevantamiento;
    private Cliente cliente;

    public SolicitudBuilder withFechaLevantamiento(Date fecha) {
        this.fechaLevantamiento = fecha;
        return this;
    }

    public SolicitudBuilder withCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public SolicitudBuilder con(ClienteBuilder clienteBuilder) {
        this.cliente = clienteBuilder.build();
        return this;
    }

    public SolicitudBuilder levantadaElDia(Date fecha) {
        this.fechaLevantamiento = fecha;
        return this;
    }

    public Solicitud build() {
        Solicitud solicitud = new Solicitud(this.fechaLevantamiento, this.cliente);
        return solicitud;
    }

    public static SolicitudBuilder unaSolicitud() {
        return new SolicitudBuilder();
    }
}

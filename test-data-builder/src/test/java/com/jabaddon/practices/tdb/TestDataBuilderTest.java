package com.jabaddon.practices.tdb;

import com.jabaddon.practices.tdb.dominio.Cliente;
import com.jabaddon.practices.tdb.dominio.Solicitud;
import org.junit.Test;

import java.util.Date;

import static com.jabaddon.practices.tdb.ClienteBuilder.unCliente;
import static com.jabaddon.practices.tdb.SolicitudBuilder.unaSolicitud;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class TestDataBuilderTest {

    @Test
    public void crearUnaSolicitudSinTdb() {
        Solicitud solicitud = new Solicitud(new Date(), new Cliente("Rafael", "Gutierrez"));
        assertThat(solicitud.getCliente(), is(notNullValue()));
    }

    @Test
    public void crearUnaSolicitudConTdb() {
        Solicitud solicitud = new SolicitudBuilder()
                .withFechaLevantamiento(new Date())
                .withCliente(new Cliente("Rafael", "Gutierrez"))
                .build();
        assertThat(solicitud.getCliente(), is(notNullValue()));
    }

    @Test
    public void crearUnaSolicitudConTdbInterfaceFluida() {
        Solicitud solicitud = unaSolicitud()
                .con(unCliente()
                        .conNombre("Rafael", "Gutierrez"))
                .levantadaElDia(new Date()).build();
        assertThat(solicitud.getCliente(), is(notNullValue()));
    }
}

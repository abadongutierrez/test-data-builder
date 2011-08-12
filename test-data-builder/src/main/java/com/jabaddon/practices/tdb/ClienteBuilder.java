package com.jabaddon.practices.tdb;

import com.jabaddon.practices.tdb.dominio.Cliente;

public class ClienteBuilder {
    private String nombre;
    private String apellido;

    public ClienteBuilder conNombre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        return this;
    }

    public Cliente build() {
        Cliente cliente = new Cliente(this.nombre, this.apellido);
        return cliente;
    }

    public static ClienteBuilder unCliente() {
        return new ClienteBuilder();
    }
}

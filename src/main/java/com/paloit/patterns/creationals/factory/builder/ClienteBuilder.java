package com.paloit.patterns.creationals.factory.builder;

public class ClienteBuilder {

    private Cliente cliente;

    public ClienteBuilder(
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String fechaNacimiento
    ) {
        cliente = new Cliente(
                nombre,
                apellidoPaterno,
                apellidoMaterno,
                fechaNacimiento
        );
    }

    public static ClienteBuilder bilder() {
        return new ClienteBuilder("Federico", "Farias", "Sanchez", "02/03/1990");
    }

    public ClienteBuilder nombre(String nombre) {
        cliente.setNombre(nombre);
        return this;
    }

    public Cliente build() {
        return this.cliente;
    }

}

package com.paloit.patterns.creationals.factory.builder;

import org.junit.jupiter.api.Test;

public class ClienteBuilderTest {

    @Test
    public void builderTest() {
        ClienteBuilder builder = ClienteBuilder.bilder();
        Cliente cliente = builder
                .nombre("AlgunCliente")
                .build();
        System.out.println(cliente);
    }

}
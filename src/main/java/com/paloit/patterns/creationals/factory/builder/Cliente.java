package com.paloit.patterns.creationals.factory.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String fechaNacimiento;

}

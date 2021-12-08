package com.paloit.patterns.creationals.factory.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CotizacionInfo {

    private String titulo;

    private String descripcion;

    private Double total;

}

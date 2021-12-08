package com.paloit.patterns.creationals.factory.factorymethod.impl;

import com.paloit.patterns.creationals.factory.factorymethod.ContratanteInfo;
import com.paloit.patterns.creationals.factory.factorymethod.Reportador;
import com.paloit.patterns.creationals.factory.factorymethod.Producto;

import java.util.List;

public abstract class AbstractCotizador implements Reportador {

    /**
     * Método plantilla, pues la lógica de éste método se aplica indistintamente
     * del tipo de cotizador.
     */
    @Override
    public void generarReporte(ContratanteInfo contratante) {
        // TODO: Procesos comunes a cualquier cotizador.
        System.out.println("Procesando solicitud de impresion.");
    }

    public abstract List<Producto> obtenerProveedores();

}

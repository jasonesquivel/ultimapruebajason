/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Clases.EmpleadoProduccion;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class empleadoproduccion implements IOperaciones {
    ArrayList <EmpleadoProduccion> lista = new ArrayList();
    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoProduccion) registro);
    }

    @Override
    public Object mostrarRegistros(Object registro) {
        System.out.println(registro);
        System.out.println();
        return null;
    }
    
}

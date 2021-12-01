/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Clases.EmpleadoOficina;
import java.util.ArrayList;



/**
 *
 * @author D
 */
public class empleadooficina implements IOperaciones{  
    ArrayList<EmpleadoOficina> lista = new ArrayList();
    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoOficina) registro);
    }
    @Override
    public Object mostrarRegistros(Object registro) {
        System.out.println(registro);
        System.out.println();
        return null;
       
    }

}

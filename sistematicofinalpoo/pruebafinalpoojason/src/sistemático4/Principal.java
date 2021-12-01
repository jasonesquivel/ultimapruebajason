/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemático4;

import Clases.EmpleadoOficina;
import Clases.EmpleadoProduccion;
import Dao.empleadooficina;
import Dao.empleadoproduccion;

/**
 *
 * @author kwzz1
 */
public class Principal {

     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        EmpleadoOficina empleado1 = new EmpleadoOficina( 1, " giancarlo ", " medrano ", 750.40, 2);
        EmpleadoOficina empleado2 = new EmpleadoOficina( 2, " dylan ", " emilio ", 50.80, 0.2);
        EmpleadoOficina empleado3 = new EmpleadoOficina( 3, "elgya ", " rivera ", 290.80, 10.8);
        
        empleadooficina Empleados_Oficina = new empleadooficina();
        
        Empleados_Oficina.mostrarRegistros(empleado1);
        Empleados_Oficina.mostrarRegistros(empleado2);
        Empleados_Oficina.mostrarRegistros(empleado3);
        
        EmpleadoProduccion empleado01 = new EmpleadoProduccion( 1, " ofelio ", " armando ", 100.00, 12, 60);
        EmpleadoProduccion empleado02 = new EmpleadoProduccion( 2, " lucia ", " Mariam ", 4000.00, 22, 6000);
        EmpleadoProduccion empleado03 = new EmpleadoProduccion( 3, " con yuca ", " chingaste ", 1200.00, 30, 400);
         
        empleadoproduccion Empleados_Produccion = new empleadoproduccion();
        
        Empleados_Produccion.mostrarRegistros(empleado01);
        Empleados_Produccion.mostrarRegistros(empleado02);
        Empleados_Produccion.mostrarRegistros(empleado03);
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author nanohp
 */
public class EjemploJDBCMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setControlador(controlador);
        System.runFinalizersOnExit(true);
        vista.arranca();
    }
}

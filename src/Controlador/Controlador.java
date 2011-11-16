/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nanohp
 */
public class Controlador implements ActionListener {

    Vista vista;
    Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae);
        if (ae.getActionCommand().equals("Consulta General")) {

           modelo.inicializaModeloDesdeBD();


        }

    }
}

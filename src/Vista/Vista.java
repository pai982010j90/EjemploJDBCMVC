/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author nanohp
 */
public class Vista {

    private Controlador controlador;
    
    private JFrame f;
    private JMenuBar barraMenu;
    private JMenu menuOperaciones;
    private JMenuItem itemMenuConsulta;

    public Vista() {
        f = new JFrame("Ejemplo simple para JDBC en MVC");

        menuOperaciones = new JMenu("Operaciones");
        itemMenuConsulta = new JMenuItem("Consulta General");

        menuOperaciones.add(itemMenuConsulta);

        barraMenu = new JMenuBar();
        barraMenu.add(menuOperaciones);
        f.setJMenuBar(barraMenu);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void arranca() {
        f.pack();
        f.setVisible(true);
    }
    
    public void  setControlador(Controlador controlador){
        this.controlador = controlador;
        itemMenuConsulta.addActionListener(controlador);
    }
}

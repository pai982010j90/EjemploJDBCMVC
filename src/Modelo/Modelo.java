/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nanohp
 */
public class Modelo {

    List tabla1 = new ArrayList();
    List<Persona> listaPersonas = new ArrayList<Persona>();
    Connection conn;

    public Modelo() {
        String url = "jdbc:mysql://localhost/Simple";
        String userName = "simple";
        String password = "simple";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Coneccion a BD establecida");
        } catch (SQLException ex1) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (IllegalAccessException ex2) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex2);
        } catch (InstantiationException ex3) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex3);
        } catch (ClassNotFoundException ex3) {
            System.err.println("ClassNotFoundException");
        } catch (Exception ex4) {
            System.err.println("Exception");
        }

    }

    public void inicializaModeloDesdeBD() {
        inicializaTabla1();
        inicializaPersonas();


    }

    private void inicializaTabla1() {
        Statement s;
        try {
            s = conn.createStatement();

            String query = "SELECT * FROM Tabla1";
            System.err.println(query);
            s.executeQuery(query);
            ResultSet rs = s.getResultSet();

            int campoEntero;
            String campoTexto;
            float campoFloat;


            while (rs.next()) {
                campoEntero = rs.getInt("campoEntero");
                campoTexto = rs.getString("campoTexto");
                campoFloat = rs.getFloat("campoFloat");
                System.out.println(campoEntero + "," + campoTexto + "," + campoFloat);
                tabla1.add(new FilaTabla1(campoEntero, campoTexto, campoFloat));
            }
        } catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void inicializaPersonas() {
        Statement s;
        try {
            s = conn.createStatement();

            String query = "SELECT * FROM Persona";
            System.err.println(query);
            s.executeQuery(query);
            ResultSet rs = s.getResultSet();

            int dni;
            String nombre;


            while (rs.next()) {
                dni = rs.getInt("dni");
                nombre = rs.getString("nombre");
                System.out.println(dni + "," + nombre);
                tabla1.add(new Persona(dni, nombre));
            }
        } catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

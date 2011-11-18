/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author nanohp
 */
public class Persona {

    private int dni;
    private String nombre;
    List<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    public void addEvaluacion(Evaluacion ev){
        evaluaciones.add(ev);
    }
    
    
}

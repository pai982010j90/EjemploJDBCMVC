package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Curso {

    private int numeroExpediente;
    private String nombreCurso;
    private Date fechaComienzo;
    private int horas;
    List<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();

    /**
     * 
     * @param numeroExpediente
     * @param nombreCurso
     * @param fechaComienzo
     * @param horas
     */
    public Curso(int numeroExpediente, String nombreCurso, Date fechaComienzo, int horas) {
        this.numeroExpediente = numeroExpediente;
        this.nombreCurso = nombreCurso;
        this.fechaComienzo = fechaComienzo;
        this.horas = horas;


    }

    public void inicializaEvaluacionesDesdeBD(Connection conn) {
        Statement s;
        try {
            s = conn.createStatement();

            String query = "SELECT * FROM Evaluacion where numExpedienteCurso=" + numeroExpediente;
            System.err.println(query);
            s.executeQuery(query);
            ResultSet rs = s.getResultSet();

            int numExpedienteCurso;
            int dniPersona;
            float puntuacion;
            Date fecha;


            while (rs.next()) {
                numExpedienteCurso = rs.getInt("numExpedienteCurso");
                dniPersona = rs.getInt("dniPersona");
                puntuacion = rs.getFloat("puntuacion");
                fecha = rs.getDate("fecha");

                System.out.println(numeroExpediente + "," + dniPersona + "," + puntuacion + ", " + fecha);
                evaluaciones.add(new Evaluacion(numExpedienteCurso, dniPersona, fecha, puntuacion));

            }
        } catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date getFechaComienzo() {
        return this.fechaComienzo;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }
    
    public void addEvaluacion(Evaluacion ev){
        evaluaciones.add(ev);
    }
}
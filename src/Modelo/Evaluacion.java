package Modelo;

import java.util.Date;

public class Evaluacion {

    private Date fecha;
    private float puntuacion;
    private int numExpedienteCurso;
    private int dniPersona;
    private Persona persona;
    private Curso curso;

    public Evaluacion(int numExpedienteCurso, int dniPersona, Date fecha, float puntuacion) {

        this.numExpedienteCurso = numExpedienteCurso;
        this.dniPersona = dniPersona;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    /**
     * 
     * @param curso
     * @param persona
     * @param fecha
     * @param puntuacion
     */
    public Evaluacion(Curso curso, Persona persona, Date fecha, float puntuacion) {
        this.curso = curso;
        this.persona = persona;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }
}
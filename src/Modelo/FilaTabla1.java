/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nanohp
 */
public class FilaTabla1 {

    private int campoEntero;
    private String campoTexto;
    private float campoFloat;

    public FilaTabla1(int campoEntero, String campoTexto, float campoFloat) {
        this.campoEntero = campoEntero;
        this.campoTexto = campoTexto;
        this.campoFloat = campoFloat;
    }

    public int getCampoEntero() {
        return campoEntero;
    }

    public void setCampoEntero(int campoEntero) {
        this.campoEntero = campoEntero;
    }

    public float getCampoFloat() {
        return campoFloat;
    }

    public void setCampoFloat(float campoFloat) {
        this.campoFloat = campoFloat;
    }

    public String getCampoTexto() {
        return campoTexto;
    }

    public void setCampoTexto(String campoTexto) {
        this.campoTexto = campoTexto;
    }
}

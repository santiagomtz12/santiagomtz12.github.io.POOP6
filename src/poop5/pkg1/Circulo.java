/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5.pkg1;
/**
 * Clase Circulo 
 * @author santi
 */

public class Circulo {
    
    static double PI = Math.PI;
    private String color;
    private float radio;
    
    public Circulo() {
    }
    /**
     * Constructor circulo
     * @param radio variable tipo flotante
     */

    public Circulo(float radio) {
        this.radio = radio;
    }
    /**
     * get PI
     * @return variable contenida en la biblioteca math 
     */
    public static double getPI() {
        return PI;
    }
    /**
     * set Pi
     * @param PI 
     */
    public static void setPI(double PI) {
        Circulo.PI = PI;
    }
    /**
     * get Color
     * @return color de nuestro cirulo
     */
    public String getColor() {
        return color;
    }
    /**
     * set color
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * get Radio
     * @return el radio de nuestro ciruclo tipo flotante
     */
    public float getRadio() {
        return radio;
    }
    /**
     * set Radio
     * @param radio 
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    /**
     * metodo toString
     * @return datos asignados a nuestra clase circulo
     */
    @Override
    public String toString() {
        return "Circulo{" + "color=" + color + ", radio=" + radio + '}';
    }
    /**
     * Metodo perimetro
     * @return perimetro de nuestro circulo tipo flotante
     */
    float perimetro(){
        return (float) (2*PI*radio);
    }
    /**
     * metodo area
     * @return area de nuestro ciruclo tipo flotante
     */
    float area(){
        return (float)(PI*radio*radio);
    }
}


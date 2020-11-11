/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5.pkg1;
/**
 * Clase Fecha
 * @author santi
 */

class fecha {
    private int dia;
    private int mes;
    private int anio;

    public fecha() {
    }
    /**
     * Constructor fecha
     * @param dia de nacimiento tipo entero
     * @param mes tipo entero
     * @param anio tipo entero
     */

    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * get Dia 
     * @return el dia de nacimiento
     */
    public int getDia() {
        return dia;
    }
    /**
     * set Dia
     * @param dia 
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * get Mes
     * @return el mes de nacimiento tipo entero 
     */
    public int getMes() {
        return mes;
    }
    /**
     * set Mes 
     * @param mes 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * get Año
     * @return año de nacimiento tipo entero
     */
    public int getAnio() {
        return anio;
    }
    /**
     * set año
     * @param anio 
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Metodo toString 
     * @return tdos nuestros datos tipo enteros
     */
    @Override
    public String toString() {
        return "fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + anio + '}';
    }
    
    
}

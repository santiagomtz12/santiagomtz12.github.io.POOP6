/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5.pkg1;

/**
 * Esta es la clase Persona a la cual le asignaremos algunos datos personales
 * @author santi
 */

public class Persona {
        private String persona;
        private String apellido;
        private fecha fechaNacimiento; // creamos clase fecha que el mismo netbeans construye

    public Persona() { //generamos constructor vacio
        
    }
    /**
     * 
     * @param persona este es el atributo al cual le asignaremos un nombre
     * @param apellido este atributo ira el apellido de la personsa
     * @param fechaNacimiento aqui va la fecha dia-mes-año
     */

    public Persona(String persona, String apellido, fecha fechaNacimiento) { // generamos un onstrcutor con todos los atributos
        this.persona = persona;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * constructor donde solo recibe al nombre y apellido de nuestra persona
     * @param persona nombre de la persona
     * @param apellido apellido de la persona
     */

    public Persona(String persona, String apellido) {
        this.persona = persona;
        this.apellido = apellido;
        this.fechaNacimiento = new fecha(5, 7 , 1999); 
    }
    
    /**
     *get Nombre
     * @return nombre de la persona
     */
    public String getPersona() {
        return persona;
    }
    /**
     * set Nombre
     * @param persona nombre
     */
    public void setPersona(String persona) {
        this.persona = persona;
    }
    /**
     * getApellido
     * @return el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * set Apellido
     * @param apellido  
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * get FechaNacimiento. Metodo de tipo persona
     * @return fecha de nacimiento
     */
    public fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Metodo tooString
     * @return los datos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
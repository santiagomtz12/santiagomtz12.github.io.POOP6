/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5.pkg1;

/**
 * Clase telefono
 * @author santi
 */

public class Telefono {
    private boolean Encendido;
    private float bateria;
    private String Marca;
    private String modelo;
    private boolean Silencio;
    private boolean baterias;
    private int modo;
    
    public Telefono() {
        this.Encendido = false;
        this.bateria = 0.0f;
        this.baterias = false;
        this.Marca = "Steren";
        this.modelo = "0K0_20p1";
        this.modo = 1;
    }
    /**
     * Constructor telefono, recibe 2 parametros
     * @param Marca Marca de la cual es el telefono
     * @param modelo Modelo telefono
     */

    public Telefono(String Marca, String modelo) {
        this.Marca = Marca;
        this.modelo = modelo;
    }
    /**
     * get Modelo
     * @return el mismo modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * set Modelo
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * is Encendido
     * @return si el telefono esta o no encendido
     */

    public boolean isEncendido() {
        return Encendido;
    }
    /**
     * set Encendido
     * @param Encendido 
     */

    public void setEncendido(boolean Encendido) {
        this.Encendido = Encendido;
    }
    /**
     * get Bateria
     * @return 
     */
    public float getBateria() {
        return bateria;
    }
    /**
     * set Bateria
     * @param bateria 
     */
    public void setBateria(float bateria) {
        this.bateria = bateria;
    }
    /**
     * get Marca tipo string
     * @return 
     */
    public String getMarca() {
        return Marca;
    }
    /**
     * set Marca tipo void
     * @param Marca 
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    /**
     * is Silencio
     * @return si el telefono se encuentra en modo silencio
     */
    public boolean isSilencio() {
        return Silencio;
    }
    /**
     * set Silencio
     * @param Silencio 
     */
    public void setSilencio(boolean Silencio) {
        this.Silencio = Silencio;
    }
    /**
     * is Baterias 
     * @return el porcentaje de baterias de nuestro telefono
     */
    public boolean isBaterias() {
        return baterias;
    }
    /**
     * set Baterias
     * @param baterias  
     */

    public void setBaterias(boolean baterias) {
        this.baterias = baterias;
    }
    /**
     * get Modo
     * @return  el modo en el cual se encuentra nuestro telefono
     */
    public int getModo() {
        return modo;
    }
    /**
     * set Modo
     * @param modo 
     */
    public void setModo(int modo) {
        this.modo = modo;
    }
    /**
     * Metodo toString 
     * @return todos nuestros datos del objeto telefono
     */
    @Override
    public String toString() {
        return "Telefono{" + "Encendido=" + Encendido + ", bateria=" + bateria + ", Marca=" + Marca + ", modelo=" + modelo + ", Silencio=" + Silencio + ", baterias=" + baterias + ", modo=" + modo + '}';
    }
    /**
     * Metodo cambiarBaterias
     * al telefono se le asigna un nuevo porcentaja de baterias
     */
    void CambiarBaterias(){
        baterias = true;
        bateria = 100.0f;
        System.out.println("Se a cambiado las baterias");
    } 
    /**
     * Cargar
     * Este metodo carga nuestro telefono en un 50 por ciento
     */
    void Cargar(){
        Encendido = true;
        bateria -= 50.0f;
        System.out.println("La bateria actual de tu celular es: "+bateria );
        
    }
    /**
     * Metodo apagar
     * el telefono se apagara 
     */
    void Apagar(){
        Encendido = false;
        System.out.println("Has apagado tu celular");
    }
    /**
     * Metodo cambiar Modo
     * El telefono cuenta con dos modos, modo 1 vibracion y modo 2 silencio, si el telefono 
     * esta en uno de estos modos, cambia al otro
     */
    void CambiarModo(){
        if( modo == 1){
            System.out.println("Se a cambiado al modo 2 vibracion");
            modo = 2;
        }else{
            System.out.println("Se a cambiado al modo 1 sonido");
            modo = 1;
        }
    }
    
}

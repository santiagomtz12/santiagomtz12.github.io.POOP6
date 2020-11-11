/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5.pkg1;

/**
 *
 * @author santi
 */
public class POOP51 {

    public static void main(String[] args) {
        /**
         * Creacion de nuevos objetos de la clase Circulo
         */
        Circulo c1 = new Circulo ();
        Circulo c2 = new Circulo ((float)6.0);
            System.out.println(c1.toString()); // imprime 0.0 porque cuando creamos un objeto nuevo se inicializa en cero o en null
            System.out.println(c2.toString());
            
            System.out.println("Perimetro circulo 1= "+ c1.perimetro());
            System.out.println("El area del c1= "+c1.area());
            
            System.out.println("Perimetro circulo 1= "+ c2.perimetro());
            System.out.println("El area del c1= "+c2.area());
            
            System.out.println("---------------------------------");
            c1.setRadio(9);
            System.out.println("Perimetro circulo 1= "+ c1.perimetro());
            System.out.println("El area del c1= "+c1.area());
            
            System.out.println("----------------------");
            /**
             * Crear nuevas personas, asignandole nombre, apellido y fecha de nacimiento
             */
            Persona amigo = new Persona ();
            fecha fechaNacimiento = new fecha (3, 4, 2003);
            amigo.setPersona("Santiago");
            amigo.setApellido("Martinez Arrona");
            amigo.setFechaNacimiento(fechaNacimiento);
            System.out.println("info de mi amigo"+ amigo); // puede llevar el metodo .toString o no
            
            Persona amigo2 = new Persona ("Oswaldo", "Martinez", new fecha (20, 4, 1993)); //enviamos fecha directamente que almacena 
            System.out.println("Info amigo= "+amigo2);
            
            Persona amigo3 = new Persona("Diego", "Rodrigo Peralta");
            System.out.println("Info amigo= "+amigo3);
            
            // transoformar lo que nosotros hemos creado
            //con gets, sets,  
            System.out.println("--------------------------------------------");
            /**
             * creacion de telefonos en donde asignamos bateria, modo, marca y modelo
             */
            Telefono tel1= new Telefono();
            System.out.println("Los datos de nuestro telefono son: "+tel1.toString());
            
            System.out.println("Las baterias de nuestro telefono contienen un "+tel1.getBateria()+" de carga ");
            tel1.CambiarBaterias();
            System.out.println("Las baterias de nuestro telefono contienen un "+tel1.getBateria()+" de carga ");
            
            System.out.println("Las baterias de nuestro telefono contienen un "+tel1.getBateria()+" de carga ");
            tel1.Cargar();
            
            System.out.println("¿El celular se encuentra encendido?"+tel1.isEncendido());
            tel1.Apagar();
            System.out.println("El modo en el que se encuetra el telefono es: "+tel1.getModo());
            tel1.CambiarModo();
            
    }
    
}


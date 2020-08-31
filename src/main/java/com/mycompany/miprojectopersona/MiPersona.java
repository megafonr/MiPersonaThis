/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprojectopersona;

/**
 *   Uso de clase Persona
 * @author Rolo
 */
public class MiPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Persona tu, el, nos;
        Persona yo = new Persona();
        tu = new Persona(28330776);
        el = new Persona(19440321,"pepe");
        nos = new Persona(19440321,"Pepe", "Lopez");
        yo.Sexo = 'M';
        yo.Apellido="Martinez";
        System.out.println("El Sexo y Apellido de yo: " + yo.Sexo + " " + yo.Apellido );
        System.out.println("El dni y nombre de el: " + el.DNI + " " + el.Nombre );
        
    }
}

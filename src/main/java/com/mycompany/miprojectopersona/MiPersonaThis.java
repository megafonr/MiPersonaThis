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
public class MiPersonaThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        PersonaThis tu, el, nos;
        PersonaThis yo = new PersonaThis();
        tu = new PersonaThis(28330776);
        el = new PersonaThis(21440725,"Jose");
        nos = new PersonaThis(19440321,"Pepe", "Lopez");
        yo.Sexo = 'M';
        yo.Apellido="Martinez";
        nos.mostrarSP();   
        yo.mostrar1P(yo.Sexo);
        el.mostrarCP(el.DNI,el.Nombre,el.Apellido,el.Sexo);
        System.out.println(" --------------------------- ");
        System.out.println("El Sexo y Apellido de yo: " + yo.Sexo + " " + yo.Apellido );
        System.out.println("El dni y nombre de el: " + el.DNI + " " + el.Nombre );
        System.out.println("Documento de Yo: " + yo.DNI);

    }
}

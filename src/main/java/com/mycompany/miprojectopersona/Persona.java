/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprojectopersona;

/**
 *
 * @author Rolo
 */
public class Persona {
  
    int DNI;
    String Nombre;
    String Apellido;
    char Sexo;
	
    
//Constructor explic.
    public Persona(){
    System.out.println("Creando Persona....");
    }
//fin
    
    public Persona(int DNI){
     this();
     System.out.println("Documento de Persona: " + DNI);
    }
     public Persona(int DNI, String Nombre){
     this();
     System.out.println("Documento y Nombre de Persona: " + DNI + ", " + Nombre);
    }
     public Persona(int DNI, String Nombre, String Apellido){
     this();
     System.out.println("Documento, Nombre y Apellido de Persona: " + DNI + ", " + Nombre + ", " + Apellido);
    }    
    
}

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
public class PersonaThis {
  
    int DNI;
    String Nombre, Apellido;
    char Sexo;
	
    
//Constructor 
    public PersonaThis(){
        this.DNI=0;
        this.Nombre="";
        this.Apellido="";
        this.Sexo='X';
        
        System.out.println("Creando Persona....");
    }
//fin
    
    public PersonaThis(int DNI){
     this();
     this.DNI= DNI;
    }
    
    public PersonaThis(int DNI, String Nombre){
     this(DNI);
     this.Nombre=Nombre;
     }
    public PersonaThis(int DNI, String Nombre, String Apellido){
     this(DNI,Nombre);
     this.Apellido=Apellido;
    }    
    public void mostrarSP(){
      System.out.println("  ----- mostrarSP  -----  " );
      System.out.println("El DNI y Apellido es: " + this.DNI + " " + this.Apellido );
      System.out.println("El Nombre y Sexo es: " + this.Nombre + " " + this.Sexo );

    }
    
    public void mostrar1P(char Sexo){
      System.out.println("  ----- mostrarS1  -----  " );
      System.out.println("El DNI y Apellido es: " + this.DNI + " " + this.Apellido );
      System.out.println("El Nombre y Sexo es: " + this.Nombre + " " + Sexo );

    }

    public void mostrarCP(int dni, String Nombre, String Apellido, char Sexo){
      System.out.println("  ----- mostrarCP  -----  " );
      System.out.println("El DNI y Apellido es: " + dni + " " + Apellido );
      System.out.println("El Nombre y Sexo es: " + Nombre + " " + Sexo );

    }
            
}

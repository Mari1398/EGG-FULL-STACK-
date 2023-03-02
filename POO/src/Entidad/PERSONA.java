/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author AADEMINCOL
 */
public class PERSONA {

    
    // getter
    public int getEdad() {
        return edad;
    }
    
    //atributos
    public String nombre;
    public int numIde;
    public int edad;
    // constructor
    public PERSONA (){
    
}
    // setter
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //constructor
    public PERSONA (String nombre, int numIde, int edad){
        this.nombre="mar";
        this.numIde=numIde;
        this.edad= edad;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumIde() {
        return numIde;
    }
   
}

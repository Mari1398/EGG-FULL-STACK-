/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio14Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
      
      String [] vectorp = new String [5];
      
      
        for (int i = 0; i < 5; i++) {
            
            vectorp [i]= leer.nextLine();
            System.out.println(vectorp[i]);
            
        }
    }
    
}

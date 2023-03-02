
package ManosALaObra;


import java.util.Scanner;

public class Ejercicio11ntrovs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       String cadena = "Ayer, lunes, salimos a las once y 10";
       cadena= leer.nextLine(); 
        System.out.println(cadena);       
      
       
      String cadenafinal= intercambio(cadena);
      
        System.out.println(cadenafinal);
      
    }
    

    public static String intercambio(String cadena) {
        
        String newcadena="h", conca="";
           
        int longi = cadena.length();
       System.out.println(longi);
       boolean bandera=true;
        
       do {
        for (int i = 0; i < longi; i++) {
            
            
            newcadena=cadena.substring(i, i+1);
            newcadena=newcadena.toLowerCase();
            
            if (newcadena.equalsIgnoreCase(".")) {
                bandera=false;  
                break;
            }
           // System.out.println(bandera);
            //System.out.println(newcadena);
           
          
                switch (newcadena){
                
                case "a":
                    newcadena="@";
                 break;
                  case "e":
                    newcadena="#";
                 break;
                  case "i":
                    newcadena="$";
                 break;
                  case "o":
                    newcadena="%";
                 break;
                 
                  case "u":
                      newcadena="*";
                 break;
                
                         }  
            conca=conca.concat(newcadena);
           
       
            //System.out.println(bandera); 
            
      
        }
            //System.out.println(newcadena);
          return conca;
        } while (bandera=true);
        
        
    
}
}
        
  
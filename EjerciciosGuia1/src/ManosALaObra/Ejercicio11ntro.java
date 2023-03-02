
package ManosALaObra;


import java.util.Scanner;

public class Ejercicio11ntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String cadena, newcadena=" ";
            
        cadena=leer.nextLine();
        System.out.println(cadena);
       intercambio(cadena, newcadena);
    }
    

    public static void intercambio( String cadena, String newcadena) {
        
        System.out.println(cadena);
        
        int longi = cadena.length();
        System.out.println(longi);
   
        for (int i = 0; i < longi; i++) {
            
            
            newcadena=cadena.substring(i, i+1);
            newcadena=newcadena.toLowerCase();
            
            
           
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
            
             System.out.print(newcadena);  
        
            }
       
            System.out.println(" "); 
   
        }
}
        
       




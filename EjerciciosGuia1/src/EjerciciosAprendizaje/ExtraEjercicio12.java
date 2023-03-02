
package EjerciciosAprendizaje;

public class ExtraEjercicio12 {

    public static void main(String[] args) {

        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10; j++) {
                for (int k = 0; k <10; k++) {
                    String x=String.valueOf(i);
                    String y=String.valueOf(j);
                    String z=String.valueOf(k);
                     if (x.equals("3")){
                         x="E";
                                           }
                     if (y.equals("3")){
                         y="E";
                                            }
                     if (z.equals("3")){
                         z="E";
                                            }
                    
                        System.out.println(x+"-"+y+"-"+z);
                    
                }
   
            }
 
        }
       
    }
    
}

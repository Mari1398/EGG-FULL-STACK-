package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio21 {
    /*
    Ejercicio 21 buscar matriz P en matriz M una sola vez.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [][] M= new int [10][10];
        int [][] P= new int [3][3];
        int [] V =new int[18];
        boolean bandera= false, vec=false, bandera2=false;
        //for (int[] M1 : M) {
        for (int  i= 0; i < M[0].length; i++){
            System.out.println("Ingrese la fila número "+ (i+1)+ " Para la matriz M");
            for (int j = 0; j < M[0].length; j++) {
                //M1[j] = (int) (Math.random()*10);
                M[i][j]=leer.nextInt();
                //M1[j]=leer.nextInt();
            }
        }
        System.out.println(" ");
        //for (int[] P1 : P) {
        for (int  i= 0; i < P[0].length; i++){
            System.out.println("Ingrese la fila número "+ (i+1)+ " Para la matriz P");
            for (int j = 0; j < P[0].length; j++) {
                //P1[j] = (int) (Math.random()*10);
                //P1[j]=leer.nextInt();
                 P[i][j]=leer.nextInt();
            }
        }  
        for (int i = 0; i < M.length; i++) {
            if (bandera==true) {
                    break;
                }
            for (int j = 0; j < M[0].length; j++) {
                if (bandera==true) {
                    break;
                }
                int m=0, n=0;
                if (M[i][j]==P[m][n]) {
                    int k=i;
                    int l=j;
                    int x=0;
                    for (m=0; m < P.length; m++) {
                        for (n = 0; n < P[0].length; n++) {
                            if (M[k][l]==P[m][n]) {
                                
                                V[x]=k;
                                x++;
                                V[x]=l;
                                x++;
                            }else if (M[k][l]!=P[m][n]) {
                                bandera2=true;
                                break;
                                
                            }
                            l++;
                          if (m==2&n==2){
                              bandera=true;
                              vec=true;
                          }
                        }
                        if (bandera2==true){
                            break;
                        }
                        k++;
                        l=j;
                        
                    }
                }
            }
        }
      
        
         if (vec==true) {
              System.out.println("Se ha encontrado la matriz P en la matriz M\""
                        + "En las siguientes posiciones:");
             for (int i = 0; i < V.length; i++) {
                 //System.out.print("("+V[i]+","+V[i++]+")");
                 System.out.print("("+V[i]+",");
              i++;
              System.out.print(+V[i]+")");
                      
               
             }
            
                
        }else {
             System.out.println("No se ha encontrado la Matriz P en la matriz M");
         }
         System.out.println(" ");
        }
        }

            
            
        
        
        
        
        
    
    


package EjerciciosAprendizaje;

import java.util.Scanner;

/*
BUSCA P EN M TODAS LA VECES
*/

public class Ejercicio21Vers2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [][] M= new int [10][10];
        int [][] P= new int [3][3];
        int [] V =new int[18]; //el doble de la dimesion de la matriz a buscar
        int u=0;
        boolean bandera2=false;
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
            for (int j = 0; j < M[0].length; j++) {
                int m=0, n=0;
                if (M[i][j]==P[m][n]) {
                    int k=i;
                    int l=j;
                    int x=0;
                    boolean vec=false;
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
                            if (l>(M.length-1)) {
                                bandera2=true;
                                break;
                            }
                            if (m==2&n==2){
                                vec=true;
                                u++;
                            }
                        }
                        if (bandera2==true){
                            break;
                        }
                        k++;
                        l=j;
                        
                    }
                    if (vec==true){
                        System.out.println("Se ha encontrado la matriz P en la matriz M en las siguientes posiciones:");
                        
                        for (int q = 0; q < V.length; q++) {
                            //System.out.print("("+V[i]+","+V[i++]+")");
                            System.out.print("("+V[q]+",");
                            q++;
                            System.out.print(+V[q]+")");
                            
                        }
                        System.out.println(" ");
                    }
                }
            }
        }
        
        if (u==0)  {
            System.out.println("No se ha encontrado la Matriz P en la matriz M");
        }else if (u>0){
            if (u>1){
                System.out.println("La matriz P ha sido encontrada un total de "+u+ " veces en la matriz M");
            }
            if (u==1) {
                System.out.println("La matriz P ha sido encontrada una vez en la matriz M");
            }
        }
        
    }
}

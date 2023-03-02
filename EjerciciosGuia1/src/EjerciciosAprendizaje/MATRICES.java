package EjerciciosAprendizaje;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MATRICES {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //RELLENAR METOOD 1
        int [][] matrizM= {{4,3,1},{5,8,9},{6,5,3},{0,6,8}};
        // RELLENAR METODO 2
        //int [][] matrizM=new int[][]{{4,3,1},{5,8,9},{6,5,3},{0,6,8}};
        //Nota: Si está creando un método que devuelve una matriz inicializada, tendrá que usar el new palabra
        //clave con las llaves. Al devolver una matriz en un método, las llaves por sí solas no funcionarán:
        // SE PUEDE RELLENAR PRIMERO DECLARANDO LA MATRIZ Y LUEGO LLENANDOLA?
        // AL PARECER NO
        //int[][]matrizM;
        //matrizM = {{4,3,1},{5,8,9},{6,5,3},{0,6,8}};
        //QUIZA SE NECESITA ESPECIFICAR EL TAMANO DE LA MATRIZ EN LA MISMA LINE (ES
        // LO QUE INDICAN LOS CORCHETES)
        
        
        int[] intArray = IntStream.range(1, 11).toArray();
        // NO TOMA EL 11 PERO SI EL 1
        //Nota: IntStream es solo una de las pocas clases que se pueden usar para crear rangos. También puede
        //utilizar un DoubleStream o LongStream en cualquiera de estos ejemplos.
        
        
        int[] intArray1 = IntStream.rangeClosed(1, 10).toArray();
        // Para anular la restrigaccion de rango
        
        
        //los IntStream.of() El método funciona de manera muy similar a declarar una matriz con un número determinado de
        //valores, como:
        int[] intArray2 = new int[]{6, 2, 4, 5, 7};
        // Aquí, especificamos los elementos en el of() llamada:
        
        
        int[] intArray3 = IntStream.of(6, 2, 4, 5, 7).toArray();
        //Esto produce una matriz con el orden de los elementos conservados:
        //[6, 2, 4, 5, 7]
        //O incluso podrías llamar al sorted() en esto, para ordenar la matriz a medida que se inicializa:
        
        
        int[] intArray4 = IntStream.of(6, 2, 4, 5, 7).sorted().toArray();
        //Lo que da como resultado una matriz con este orden de elementos:
        //[2, 4, 5, 6, 7]
        
        
        
        // FOR MEJORADO
        /*
        for(declaration : expression) {
        // Statements
        }
        */
//        System.out.println("prueba de llenado vector mejorado, inicio");
//        int[] vector = new int[3];
//        String aux = " ";
//        for (int x : vector) {
//            x = leer.nextInt();
//            aux += " " + x;
//
//        }
//        System.out.println(aux);
//
//        System.out.println("prueba de llenado vector mejorado, fin");
//

//        for (int x:intArray){
//           aux+=" "+x;
//            System.out.println(aux);
//
//       }
//        System.out.println(aux);

//¿¿¿¿NO SE PUEDE PARA MATRICES????
// puedo escribir una sola fila diciendo cual quiero
System.out.println("matriz loop");
int i=0,j=0;
for (int x:matrizM[0]){
    x=leer.nextInt();
    System.out.print(x);
    System.out.println(",");
}

System.out.println("fin matriz loop");



int [][] matrizT;
int n,m;

System.out.println("Ingrese el tamaño de la matriz, primero numero de filas y seguido del numero de columnas");
n = leer.nextInt();
m= leer.nextInt();
matrizT= new int [n][m];

//for (int i = 0; i < matrizT.length; i++) {
//  for (int j = 0; j < matrizT[0].length; j++) {
//    System.out.println("Ingrese el valor de la posición " + i+" "+ j  );
//  matrizT[i][j]=leer.nextInt();

    }
    
    
    
}


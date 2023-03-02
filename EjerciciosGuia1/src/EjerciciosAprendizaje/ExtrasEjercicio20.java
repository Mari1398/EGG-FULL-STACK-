
package EjerciciosAprendizaje;



public class ExtrasEjercicio20 {

    //Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
    public static void main(String[] args) {
        
        int [] V=new int [9];
      relleno (V) ;
      mostrar (V);
        
    }
    
    public static void relleno (int [] V){
        for (int i = 0; i < V.length; i++) {
            V[i]=(int)(Math.random()*10);
        }
    
    
}
    public static void mostrar (int [] V){
    for (int V1:V){
        System.out.print(V1 +" ");
        
    }
        System.out.println(" ");
   
}
}

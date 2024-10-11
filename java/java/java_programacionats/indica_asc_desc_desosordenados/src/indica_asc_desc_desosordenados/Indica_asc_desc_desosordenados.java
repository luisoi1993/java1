/*Leer por teclado una serie de 10 numeros enteros.La aplicación
debe indicarnos si los números están ordenados de forma creciente,
decreciente, o si están desordenados */
package indica_asc_desc_desosordenados;


import java.util.Scanner;

public class Indica_asc_desc_desosordenados {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[]=new int[10]; //Creamos el arreglo de 10 elementos enteros
        boolean creciente=false,decreciente=false;
        
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        
        for(int i=0;i<9;i++){
            if(arreglo[i]<arreglo[i+1]){//creciente: 1-2-3-4-5...
                creciente=true;
            }
            if(arreglo[i]>arreglo[i+1]){ //Decreciente: 5-4-3-2-
                decreciente=true;
            }
        }
        
        if(creciente==true && decreciente==false){
            System.out.println("\nEl arreglo esta en forma creciente");
        }
        else if(creciente==false && decreciente==true){
            System.out.println("\nEl arreglo esta en forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("\nEl arreglo esta desordenado");
        }
        else if(creciente==false && decreciente==false){
            System.out.println("\nTodos los numeros del array son iguales: ");
        }
    }
    
}

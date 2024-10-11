/*Leer 5 elementos numéricos que se introduciran ordenados de
forma creciente.Estos los guardaremos en una tabla de tamaño
10.Leer un numero N, e insertarlo en el lugar adecuado para
que la tabla continue ordenada */

package array_indicarposicion_cambiar;

import java.util.Scanner;
public class Array_indicarPosicion_cambiar {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[]= new int [10];
        boolean creciente=true;
        int numero,sitio=0,j=0;
        
        System.out.println("Llenar el arreglo: ");
        do{
            //llenando el array
            for(int i=0;i<5;i++){
                System.out.println((i+1)+"Digite un numero: ");
                arreglo[i]=entrada.nextInt();
            }
            
            //comprobar si el array esta ordenando en orden creciente
            for(int i=0;i<4;i++){
                if(arreglo[i]<arreglo[i+1]){  //Creciente: 1-2-3
                    creciente=true;
                }
                if(arreglo[i]>arreglo[i+1]){  // Decreciente 3-2-1
                    creciente =false;
                    break;
                }
            }
            
            if(creciente==false){
                System.out.println("\nEl arreglo no esta ordrnado de forma creciente, vuel a digitar:\n");
            }
            
        }
        while(creciente==false);
        
        System.out.println("\nDigite un elemento a insertar: ");
        numero=entrada.nextInt();
        
        //esto es para darnos cuenta en que posicion va a ir el numero
        while(arreglo[j]<numero && j<5){
            sitio++;
            j++;
        }
       
        
        //Por ultimo, trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for(int i=4;i>sitio;i--){
            arreglo[i+1]=arreglo[i];
        }
        
        //Insertamos el numero que el usuario puso
        arreglo[sitio]=numero;
        
        System.out.print("\nEl arreglo queda: ");
        for(int i=0;i<6;i++){
            System.out.println(arreglo[i]+" - ");
        }
        System.out.println();
    }
    
}

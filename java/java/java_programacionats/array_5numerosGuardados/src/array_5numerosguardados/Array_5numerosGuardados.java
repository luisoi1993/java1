/*Leer 5 numeros, guardarlos en un arreglo y mostralos
en el mismos orden introducido. */
package array_5numerosguardados;

import java.util.Scanner;

public class Array_5numerosGuardados {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       float[] numeros= new float[5];
       
       System.out.println("Guardando los datos en el array:");
       for(int i=0;i<5;i++){
           System.out.print((i+1)+". Digite un numero: ");
           numeros[i]=entrada.nextFloat();
       }
       
       System.out.println("\nImprimir los elementos del arreglo: ");
       for(float i:numeros){
           System.out.println(i);
       }
       
    }
    
}

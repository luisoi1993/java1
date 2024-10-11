/*Leer por teclado una serie de 10 numeros enteros.La aplicacion debe 
indicarnos si los números están ordenados de forma creciente ,decrecciente,
o si están ddesordenados.
 */
package array_estanordenadosono;

import java.util.Scanner;
public class Array_estanOrdenadosOno {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int arreglo[] =new int[10];
       boolean creciente=false, decreciente=false;
       System.out.println("Llenar el arreglo");
       for(int i=0;i<10;i++){
           System.out.println((i+1)+". Digite un numero: ");
           arreglo[i]=entrada.nextInt();
       }
    }
    
}

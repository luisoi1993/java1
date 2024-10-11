/*Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos
en el siguiente orden: el primero, el ultimo, el segundo, el penúltimo,
el tercero ,etc..
 */
package array_alternarposiciones;

import java.util.Arrays;
public class Array_alternarPosiciones {

   
    public static void main(String[] args) {
        int [] numeros=new int[10];
        int i,a=0;
        
        //Inicializo los dos arrays con valores aleatorios y lo muestro
        System.out.print("Array original: ");
        for(i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*100)+1;
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("Array alternado: ");
        
        //Ahora hago el recorrido para mostrar el array de forma alterna
        //para ello lo voy mostrando por parejas de forma que primero muestro el elemento i
        //y después muestro el elemento numeros.length-1-i que se corresponden con las
        //parejas de posiciones[0,9,1,8,2,7,3,6,4,5]
        for(i=0;i<numeros.length/2;i++){
            System.out.println(numeros[i]+" "+numeros[numeros.length-1-i]+" ");
        }
        
    }
    
}

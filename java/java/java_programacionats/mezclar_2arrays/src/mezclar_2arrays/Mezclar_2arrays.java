/*Leer por teclado dos tablas de 10 numeros enteros y mezclarlas
en una tercera de la forma:el 1º de A, el 1º de B, el 2º de A,
el 2º de B,etc. */
package mezclar_2arrays;

import java.util.Scanner;
public class Mezclar_2arrays {

   
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int a[],b[],c[];
       
       a= new int[10]; //Arreglo a con 10 elementos
       b=new int[10]; //Arreglo b con 20 elementos
       c=new int[20]; // Arreglo c contendra al arreglo a y b
       
       //Pedimos el arreglo a
       System.out.println("Digite el primer arreglo: ");
       for(int i=0;i<10;i++){
        System.out.print((i+1)+". Digite un numero: ");
        a[i]=entrada.nextInt();
    }
       
       //Pedimos el arreglo b
       System.out.println("\nDigite el segundo arreglo: ");
       for(int i=0;i<10;i++){
           System.out.print("Digite un numero: ");
           b[i]=entrada.nextInt();
       }
       
       //Ahora, vamos a mezclar los 2 arreglos en el arreglo c
       //vamos a utilizar el itirador i para a yb
       //y el iterador j para el arreglo c
       int j=0;
       for(int i=0;i<10;i++){
           c[j]=a[i];//1ºA
           j++;
           c[j]=b[i];//1ºB
           j++;
       }
       
       System.out.println("\nEl tercer arreglo es: ");
       for(int i=0;i<20;i++){
           System.out.println(c[i]+" ");
           
       }
       System.out.println();
    }
    
}

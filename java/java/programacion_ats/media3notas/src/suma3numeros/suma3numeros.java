/*Hacer un programa que calcule e imprima la suma de tres calificaciones.
 */
package suma3numeros;

import java.util.Scanner;
public class suma3numeros {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       float a,b,c,resultado;
       
       
       System.out.println("Digite la primera la nota: ");
       a=entrada.nextInt();
       
       System.out.println("Digite la segunda la nota: ");
       b=entrada.nextInt();
       
       System.out.println("Digite la tercera la nota: ");
       c=entrada.nextInt();
       
       resultado=(a+b+c);
       
       System.out.println("El resultado es: "+resultado);
       
    }
    
}

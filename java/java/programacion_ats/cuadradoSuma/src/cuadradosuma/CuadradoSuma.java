/*Hacer un programa que calcule el cuadrado de una suma
 */
package cuadradosuma;

import java.util.Scanner;


public class CuadradoSuma {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float a,b,resultado;
        
        System.out.println("Digite el valor de a: ");
        a=entrada.nextFloat();
        
        System.out.println("Digite el valor de b: ");
        b=entrada.nextFloat();
        
        resultado= (a*a)+(b*b)+2*(a*b);
        
        System.out.println("El resultado es: "+resultado);
    }
    
}

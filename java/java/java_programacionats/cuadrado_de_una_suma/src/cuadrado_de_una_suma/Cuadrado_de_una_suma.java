//Hacer un programa que calcule el cuadrado de una suma

package cuadrado_de_una_suma;

import java.util.Scanner;


public class Cuadrado_de_una_suma {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a,b,resultado;
        
        System.out.print("Digite el valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextFloat();
        
        resultado = (a*a)+(2*a*b)+(b*b);
        
        System.out.print("El resultado es"+resultado);
        
    }
    
}

/*
 Hacer un programa que calcule el cuadrado de una suma
 */
package cuadradosuma;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class CuadradoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a , b , resultado;
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();
        resultado = Math.pow(a, 2) + Math.pow(b, 2)+ (2*a*b);
        System.out.println("\n El resultado es: "+resultado);
    }
    
}

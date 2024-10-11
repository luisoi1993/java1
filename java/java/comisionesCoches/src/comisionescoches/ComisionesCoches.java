/*UNa compañia de ventas de carros usados, paga a su personal de ventas un salario
de $1000 mensuales, mas una comision de $150 por cada carro vendido, mas el 5% del
valor de la venta por carro. Cada mes el capturrista de la empresa ingresa en la computadora
los datos pertinentes . Hacer un programa que calcule e imprima el salario mensual del
vendedor dado
 */
package comisionescoches;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ComisionesCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeroCoches , valorCoches , total;
        
        System.out.println("Digite el numero de coches vendidos");
        numeroCoches = entrada.nextFloat();
        
        System.out.println("Digite el valor de los coches");
        valorCoches = entrada.nextFloat();
        
        total = 1000 + (numeroCoches * 150) + (valorCoches*10 /100);
        
        System.out.println("El sueldoo total es :"+total);
    }
    
}

/*
 Hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales y de su salario por hora.
 */
package salariohoraporsemanas;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Salariohoraporsemanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario , horas , resultado;
        
         
         System.out.println("Digite el numero de horas: ");
         horas = entrada.nextFloat();
         
         System.out.println("Digite el sueldo por horas: ");
         salario = entrada.nextFloat();
         
         resultado = salario * horas;
         
         System.out.println("El salario es "+resultado+" por estas horas trabajadas "+horas);
    }
    
}

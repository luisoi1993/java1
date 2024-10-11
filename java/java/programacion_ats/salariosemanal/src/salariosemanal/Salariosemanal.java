/*Hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajadas y de su salario por hora
 */
package salariosemanal;

import java.util.Scanner;


public class Salariosemanal {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int horas,salario;
        float resultado;
        
        System.out.println("Digite el numero de horas trabajadas: ");
        horas=entrada.nextInt();
        
        System.out.println("Digite el salario por hora: ");
        salario=entrada.nextInt();
        
        resultado=salario*horas;
        
        System.out.println("El salario es: "+resultado);
    }
    
}

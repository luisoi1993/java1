/*Hacer un programa que calcule e imprima el salario semanal
 de un empleado a partir de sus semanales trabajadas y de su
salario por hora*/
package salariosemanal;

import java.util.Scanner;


public class Salariosemanal {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float horas,salario,resultado;
        
        System.out.println("Digite el numero de horas: ");
        
        horas = entrada.nextFloat();
        
        System.out.println("Digite el salario por hora: ");
        
        salario = entrada.nextFloat();
        
        resultado = horas * salario;
        
        System.out.println("El salario semanal es: "+ resultado);
        
    }
    
}

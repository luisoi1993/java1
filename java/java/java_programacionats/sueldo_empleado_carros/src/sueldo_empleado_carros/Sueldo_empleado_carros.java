/*Una compañia de ventas de carros usados,paga
a su personal de ventas un salario de $1000 
mensuales, mas una comisión de $150 por cada
caro vendido, más el 5% del valor de la venta
por carro.Cada mes el capturista de la empresa
ingresa en la computaadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario 
mensual de un vendedor dado */
package sueldo_empleado_carros;

import java.util.Scanner;

public class Sueldo_empleado_carros {
    Scanner entrada = new Scanner(System.in);

    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         float num_vendidos,porcentaje,resultado,resultado2,resultado3;
         
         System.out.println("Digite el numero de coches vendidos: ");
         num_vendidos = entrada.nextFloat();
         resultado = num_vendidos*150;
         
         System.out.println("Digite el total del valor de los coches vendidos: ");
         porcentaje= entrada.nextFloat();
         resultado2= (porcentaje/100)*5;
         
         resultado3= 1000+resultado+resultado2;
         
         System.out.println("El salario total es: "+resultado3);
         
        
    }
    
}

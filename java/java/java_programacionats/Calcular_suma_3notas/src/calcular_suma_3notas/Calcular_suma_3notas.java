/*Hacer un programa que calcule e imprima la suma de tres
calificaciones*/

package calcular_suma_3notas;

import java.util.Scanner;


public class Calcular_suma_3notas {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float nota1,nota2,nota3;
        
        System.out.println("Digite las tres notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        float media = (nota1 + nota2 + nota3);
        
        System.out.println(media);
    }
    
}

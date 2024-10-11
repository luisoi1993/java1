/*
 Hacer un programa que calcule e imprima la suma de tres calificaciones
 */
package sumatresnumeros;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Sumatresnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        //guardamos las tres notas
        System.out.print("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1+nota2+nota3;
        
        System.out.println("\nLa suma es "+suma);
        
        
    }
    
}

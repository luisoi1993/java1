/*Guillermo tiene n doldares.luis tiene la mitad
de lo que posee guillermo. juan tiene la mitad de lo que 
poseen luis y guillermo juntos. hacer un programa que 
calcule y imprime el dinero que tienen los 3.
 */
package dinerotienen3;

import java.util.Scanner;


public class DineroTienen3 {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       
       float guille,luis,juan,total;
       
       System.out.println("Digite el dinero que tiene guillermo: ");
       guille=entrada.nextFloat();
       luis=guille/2;
       juan=(guille+luis)/2;
       total=luis+guille+juan;
       
       System.out.println("El total es: "+total);
    }
    
}

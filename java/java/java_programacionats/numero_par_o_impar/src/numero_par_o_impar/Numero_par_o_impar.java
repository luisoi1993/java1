/*Hacer un programa que tome los números y diga si
ambos son pares o impares*/
package numero_par_o_impar;

import java.util.Scanner;

public class Numero_par_o_impar {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a,b,resultado,resultado2;
        
        System.out.println("Digite el valor del primer numero: ");
        a=entrada.nextInt();
        System.out.println("Digite el valor del segundo valor: ");
        b=entrada.nextInt();
        
        if(a%2 ==0){
            System.out.println("El primer numero es par: ");
            
        }
        else{
            System.out.println("El `primer numero es impar: ");
        }
        
        if(b%2 == 0){
            System.out.println("El numero b es par: ");
        }
        else{
            System.out.println("El numero b no es par: ");
        }
        
    }
    
}

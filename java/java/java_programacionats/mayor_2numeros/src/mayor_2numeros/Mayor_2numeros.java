/*
 Pedir dos números y decir cual es el mayor o si son iguales
 */
package mayor_2numeros;

import java.util.Scanner;

public class Mayor_2numeros {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextInt();
        System.out.println("Digite el valor de b: ");
        b= entrada.nextInt();
        
        if(a>b){
            System.out.println("El primer numero es mayor: ");
        }if(a<b){
            System.out.println("El segundo numero es mayor: ");
        }else{
            System.out.println("Los numeros son iguales: ");
        }
        
    }
    
}

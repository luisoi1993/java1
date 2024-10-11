//Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene

package cifras_numero;

import java.util.Scanner;


public class Cifras_numero {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite un numero entre 0 y 99999");
        numero=entrada.nextInt();
        
        if(numero<10){
            System.out.println("El numero tiene 1 cifra: ");
            
        }
        else if(numero<100){
            System.out.println("El numero tiene dos cifras: ");
        }
        else if(numero<1000){
            System.out.println("El numero tiene 3 cifras: ");
        }
        else if(numero<10000){
            System.out.println("El numero tiene 4 cifras: ");
        }
        else if(numero<100000){
            System.out.println("El numero tiene 5 cifras: ");
        }
        
    }
    
}

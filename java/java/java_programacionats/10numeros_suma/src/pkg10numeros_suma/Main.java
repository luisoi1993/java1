/*Pedir 10 numeros y digitar la suma total
 */
package pkg10numeros_suma;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,contador=0,sumatorio=0;
        
        
        
        while(contador<10){
            contador++;
            System.out.println("Digite un numero: ");
            num=entrada.nextInt();
            sumatorio=num+sumatorio;
                  
        }
        
        System.out.println("El resultado es: "+sumatorio);
    }
    
}

/*Pedir un numero N, y mostrar todos los números
del 1 al N.
 */
package pedirnumero_mostrarnumeros;

import java.util.Scanner;

public class Pedirnumero_mostrarnumeros {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero,num=1;
        
        System.out.println("Digite un numero: ");
        numero=entrada.nextInt();
        
        while(num<=numero){
           System.out.println(num);
           num++;
        }
    }
    
}

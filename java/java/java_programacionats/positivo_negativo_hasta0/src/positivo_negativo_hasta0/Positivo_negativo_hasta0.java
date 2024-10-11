/*Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca 0
 */
package positivo_negativo_hasta0;

import java.util.Scanner;

public class Positivo_negativo_hasta0 {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num;
        
        System.out.println("Digite un numero: ");
        num=entrada.nextInt();
        
        while(num !=0){
            if(num%2 ==0){
                System.out.print("El numero es par: \n");
                System.out.println("Digite otro numero: ");
                num=entrada.nextInt();
            }
            else{
                System.out.println("El numero es impar: ");
                System.out.println("Digite otro numero: ");
                num=entrada.nextInt();
            }
    }
       
    }
    
}

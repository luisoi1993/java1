/*
 pedir un numero y calcular su factorial
 */
package factorial;

import java.util.Scanner;
public class Factorial {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       double num,factorial=1;
       
       System.out.println("Digite un numero: ");
       num=entrada.nextInt();
       
       while(num!=0){
           factorial=factorial*num;
           num--;
       }
       
       System.out.println("El factorial es: "+factorial);
               
    }
    
}

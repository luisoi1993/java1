/*Pedir numeros hasta que se teclee uno negativo, y mostarar cuantos
numeros se han introducido */

package hastanegativo_mostrar_total_numeros;

import java.util.Scanner;

public class Hastanegativo_mostrar_total_numeros {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int i=0,num;
        
        System.out.println("Digite un numero: ");
        num=entrada.nextInt();
        
        while(num>=0){
            i++;
            System.out.println("Digite otro numero: ");
            num=entrada.nextInt();
        }
        System.out.print("El total de numeros es : "+i);
        
    }
    
}

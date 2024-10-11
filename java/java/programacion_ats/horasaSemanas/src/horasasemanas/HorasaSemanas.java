/*Construir un programa que, dado un número total de horas , devuelve el número
de semanas, dias y horas equivalentes. Por ejemplo , dado un total de 1000 horas
debe mostrar 5 semanas, 6 dias y 16 horas
 */
package horasasemanas;

import java.util.Scanner;

public class HorasaSemanas {

    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int semanas=0 ,dias=0,horas;
       
       System.out.println("Digite el numero de horas: ");
       horas=entrada.nextInt();
       
       while(horas>=24){
           horas=horas-24;
           dias++;
       }
       
       while(dias>=7){
           dias=dias-7;
           semanas++;
       }
       
       System.out.println("El numero de semanas es: "+semanas+
                          "\nEl numero de dias es: "+dias
                          +"\nEl numero de horas es: "+horas);
    }
    
}

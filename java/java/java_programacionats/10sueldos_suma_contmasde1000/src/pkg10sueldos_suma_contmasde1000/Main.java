/*Pedir 10 sueldos.Mostrar su suma y cuantos hay mayores de 1000
 */
package pkg10sueldos_suma_contmasde1000;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        int suma=0,cont=0,sueldo;
        Scanner entrada=new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.println("Digite un sueldo: ");
            sueldo=entrada.nextInt();
            
            suma=suma+sueldo;
            if(sueldo>1000){
                cont++;
            }
            
        }
        
        System.out.println("La suma de los sueldos es: "+suma);
        System.out.println("El numero de sueldos que superar 1000$: "+cont);
    }
    
}

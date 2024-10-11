/*Pedir un número N, introducir N sueldos, y mostrar el 
sueldo máximo. */

package pedir_numero_maximosueldo;

import java.util.Scanner;

public class Pedir_numero_maximoSueldo {

  
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num,sueldo,sueldoMayor=0;
        do{
            System.out.println("Digite el numero de sueldos: ");
            num=entrada.nextInt();
        }
        while(num<=0);
        
        while(num>0){
            System.out.println("Digite el sueldo del empleado: ");
            sueldo=entrada.nextInt();
            if(sueldo>sueldoMayor){
                sueldoMayor=sueldo;
            }
            num--;
        }
        System.out.println("El sueldo mayor es: "+sueldoMayor);
        
    }
    
}

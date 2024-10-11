/*Pedir una nota de 0 a 10 y mostrarla de la forma:
insuficiente,suficiente , bien,notable,Sobresaliente */
package nota_alumno;

import java.util.Scanner;


public class Nota_alumno {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num;
        
        System.out.println("Digite la nota: ");
        num=entrada.nextFloat();
        
       if(num<5){
            System.out.println("Has suspendido: "+num); 
        }
       else if((num>4.99) && (num<6)){
            System.out.println("Has sacado un suficiente: "+num);
        }
       else if((num>5.99) && (num<7)){
           System.out.println("Has sacado un bien: "+num);
        }
       else if((num>6.99) && (num<9)){
           System.out.println("Has sacado un notable: ");
       }
           
        else{
            System.out.println("Has sacado un sobresaliente: "+num);
        }
      
    }
    
}

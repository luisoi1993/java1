/*
 Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.Con meses
de 28, 30 ,31 dias . Sin años bisiestos
 */
package fechacorrectadias;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class FechaCorrectaDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el diaa. ");
       int dia = sc.nextInt();
       System.out.print("Ingrese el mes. ");
       int mes = sc.nextInt();
       System.out.print("Ingrese el año. ");
       int año = sc.nextInt();
       if(año>=1992){
           if(mes>=1 && mes<=12){
              if(dia>=1 && dia<=30){
                  if (mes == 2){
                      
                  }
              } 
           }else{
               System.out.println("El mes es incorrecto");
           }
       }else{
           System.out.println("El año es incorrecto");
       }
    }
    
}

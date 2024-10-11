/*Dadas 6 notas escribir la cantidad de alumnos aprobados ,condiciconados
(=4) y suspensos. */
package pkg6notas_aprobados;

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int aprobados=0,condicionados=0,suspensos=0;
       float num;
       
       for(int i=1;i<7;i++){
           do{
              System.out.println("Digite la nota. Del alumno nº: "+i);
              num=entrada.nextFloat();  
           }
           while((num<0) || (num>10));
           
           if(num>=5){
               aprobados++;
           }
           else if((num==4) && (num<5)){
               condicionados++;
           }
           else{
               suspensos++;
           }
       }
       
       System.out.println("El numero de aprobados es : "+aprobados);
       System.out.println("EL numero de condicionados es: "+condicionados);
       System.out.println("El numero de suspensos es: "+suspensos);
       
       
    }
    
}

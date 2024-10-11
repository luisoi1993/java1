/*Pedir 5 calificaciones de alumnos y decir al final si
hay algun suspenso. */

package pkg5notas_algunsuspenso;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int nota;
       boolean suspenso=false;
       
       
       for(int i=1;i<6;i++){
          System.out.println("Digite la nota del alumno: "+i);
          nota=entrada.nextInt();
          
          if(nota<5){
              suspenso=true;
          }
       }
       if(suspenso==true){
           System.out.println("Si hay suspensos: ");
           
       }
       else{
           System.out.print("No hay suspensos: ");
       }
    }
    
}

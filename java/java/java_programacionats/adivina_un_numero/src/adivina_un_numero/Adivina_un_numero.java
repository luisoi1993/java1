/*Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio
entre 0-100 y luego ir pidiendo numeros indicando "es mayor" p "es menor" segun
sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y 
muestra el nunmero de intentos */
package adivina_un_numero;

import javax.swing.JOptionPane;

public class Adivina_un_numero {

    public static void main(String[] args) {
       int numero,contador=0,aleatorio;
       
       aleatorio=(int)(Math.random()*100);
       
       do{
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
           
           if(aleatorio>numero){
               System.out.println("Digite un numero mayor:  ");
           }
           else{
               System.out.println("Digite un numero menor: ");
           }
           contador++;//Aumentamos en uno el contador
       }while(numero != aleatorio);
       
       System.out.print("\nGenial!! Adivinaste el numero en: "+contador+"intentos");
    }
    
}

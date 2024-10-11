/*Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
 */
package pedirnumeros_calculalamedia;

import javax.swing.JOptionPane;
public class Pedirnumeros_calculalamedia {

   
    public static void main(String[] args) {
       int numero,elementos=0,suma=0;
       float media;
       
       numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       while(numero>=0){
           suma=suma+numero;//Suma iterativa
           elementos++;//Aumentamos uno a elementos
           
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       }
       
       if(elementos == 0){
           System.out.println("Error! La división entre 0 no existe");
       }
       else{
           media=(float) suma/elementos;
           System.out.println("La media es: "+media);
       }
    }
    
}

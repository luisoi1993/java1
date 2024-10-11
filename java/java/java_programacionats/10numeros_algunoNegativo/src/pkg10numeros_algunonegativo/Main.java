/*Pedir 10 numeros, y mostrar al final si se ha introducido alguno
negativo*/

package pkg10numeros_algunonegativo;

import javax.swing.JOptionPane;
public class Main {

   
    public static void main(String[] args) {
       int numero;
       boolean hay_negativos=false;
       
       for(int i=1; i<=10;i++){
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
           
           if(numero<0){
               hay_negativos=true;
           }
       }
       if(hay_negativos==true){
           System.out.println("Si hay numeros negativos: ");
           
       }
       else{
           System.out.println("No exixte numeros negativos: ");
       }
    }
    
}

/*Hacer un programa que lea un número entero y muestre si el numero es 
multiplo de 10
 */
package multiplo10;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Multiplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       if(numero%10 == 0){
           JOptionPane.showMessageDialog(null,"El numero" +numero+"es multiplo de 10");
       }
       else{
           JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
       }
    }
    
}

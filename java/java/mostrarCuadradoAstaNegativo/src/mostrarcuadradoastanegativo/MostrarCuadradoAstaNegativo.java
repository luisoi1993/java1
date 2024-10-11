/*Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca
un numero negativo
 */
package mostrarcuadradoastanegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class MostrarCuadradoAstaNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero, cuadrado;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       while(numero >= 0){
           cuadrado = (int)Math.pow(numero,2);
           
           JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es :"+cuadrado);
           
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       }
       
    }
    
}

/*Pedir dos numeros y decir cual es mayor o si son iguales
 */
package numeromayor;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 ,numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if(numero1 == numero2){
             JOptionPane.showMessageDialog(null, "El numero1 "+numero1+" es igual al numero2 "+numero2);
        }
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null,"El numero1 "+numero1+" es mayor que el numero 2 "+numero2 );
        }
        if(numero2 > numero1){
            JOptionPane.showMessageDialog(null,"El numero 2 "+numero2+" es mayor que el numero1 "+numero1);
        }
    }
    
}

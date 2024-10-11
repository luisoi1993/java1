/* La sentencia switch:

    switch(dato){
        case 1: Instrucciones1;
                break;
        case 2: Instrucciones2;
                break;
        ...
        case n: InstruccionesN;
                break;
default: CasoContrario;
        break;
 
 */
package sentencia_switch;

import javax.swing.JOptionPane;

public class Sentencia_switch {

  
    public static void main(String[] args) {
        int dato;
        
        dato =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                    break;
            case 3:JOptionPane.showMessageDialog(null,"Es el numero 3");
                    break;
            case 4:JOptionPane.showMessageDialog(null,"Es el numero 4");
                    break;
            case 5:JOptionPane.showMessageDialog(null,"Es el numero 5");
                    break;
            default: JOptionPane.showMessageDialog(null,"El numero no esta en rango de 1-5");
                    break;
        }
    }
    
}

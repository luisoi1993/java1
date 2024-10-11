/*Pedir tres números y mostrarlos ordenados de mayor a menor
 */
package ordenar3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ordenar3numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2 , n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        
        if((n1>n2) && (n2>n3)){
            JOptionPane.showMessageDialog(null,"Orden : "+n1+" - "+n2+" - "+n3);
        }
        else if ((n1>n3) && (n3>n2)){
            JOptionPane.showMessageDialog(null,"Orden : "+n1+" - "+n3+" - "+n2);
        }
        else if((n2>n1) && (n1>n3)){
             JOptionPane.showMessageDialog(null,"Orden : "+n2+" - "+n1+" - "+n3);
        }
        else if((n2>n3) && (n3>n1)){
            JOptionPane.showMessageDialog(null,"Orden : "+n2+" - "+n3+" - "+n1);
        }
        else if((n3>n1) && (n1>n2)){
            JOptionPane.showMessageDialog(null,"Orden : "+n3+" - "+n1+" - "+n2);
        }
        else{
            JOptionPane.showMessageDialog(null,"Orden : "+n3+" - "+n2+" - "+n1);
        }
    }
    
}

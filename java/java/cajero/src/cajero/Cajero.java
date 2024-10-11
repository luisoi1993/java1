/*Hacer un programa que simule un cajero automatico con un saldo inicial de 1000
dolares, con el siguiente menu de opciones:

1.Ingrear dinero en la cuenta
2. Retirar dinero de la cuenta
3.salir
 */
package cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso,saldoActual, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatica\n"
        +"1. Ingresar dinero en la cuenta\n"
        + "2.Retirar dinero de la cuenta\n"
        +"3. Salir"));
        
        switch(opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta"));
                    saldoActual = saldo_inicial + ingreso;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual);
                    break;
            
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar en cuenta"));
                    
                    if(retiro>saldo_inicial){
                        JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficente para retirar");
                    }
                    else{
                        saldoActual = saldo_inicial - retiro;
                        JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual);
                    }
                    break;
                    
            case 3: break;
            
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opcion en el menu");
                     break;
        }
    }
    
}

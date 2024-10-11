/*Hacer un programa que simule un cajero automático con un saldo
inicial de 1000 dolares, con el siguiente menú de opciones:

1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Salir
 */
package cajero_automatico;

import javax.swing.JOptionPane;


public class Cajero_automatico {

   
    public static void main(String[] args) {
       final int saldo_inicial = 1000;
       int opcion;
       float ingreso,saldoActual,retiro;
       
       opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero Automatico\n"
       + "1. Ingresar dinero a la cuenta\n"
       + "2. Retirear sinero de la cuenta\n"
       +"3. Salir"));
       
       switch(opcion){
           case 1: ingreso=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta: "));
                    saldoActual=saldo_inicial+ingreso;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual);
                    break;
                    
           case 2: retiro=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
           
                if(retiro>saldo_inicial){
                    JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente para este retiro");
                }
                else{
                    saldoActual=saldo_inicial-retiro;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual);
                }
                    break;
           case 3: break;
           
           default: JOptionPane.showMessageDialog(null,"Se equivoco de opcion de menu");
                    break;
                    
       }
    }
    
}

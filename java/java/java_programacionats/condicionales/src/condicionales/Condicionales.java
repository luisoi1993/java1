/*La sentencia if:
        if(condicion){
            Instruccion1;
        }
        else{
            Instruccion2;
        }

== : igualdad  / != : Diferencia/ > : Mayor/ >= : Mayor o igual
< : Menor / <= : Menor o igual
 */
package condicionales;


import javax.swing.JOptionPane;

public class Condicionales {

   
    public static void main(String[] args) {
        int numero, dato =5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"El numero es 5: ");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es diferente de 5: ");
        }
    }
    
}

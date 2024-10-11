/*Leer un numero y mostrar su cuadrado, repetir el
proceso hasta que se introduzca un número negativo*/
package cuadrrado_numero_hasta_numeronegativo;

import javax.swing.JOptionPane;


public class Cuadrrado_numero_hasta_numeronegativo {
    
     public static void main(String[] args) {
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero >= 0){//mientras el numero sea 0 o positivo
           cuadrado= (int)Math.pow(numero,2); 
           
           JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es : "+cuadrado);
           
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
            
        }
    }
    
}

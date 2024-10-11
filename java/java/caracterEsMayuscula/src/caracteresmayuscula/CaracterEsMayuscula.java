/*
 Hacer un programa que lea un caracter por teclado y compruebe si es una letra 
mayuscula
 */
package caracteresmayuscula;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class CaracterEsMayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
    
}

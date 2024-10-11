/*Un obrero necesita calcularsu salario semanal, el cual se obtinene de la 
siguiente manera: SI trabaja 40 horas o menos se le paga 16 $ por hora
si trabaja mas de 40 horas se le paga 16 por cada una de las primeras 40 y 20$
por cada hora extra. 
 */
package calculasalario;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class CalculaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas= Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas"));
        
        if(horasTrabajadas <=40){
            salarioTotal = horasTrabajadas * 16;
        }
        else{
            salarioTotal = (40 * 16 ) + ((horasTrabajadas - 40) * 20);
        }
        
        JOptionPane.showMessageDialog(null, "El salario total es: "+salarioTotal);
    }
    
}

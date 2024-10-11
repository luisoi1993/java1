/*Un obrero necesita calcular su salario mensual, es cual se 
obtiene de la siguiente manera:
si trabaja 40 horas o menos se le paga $16 por hora
si trabaja mas de 40 horas se le paga $16 por cada una de las primeras
40 horas y$20 por cada hora extra*/

package obrero_horastrabajadas;

import javax.swing.JOptionPane;


public class Obrero_horastrabajadas {

   
    public static void main(String[] args) {
       int horasTrabajadas;
       float salarioTotal;
       
       horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas: "));
       
       if(horasTrabajadas <= 40){
           salarioTotal=horasTrabajadas *16;
       }
       else{
           salarioTotal=(40*16)+((horasTrabajadas -40)*20);
       }
       
       JOptionPane.showMessageDialog(null,"El salario total es: "+salarioTotal);
    }
    
}

/*
Pedir el dia,mes y año de una fecha e indicar si la fecha es correcta.
Suponiendo que todos los meses son de 30 dias.
 */
package pedirfecha_y_comprobar_si_es_correcto;

import javax.swing.JOptionPane;


public class Pedirfecha_y_comprobar_si_es_correcto {

    public static void main(String[] args) {
       int dia,mes,año;
       
       dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
       mes=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
       año=Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
       
       if((dia>=1 && (dia<=30))){ //Si el dia es correcto
           if((mes>=1)&&(mes<=12)){ //Si el mes es correcto
               if(año != 0){  //Si el año es incorrecto
                   JOptionPane.showMessageDialog(null, "Fecha correcta");
               }
               else{
                   JOptionPane.showMessageDialog(null,"Fecha incorreccta, año incorrecto");
               }
           }
           else{
               JOptionPane.showMessageDialog(null,"La fecha es incorrecta, mes incorrecto");
           }
        }
       else{
           JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto");
       }
    }
   
    
}

/*Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
Suponiendo que todos los meses son de 30 dias
 */
package fechacorrecta;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class FechaCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if((dia>=1) && (dia<=30)){
           if((mes>=1) && (mes<=12)){
             if(año !=0){
                 JOptionPane.showMessageDialog(null,"La fecha es correcta");
             }
             else{
                 JOptionPane.showMessageDialog(null,"La fecha es incorrecta ,año incorrecto");
             }
           }
           else{
              JOptionPane.showMessageDialog(null,"La fecha es incorrecta ,mes incorrecto"); 
           }
        }
        else{
            JOptionPane.showMessageDialog(null,"La fecha es incorrecta ,dia incorrecto");
        }
        
    }
    
}

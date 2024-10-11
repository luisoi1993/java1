/*En megaPlaza se hace un 20% de descuento a los clientes cuya compra supere los
$300 ¿cual sera la cantidad que pagara una persona por su compra?
 
 */
package pkg20descuento;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio , descuento;
        
        precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio"));
        
        if(precio > 300){
             descuento = precio *20 / 100;
             precio = precio - descuento;
             JOptionPane.showMessageDialog(null, "EL precio tiene un 20% de descuento. el precio final es : "+precio);
        }
        else{
            JOptionPane.showMessageDialog(null,"El precio no tiene descuento . "+precio);
        }
    }
    
}

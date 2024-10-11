/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para 
gestionar las facturas.En cada factura figura: el código del articulo, la cantidad
vendida en litros y el precio del litro.Se pide de 5 facturas introducidas:
Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas facturas
se emitieron de mas de $600*/

package empresa_ventade_desinfectantes;

import javax.swing.JOptionPane;

public class Empresa_ventade_desinfectantes {

   
    public static void main(String[] args) {
       int codigo,litros,litrosArticulo1=0,contMayor600=0;
       float precioLitro,importeFactura,facturacionTotal=0;
       
       for (int i=1;i<=5;i++){
           codigo= Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el codigo: "));
           litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite la cantidad en litros : "));
           precioLitro=Float.parseFloat(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el precio por litro : "));
           
          importeFactura=(float)litros*precioLitro; 
          facturacionTotal+=importeFactura;
          
          if(codigo==1){
              litrosArticulo1+=litros;
          }
          if(importeFactura > 600){
              contMayor600++;
          }
       }
       
       System.out.println("Resumen de ventas: ");
       System.out.println("Fscturscion Totsl: "+facturacionTotal);
       System.out.println("Cantidad de litros vendidos del articulo 1"+litrosArticulo1);
       System.out.println("Cantidad de facturas mayores a $600: "+contMayor600);
    }
    
}

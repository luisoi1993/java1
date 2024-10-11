/*Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce
el precio por litro.Solo exixten tres productos con precios:
a-0.6 $/litro
b-3 $/litro
c-1.25 $/litro
 */
package modificacion_empresadesinfectantes;

import javax.swing.JOptionPane;


public class Modificacion_empresaDesinfectantes {

    public static void main(String[] args) {
       int codigo,litros,litrosArticulo1=0,contMayor600=0;
       float opcion,precioLitro=0,importeFactura,facturacionTotal=0;
       
       for (int i=1;i<=5;i++){
           codigo= Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el codigo: "));
           litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite la cantidad en litros : "));
           opcion=Integer.parseInt(JOptionPane.showInputDialog("Articulo nº"+i+"\nDigite el codigo del precio por litro : "));
           
           if(opcion==1){
               precioLitro+=0.6f;
               
           }
           else if(opcion==2){
               precioLitro=3;
            }
           else if(opcion==3){
               precioLitro=1.25f;
           }
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
       System.out.println("Cantidad de litros vendidos del articulo 1 "+litrosArticulo1);
       System.out.println("Cantidad de facturas mayores a $600: "+contMayor600);
    }
    
}

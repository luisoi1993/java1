/*En MegaPlaza se hace un 20% de descuento a los clientes
cuya compra supere los 300$.¿Cuál será la cantidad que 
pagará una persona por su compra
 */
package descuento;

import java.util.Scanner;

public class Descuento {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float factura,resultado,resultado2;
        
        System.out.println("Digite el valor de la factura: ");
        factura=entrada.nextFloat();
        
        if(factura>300){
            resultado=(factura /100)*20;
            resultado2=factura-resultado;
            System.out.println("La factura es: "+resultado2);
            
        }else{
            System.out.println("La factura es: "+factura);
        }
        
        
        
    }
    
}

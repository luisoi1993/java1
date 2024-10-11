/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer 
mediante el teclado 8 números. Después se debe pedir un número y una posición,
insertando en la posicion indicada, desplazando los que estén detrás. */

package array_incrustarunumero_desplazarlosdemas;

import java.util.Scanner;
public class Array_incrustarUnumero_desplazarlosDemas {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tabla[]= new int[10];
        int tabla2[]=new int[10];
        int numero,posicion;
        
        for(int i=0;i<8;i++){
            System.out.println("Digite un numero. ");
            tabla[i]=entrada.nextInt();
        }
        System.out.println("Digite un numero. ");
        numero=entrada.nextInt();
        System.out.println("Digite la posicion del numero. ");
        posicion=entrada.nextInt();
        
        tabla2[posicion]=numero;
        
        for(int i=0;i<posicion;i++){
            tabla2[i]=tabla[i];
        }
        
          for(int i=(posicion+1);i<10;i++){
            tabla2[i]=tabla[(i-1)];
        }
          
          for(int i=0;i<10;i++){
              System.out.println("Posicion"+(i+1)+"  "+tabla2[i]);
          }
    }
    
}

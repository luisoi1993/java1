/*Pedir 10 numeros. Mostrar la media de los numeros positivos, la media
de los numeros negativos y la cantidad de ceros
 */
package pkg10numeros_medianegativos_positivos_cantidadde0;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cont_negativos=0,numero,sum_negativos=0,cont_positivos=0,sum_positivos=0,cont_0=0;
        float resultado,resultado2;
        
        for(int i=0;i<10;i++){
            System.out.println("Digite un numero: ");
            numero=entrada.nextInt();
            
            if(numero<0){
                cont_negativos++;
                sum_negativos=sum_negativos+numero;
            }
            else if(numero>0){
                cont_positivos++;
                sum_positivos=sum_positivos+numero;
            }
            else{
                cont_0++;
            }
            
        }
       if(cont_positivos==0){
           System.out.println("No se puede sacar la media de los positivos: ");
       }
       else{
           resultado=(float)sum_positivos/cont_positivos;
           System.out.println("La media de numeros positivos es: "+resultado);
       }
       if(cont_negativos==0){
           System.out.println("No se puede sacar la media de los numeros negativos: ");
       }
       else{
           resultado2=(float)sum_negativos/cont_negativos;
           System.out.println("La media de los numeros negativos es: "+resultado2);
       }
       System.out.println("El total de ceros es: "+cont_0);
    }
    
}

/*Leer 5 numeros por teclado, almacenarlos en unarreglo y a
continuacion realizar la media de los numeros positivos, la media
de los negativos y contar el numero de 0*/

package array_5numeros_positivos_negativos_0;

import java.util.Scanner;
public class Array_5numeros_positivos_negativos_0 {

    
    public static void main(String[] args) {
        float numeros[]= new float[5];
        Scanner entrada =new Scanner(System.in);
        float suma_positivos=0,suma_negativos=0,media_positivos,media_negativos;
        int conteo_positivos=0,conteo_negativos=0,conteo_ceros=0;
        
        System.out.println("Guardando los numeros en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextFloat();
            
            if(numeros[i]==0){
                conteo_ceros++;
            }
            else if(numeros[i]>0){
                suma_positivos+=numeros[i];
                conteo_positivos++;
            }
            else{
                suma_negativos+=numeros[i];
                conteo_negativos++;
            }
        }
        
        if(conteo_positivos==0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else{
            media_positivos=suma_positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_positivos);
        }
        
        if(conteo_negativos==0){
            System.out.println("No se puede sacar la media de los numeros negativos: ");
        }
        else{
            media_negativos=suma_negativos/conteo_negativos;
            System.out.println("La media de los numeros negativos es: "+media_negativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }
    
}

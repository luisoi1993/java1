/*Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,otros 3 de A,
otros 3 de la B,etc.
 */
package arrays_3_12numeros;

import java.util.Scanner;
public class Arrays_3_12numeros {

    
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int a[],b[],c[];
       
       a=new int[12];
       b=new int[12];
       c=new int[24];
       
       System.out.println("Digite los valores del primer array: ");
       for(int i=0;i<12;i++){
           System.out.println((i+1)+". Digite un numero: ");
           a[i]=entrada.nextInt();
          
       }
       
       System.out.println("Digite los valores del segundo array: ");
       for(int i=0;i<12;i++){
           System.out.println((i+1)+"Digite un numero: ");
           b[i]=entrada.nextInt();
       }
       int contador=0,contador2=0,contador3=0;
       while(contador<24){
           for(int i=0;i<3;i++){
               c[contador]=a[contador2];
               contador++;
               contador2++;
           }
           for(int j=0;j<3;j++){
              c[contador]=b[contador3];
              contador++;
              contador3++;
           }
       }
       
       System.out.println("\nEl tercer array es: ");
       for(int i=0;i<24;i++){
           System.out.println(c[i]+" ");
       }
    }
    
}

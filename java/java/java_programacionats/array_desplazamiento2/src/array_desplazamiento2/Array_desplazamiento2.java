/*Crear un programa que lea por teclado una tabla de 10 números enteros y 
desplace N posiciones en el arreglo (N es digitado por el usuario). */

package array_desplazamiento2;

import java.util.Scanner;
public class Array_desplazamiento2 {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int tabla[]=new int [10];
        int tabla2[]=new int [10];
        int desplazamiento,numero=9,posicion=0,inicial=0;
        for(int i=0;i<10;i++){
            System.out.println("Digite un numero: ");
            tabla[i]=entrada.nextInt();
            }
        System.out.println("Digite el desplazamiento: ");
        desplazamiento=entrada.nextInt();
        
        for(int i=desplazamiento;i>0;i--){
            tabla2[posicion]=tabla[numero];
            posicion++;
            numero--;
        }
        
        for(int i=desplazamiento;i<10;i++){
           tabla2[i]=tabla[inicial];
           inicial++;
        }
        
        for(int i=0;i<10;i++){
            System.out.println("Posicion "+(i+1)+" "+tabla2[i]);
        }
    }
    
}

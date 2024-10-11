/*Leer por teclado una tabla de 10 elementos numericos enteros y una
posicion(entre 0 y 9).Eliminar el elemento situado en la posicion dada sin dejar
huecos 4*/
package array_borrarelemento;

import java.util.Scanner;
public class Array_borrarElemento {

  
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tabla[]=new int[10];
        int tabla2[]=new int[9];
        int borrar,borrar1;

        
        for(int i=0;i<10;i++){
            System.out.println("Digite un numero: ");
            tabla[i]=entrada.nextInt();
            
        }
        System.out.println("Digite la posicion del array a borrar: ");
        borrar=entrada.nextInt();
        
        if(borrar==0){
            for(int i=1;i<10;i++){
                tabla2[i]=tabla[i];
            }
        }
        else if(borrar==9){
            for(int i=0;i<9;i++){
                tabla2[i]=tabla[i];
            }
        }
        else{
            borrar1=borrar-1;
            for(int i=0;i<borrar1;i++){
             tabla2[i]=tabla[i];
        }
            for(int i=borrar+1;i<9;i++){
            tabla2[i]=tabla[i];
            }
       }
            for(int i=0;i<9;i++){
            System.out.println(tabla2[i]);
            }
    }
    
}

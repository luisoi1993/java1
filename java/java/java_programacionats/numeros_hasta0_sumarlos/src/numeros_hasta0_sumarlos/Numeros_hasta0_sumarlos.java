/*Pedir numeros hasta que se teclee un 0, mostrar la suma
de todos los numeros introducidos
 */
package numeros_hasta0_sumarlos;

import java.util.Scanner;
public class Numeros_hasta0_sumarlos {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero,sumador=0;

        System.out.println("Digite un numero: ");
        numero=entrada.nextInt();
        
       while(numero!=0){
           sumador=numero+sumador;
           System.out.print("Digite otro numero: ");
           numero=entrada.nextInt();
       }
        
       System.out.print("La suma de todos los numeros es: "+sumador);
    }
    
}

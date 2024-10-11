/*Pedir números hasta que se teclee un 0, mostrar la
suma de todos los números introducidos */
package pedirnumeros_hasta0_sumarlos;


import java.util.Scanner;

public class Pedirnumeros_hasta0_sumarlos {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n,suma=0;
        
        do{
            System.out.println("Dime números: ");
            n=entrada.nextInt();
            
            suma+= n;
        }while(n!=0);
            System.out.println(suma);
        
        
        
    }
    
}

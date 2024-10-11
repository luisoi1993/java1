//Pedir 10 números y escribir la suma total

package pkg10numeros_sumatotal;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,suma=0;
        
        for(int contador=1;contador<=10;contador++){
            System.out.println("Digite un numero: ");
            num=entrada.nextInt();
            suma=suma+num;
            
        }
        System.out.println("El resultado es: "+suma);
    }
    
}

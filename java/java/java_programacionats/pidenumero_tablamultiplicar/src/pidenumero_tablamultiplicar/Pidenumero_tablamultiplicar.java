/*Pide un numero(que debe estar entre 0 y 10) y mostrar la tabla
de multiplicar de dicho numero */



package pidenumero_tablamultiplicar;

import java.util.Scanner;

public class Pidenumero_tablamultiplicar {

   
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num,resultado;
        
        System.out.print("Digite un numero entre 1 y 10: ");
        num=entrada.nextInt();
        
        for(int i=1;i<11;i++){
            resultado=num*i;
            System.out.println(num+" x "+i+"="+resultado);
        }
    }
    
}

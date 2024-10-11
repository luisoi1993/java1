//Pedir un número y calcular su factorial

package numero_calcularsufactorial;

import java.util.Scanner;

public class Numero_calcularsufactorial {

   
    public static void main(String[] args) {
        int num;
        double resultado=1;
        Scanner entrada=new Scanner(System.in);
       
        System.out.println("Digite un numero: ");
        num=entrada.nextInt();
        
        while(num>1){
            resultado=resultado*num;
            num--;
        }
        
        System.out.println("El factorial del numero es: "+resultado);
        
    }
    
}

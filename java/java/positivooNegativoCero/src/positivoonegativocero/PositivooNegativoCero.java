/*Leer un numero e indicar si es positivo o negativo el proceso se repetira
hasta que se introduzca 0
 */
package positivoonegativocero;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class PositivooNegativoCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite un numero");
        numero = entrada.nextInt();
        
        while(numero != 0){
            if(numero >0){
                System.out.println("EL numero es positivo");
            }
            else{
                System.out.println("EL numero es negativo");
            }
            
           System.out.println("Digite un numero");
           numero = entrada.nextInt(); 
        }
    }
    
}

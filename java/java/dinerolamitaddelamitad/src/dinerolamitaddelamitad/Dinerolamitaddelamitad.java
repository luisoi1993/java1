/*
 guillermo tiene N dolares. Luis tiene la mitad de lo que posee guillermo.
Juan tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que 
poseen Luis y Guillermo juntos.Hacer un programa que calcule e imprima la cantidad
de dinero que tienen los tres
 */
package dinerolamitaddelamitad;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Dinerolamitaddelamitad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo , luis , juan , total;
        
       System.out.print("Digite la cantidad de dinero que tiene Guillermo: ");
       guillermo = entrada.nextFloat();
       
       luis = guillermo/2; //Luis tiene la mitad de guillermo 
       
       juan=(guillermo+luis)/2;
       
       total = guillermo+luis+juan;
       
       System.out.print("\nLa cantidad total de dinero es:"+total);
      
    }
    
}

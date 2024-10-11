/*Guillermo tiene N dolares. Luis tiene la mitad de lo que 
posee Guillermo. Juan tiene la mitad de lo que poseen Luis y 
Guillermo juntos. Hacer un programa que calcule e imprima la
cantidad de dinero que tienen entre los tres*/
package calcula_el_dinero_detres;

import java.util.Scanner;




public class Calcula_el_dinero_detres {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.println("Digite la cantidad dedinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo /2; 
        
        juan = (luis + guillermo) /2;
        
        total= guillermo+luis+juan;
        
        System.out.println("Los tres juntos tienen: "+total);
       
    }
    
}

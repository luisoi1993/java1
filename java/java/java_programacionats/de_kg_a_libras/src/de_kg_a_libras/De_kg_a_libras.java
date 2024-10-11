/*Hacer un programa que pase de Kg a otra unidad de medida
de masa, mostrar en pantalla un menú con las opciones 
posibles */
package de_kg_a_libras;

import java.util.Scanner;

public class De_kg_a_libras {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        float resultado,kg;
        
        System.out.println("Elige una opcion del menu:\n "
                + "1:  Pasar de kilos a libras.\n "
                + "2: Fin");
        num=entrada.nextInt();
        
        switch(num){
            case 1: System.out.println("Digite el total de kg: ");
                    kg=entrada.nextFloat();
                    resultado=kg*2.205f;
                    System.out.println("El resultado en libras es: "+resultado);
                    break;
            case 2: break;
            default: System.out.println("Ha elejido una opcion incorrecta en el menu");
        }
    }
    
}

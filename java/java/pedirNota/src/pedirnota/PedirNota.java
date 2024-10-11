/*Pedir una nota de 0 a 10 y mostrarla de la forma: insuficiente , Suficiente , 
Bien , notable y Sobrresaliente
 */
package pedirnota;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class PedirNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        
        System.out.println("Digite la nota: ");
        nota = entrada.nextInt();
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("Inesuficiente. Nota: "+nota);
                    break;
            case 5: System.out.println("Suficiente. Nota: "+nota);
                    break;
            case 6: System.out.println("Bien. Nota. "+nota);
                    break;
            case 7: 
            case 8: System.out.println("Notable. Nota. "+nota);
                    break;
            case 9:
            case 10: System.out.println("Sobresaliente. Nota: "+nota);
        }
    }
    
}

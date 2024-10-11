/*Construir un programa que calcule y muestre por pantalla las raices de la 
ecuaccion de segundo grado de coeficientes reales
 */
package raicesecuacionsegundogrado;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class RaicesEcuacionSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a ,b ,c ;
        System.out.println("Ingrese los coeficientes de a , b , c ");
        Scanner reader = new Scanner(System.in);
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();
        double discriminante = pow(b,2) - 4*a*c;
        if(discriminanse == 0){
            double x = -b/(2*a);
            System.out.printf("LA raiz unica es %.3f%n", x);
        }
        else{
            double x1 = (-b+sqrt(discriminante))/(2*a);
            double x2 = (-b-sqrt(discriminante))/(2*a);
            System.out.printf("LA raiz x1 es %.3f%n",x1);
            System.out.printf("LA raiz x2 es %.3f%n",x2);
        }
        
    }
    
}

/*La calificaion final de un estudiante de informatica se calcula con base a las
calificaciones de cuatro aspectos de su rendimiento academico: participaron, 
primer exmen parcial, segundo examen parcial y examen final. Sabiendo que las 
calificaciones anteriores entrar a la calificacion final con ponderaciones del 
10%,25%,25% y 40%. Hacer un programa que calcule e imprima la calificacion final 
obtenido por un estudiante.
 */
package calificacionfinal;

import java.util.Scanner;


public class CalificacionFinal {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float nota1,nota2,nota3,nota4,resultado;
        
        System.out.println("Digite la nota de participacion: ");
        nota1=entrada.nextFloat();
        nota1=nota1*10/100;
        
        System.out.println("Digite la nota del primer parcial: ");
        nota2=entrada.nextFloat();
        nota2=nota2*25/100;
        
        System.out.println("Digite la nota del segundo parcial: ");
        nota3=entrada.nextFloat();
        nota3=nota3*25/100;
        
        System.out.println("Digite la nota del examen parcial : ");
        nota4=entrada.nextFloat();
        nota4=nota4*40/100;
        
        resultado=nota1+nota2+nota3+nota4;
        
        System.out.println("La nota final es : "+resultado);
        
    }
    
}

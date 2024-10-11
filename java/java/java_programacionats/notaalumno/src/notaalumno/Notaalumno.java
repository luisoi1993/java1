/*La calificación final de un estudiante de informática se calcula con base a las
calificaciones de cuatro aspectos de su rendimíento académico: participación,
primer examen parcial, segundo examen parcial y examen final
Sabiendo que las calificaciones anteriores entran a la calificaión final con
ponderaciones del 10%,25%,25%,40%, Hacer un programa que calcule e imprima la
calificación final obtenida por el estudiante */

package notaalumno;

import java.util.Scanner;


public class Notaalumno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        
        System.out.print("Digite la nota de paricipacion: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la nota del primer examen parcial: ");
        primerExamen=entrada.nextFloat();
        System.out.print("Digite la nota del segundo examen parcial: ");
        segundoExamen=entrada.nextFloat();
        System.out.print("Digite la nota del examen final: ");
        examenFinal=entrada.nextFloat();
        
        participacion = participacion * 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal = participacion +primerExamen +segundoExamen + examenFinal;
        
        System.out.print("\nLa nota final es: "+notaFinal);
        
        
       
    }
    
}

/*Construir un programa que calcule y muestre por pantalla
las raíces de la ecuación de segundo grado de coeficientes 
reales. */
package ecuacion_segundo_grado;

import java.util.Scanner;
import java.lang.Math;

public class Ecuacion_segundo_grado {

    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double a,b,c; //Valores de la ecuación de 2º grado
      double resultado,resultado2; //posibles resultaddos
      
      System.out.println("Valor a: ");
      a = entrada.nextDouble();
      System.out.println("Valor b: ");
      b=entrada.nextDouble();
      System.out.println("Valor c: ");
      c=entrada.nextDouble();
      
      double numero = (b*b) - (4*a*c);
      if(numero>0){
          resultado=(-b + Math.sqrt(numero))/2*a;
          resultado2=(-b - Math.sqrt(numero))/2*a;
          System.out.println("La ecuacion tiene dos soluciones");
          System.out.println("Resultado: "+resultado);
          System.out.println("Resultado2: "+resultado2);
          
      }else {
          if(numero == 0){
              resultado=(-b) / 2*a;
              System.out.println("La ecuacion tiene una soluciones: ");
              System.out.println("Resultado: "+resultado);
          } else{
              System.out.println("La ecuacion no tine solución: ");
          }
      }
    }
 
}

/*Una compañia de venta de carros usados,paga a su personal de ventas un salario
de $1000 mensuales, mas una comisión  de $150 por cada carro vendido , mas el 
5% del valor de la venta del carro.Cada mes el capturista de la empresa ingresa
en la computadora los datos pertinentes .Hacer un programa que calcule e imprima 
el salario mensual de un vendedor dado.
 */

package companiacochescomision;

import java.util.Scanner;


public class CompaniacochesComision {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float resultado,dinero=1000,num=0,num2;
        int numero;
        
        System.out.println("Digite el numero de coches vendidos: ");
        numero=entrada.nextInt();
        
        resultado=numero*150;
        
        for(int i=0;i<numero;i++){
            System.out.println("Digite el valor del coche numero: "+(i+1));
            num2=entrada.nextFloat();
            num2=num2*5/100;
            num=num+num2;
        }
        
        dinero=dinero+resultado+num;
        
        System.out.println("El sueldo del empleado es: "+dinero);
        
        
    }
    
}

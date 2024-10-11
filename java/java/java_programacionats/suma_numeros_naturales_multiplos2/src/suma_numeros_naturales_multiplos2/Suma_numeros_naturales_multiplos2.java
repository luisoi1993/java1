/* Haz un programa que sume los primeros 20 números múltiplos 
de 3 y 5 a partir del 1. */
package suma_numeros_naturales_multiplos2;


public class Suma_numeros_naturales_multiplos2 {

    
    public static void main(String[] args) {
        int numero,sumatorio_3=0,sumatorio_5=0;
        
        for(int i=1;i<20;i++){
            numero= 3*i;
            sumatorio_3=sumatorio_3+numero;
        }
        
        for(int i=1;i<20;i++){
            numero= 5*i;
            sumatorio_5=sumatorio_5+numero;
        }
        
        System.out.println("La suma de los multiplos de 3 es: "+sumatorio_3);
        System.out.println("La suma de los multiplos de 5 es: "+sumatorio_5);
    }
    
}

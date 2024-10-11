/*Pedir 10 numeros.Mostrar la media de los numeros
positivos, la media de los numeros negativos y la cantidad
de ceros
 */
package pkg10numeros_mediapositivos_megativos_cantidad0;

import javax.swing.JOptionPane;

public class Main {

   
    public static void main(String[] args) {
       int numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
       float media_pos,media_neg;
       
       for(int i=1;i<=10;i++){
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
           
           if(numero==0){ //Si el numero es 0
               conteo_ceros++; //Aumentamos en 1 el conteo de 0
           }
           else if(numero>0){
               suma_pos +=numero;
               conteo_pos++;
           }
           else{ //si el numero es negativo
               suma_neg += numero;
               conteo_neg++;
           }
       }
       
       //Tratamos con los positivos
       if(conteo_pos==0){
           System.out.println("No se puede sacar la media de los positivos");
       }
       else{
           media_pos=(float)suma_pos/conteo_pos;
           System.out.println("La media de los numeros positivoss es: "+media_pos);
       }
       
       //tratamos con los negativos
       if(conteo_neg==0){
           System.out.println("No se puede sacar la media de los negativos");
       }
       else{
           media_neg=(float) suma_neg/conteo_neg;
           System.out.println("La media de los negativos es: "+media_neg);
       }
       
       System.out.print("La cantidad de ceros es: "+conteo_ceros);
    }
    
}

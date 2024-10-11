
package ClasesyObjetos;

import javax.swing.JOptionPane;


public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicar;
    int dividir;
    
    //metodos
    
    //metodo para pedirle al usuario que nos digite dos numeros
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        }
    
    //metodo para sumar ambos numeros
    public void sumar(){
        suma=numero1+numero2;
    }
    
    //metodo para restar ambos numeros
    public void restar(){
        resta=numero1-numero2;
    }
    //Metodo para multilicar ambos numeros
    public void multiplicar(){
        multiplicar=numero1*numero2;
    }
    //Metodo para dividir ambos numeros
    public void dividir(){
        dividir=numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multipicacion es: "+multiplicar);
        System.out.println("La divison es "+dividir);
    }
}

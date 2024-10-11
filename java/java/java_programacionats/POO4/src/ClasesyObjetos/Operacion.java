
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
    
    
    
    //metodo para sumar ambos numeros
    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;
       
    }
    
    //metodo para restar ambos numeros
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
       
    }
    //Metodo para multilicar ambos numeros
    public void multiplicacion(int numero1,int numero2){
        multiplicar=numero1*numero2;
       
    }
    //Metodo para dividir ambos numeros
    public void division(int numero1,int numero2){
        dividir=numero1/numero2;
       
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multipicacion es: "+multiplicar);
        System.out.println("La divison es "+dividir);
    }
}


package ClasesyObjetos;


public class coche {
    String color;
    String marca;
    int km;
    
    public static void main(String [] args){
        coche coche1= new coche();
        
        coche1.color = "Blanco";
        coche1.marca="Audi";
        coche1.km=0;
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);
        System.out.println("El kilometraje del ccoche1 es:"+coche1.km);
        
        coche coche2=new coche();
        
        coche2.color="Rojo";
        coche2.marca="Ferrari";
        coche2.km=100;
        
        
        System.out.println("\nEl color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje del ccoche2 es:"+coche2.km);
        
    }
    
}

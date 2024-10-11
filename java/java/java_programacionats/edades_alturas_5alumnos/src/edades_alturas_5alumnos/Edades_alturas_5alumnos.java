/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura 
media, la cantidad de alumnos mayores de 18 años y la cantidad e alumnos 
que miden mas de 1,75
 */
package edades_alturas_5alumnos;

import java.util.Scanner;
public class Edades_alturas_5alumnos {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad,may18=0,cont18=0,sumaedad=0,cont75=0;
        float estatura,edad_media,est_media,sumaest=0;
        
        for(int i=0;i<5;i++){
            System.out.println("Digite la edad: ");
            edad=entrada.nextInt();
            System.out.println("Digite la estatura: ");
            estatura=entrada.nextFloat();
            
            sumaedad=sumaedad+edad;
            sumaest=sumaest+estatura;
            
            if(edad>18){
             cont18++;   
            }
            if(estatura>1.75f){
                cont75++;
            }
            
        }
        edad_media=(float)sumaedad/5;
        est_media=(float)sumaest/5;
        
        System.out.println("La edad media es: "+edad_media);
        System.out.println("La altura media es: "+est_media);
        System.out.println("Los alumnos mayores de edad son: "+cont18);
        System.out.println("Los alumnos que miden mas de 1,75 son: "+cont75);
    }
    
}

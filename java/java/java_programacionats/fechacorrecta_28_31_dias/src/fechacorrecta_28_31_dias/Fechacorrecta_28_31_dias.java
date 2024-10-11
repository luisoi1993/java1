/*
Pedir el dia,mes y año de una fecha e indicar si la fecha es correcta.
Con meses de 28,30,31 días. Sin años bisiestos.
 */
package pedirfecha_y_comprobar_si_es_correcto;

import java.util.Scanner;


public class Pedirfecha_y_comprobar_si_es_correcto {

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
 int dia,mes,año;
 int dias_del_mes;
 boolean fecha_correcta=true;
 System.out.print("Introduzca día: ");
 dia=entrada.nextInt();
 System.out.print("Introduzca mes: ");
 mes=entrada.nextInt();
 System.out.print("Introduzca año: ");
 año=entrada.nextInt();
 dias_del_mes = 0; // si se utiliza un mes fuera del rango 1..12
 // supondremos que los días del mes son 0.
 if(año==0) // el único año que no existe es el 0
 fecha_correcta = false;
 if (dia<1 || dia >31) // un día fuera del rango 1..31 no tiene sentido
 fecha_correcta = false;
 if (mes<1 || mes >12) // un mes fuera del rango 1..12 no tiene sentido
 fecha_correcta = false;
 if(mes==2 )
 dias_del_mes = 28;
 if(mes==4 || mes==6 || mes==9 || mes==11)
 dias_del_mes = 30;
 if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
 dias_del_mes = 31;
 if (dia > dias_del_mes)
 fecha_correcta = false;
 if (fecha_correcta)
 System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
 else
 System.out.println("Fecha incorrecta");
 }
}

      
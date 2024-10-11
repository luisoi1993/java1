/*
 
 */
package gestionlibreria;
import java.util.Scanner;
import java.time.LocalDate;


public class GestionLibreria {
    
    static Scanner entrada=new Scanner(System.in);
    private static final int maxLibros = 100 ;
    static libro[] libros = new libro[maxLibros];
    static int librosDisponibles=0;
    
    static void altaLibro() {
        if(librosDisponibles < maxLibros){
            String nombreLibro;
            String nombreAutor;
            String ISBN;
            String editorial;
            int numLibro;
            double nEjemplares;
            Libreria libreria;
            LocalDate fechaAlta;
            double contadorVenta;
            
            System.out.println("Digite los datos del nuevo libro: ");
            System.out.println("Digite el nombre del libro: ");
            nombreLibro=entrada.nextLine();
            System.out.println("Digite el nombre del autor");
            nombreAutor=entrada.nextLine();
            System.out.println("Digite el ISBN: ");
            ISBN=entrada.nextLine();
            System.out.println("Digite la editorial: ");
            editorial=entrada.nextLine();
            libreria = introducirLibreria();
            fechaAlta=LocalDate.now();
            contadorVenta=0;
            System.out.println("Digite el numero de libros: ");
            nEjemplares=entrada.nextDouble();
            
            libro l = new libro(nombreLibro, nombreAutor, ISBN);
            l.seteditorial(editorial);
            l.setnEjemplares(nEjemplares);  
            l.setFechaAlta(fechaAlta);
            l.setcontadorVenta(contadorVenta);

            libros[librosDisponibles] = l;  
            librosDisponibles++;
            System.out.println("El libro se ha registrado correctamente: ");
            
        }
        
         else {
            System.out.println("Capacidad maxima del sistema alcanzada."
                    + " No se puede dar de alta nuevos libros.");
        }
        
    }
    static void rellenaLibros() {
        
        libro l= new libro("El capital", "Karl Marx", "9788445907450");
        l.seteditorial("EDITORS");
        l.setLibreria(Libreria.BARDON);  
        l.setFechaAlta(LocalDate.now());
        l.setnEjemplares(1000);
        libros[librosDisponibles] = l;  
        librosDisponibles++;
        
       
        l= new libro("LA CULTURA DEL MAL: UNA GUIA DEL ANTIAMERICANISMO", "MONCHO TAMAMES", "9788495058638");
        l.seteditorial("EDICIONES 2010");
        l.setLibreria(Libreria.RAFAEL_SOLAZ);  
        l.setFechaAlta(LocalDate.now());
        l.setnEjemplares(582);
        libros[librosDisponibles] = l; 
        librosDisponibles++;
        
         
        l= new libro("El ejercito traicionado", "Heinrich Gerlach", " ");
        l.seteditorial("noger");
        l.setLibreria(Libreria.DESNIVEL);  
        l.setFechaAlta(LocalDate.now());
        l.setnEjemplares(678);
        libros[librosDisponibles] = l; 
        librosDisponibles++;
    }
    
     static void bajaLibro() {
        int indice;
        System.out.println("BAJA DE LIBRO");
        System.out.print("Introduce el numero de libro (0, SALIR):");
        int nLibro = entrada.nextInt();
        boolean encontrado = false;
        for(indice=0; indice < librosDisponibles && !encontrado; indice++) {
            if ( (libros[indice].numLibro) == nLibro) {
                encontrado = true;
                break;  
            }
        }
        if (encontrado) {
            
            if(libros[indice].nEjemplares==0){
                libros[indice] = null;
                compactarArray(indice);
                librosDisponibles--;
            
            System.out.print("Libro borrado. ");
            }
            
            else{
                System.out.println("Todavia quedan ejemplares.. \n");
                System.out.println("No se puede borrar. ");
            }
            
        } 
        else {
            System.out.print("No se ha encontrado el libro solicitado. ");
        }
        System.out.print("Pulse Intro para continuar...");
        entrada.nextLine();      
    }
     
      static void compactarArray(int indice) {
        while(libros[indice+1] != null) {
            libros[indice] = libros[indice+1];
            indice++;
        }
        libros[indice+1] = null; // 
        }
      
      static void listarLibros() {
        System.out.println("LISTADO DE LIBROS");
        for(int i = 0; i < librosDisponibles; i++ ) {
            System.out.println(libros[i]); 
            System.out.print("Intro para continuar:");
            entrada.nextLine();
        }
      }
      
      static Libreria introducirLibreria() {
        boolean terminado;
        Libreria libreria = Libreria.BARDON;
        do {
            terminado = true;
            System.out.print("Libreria (1.BARDON. 2.RAFAEL_SOLAZ. 3.DESNIVEL : )");
            int nombreLibreria = entrada.nextInt();
            switch(nombreLibreria) {
                case 1: 
                    libreria = Libreria.BARDON;
                    break;
                case 2: 
                    libreria  = Libreria.RAFAEL_SOLAZ;
                    break;   
                case 3: 
                    libreria = Libreria.DESNIVEL;
                    break;

                default:
                    terminado = false;
                    System.out.println("Error. Opcion incorrecta.");
            }
        } while(terminado != true);
        
        return libreria;
    }
      
    static void listarLibros(libro[] l) {
        System.out.printf("%-5s%-15s%-25s%-10s%12s%n", 
        "NUM", "NOMBRE LIBRO", "NOMBRE AUTOR", "ISBN", "NUMERO EJEMPLARES");
        for(int i=0; i <librosDisponibles; i++) {
            System.out.printf("%-5s%-15s%-25s%-10s%12.2f%n",
            l[i].numLibro,
            l[i].nombreLibro,
            l[i].nombreAutor,
            l[i].ISBN,
            l[i].nEjemplares);
                       
        }
    }
    
     static int buscaLibro(int nLibro) {
        boolean encontrado = false;
        int indice;
        for(indice=0; indice < librosDisponibles && !encontrado; indice++) {
            if ( (libros[indice].numLibro) == nLibro) {
                encontrado = true;
                break; 
            }
        }
        if (!encontrado) {
            indice = -1;
        }
        return indice;
    }
      
   static void aumentarStock() {
        int indice;
        double stock;
        System.out.println("Aumentar el Stock ");
        System.out.print("Introduce el numero de libro (0, SALIR):");
        int nLibro = entrada.nextInt();
        
        indice = buscaLibro(nLibro);
        if (indice != -1) {
            System.out.println("Libro: " + libros[indice].nombreLibro +"\n"+
                                "Autor: "   + libros[indice].nombreAutor+"\n" +
                                "Stock: "  + libros[indice].nEjemplares); 
            System.out.print("Digite el nuevo stock a sumar: ");
            stock = entrada.nextDouble();
            libros[indice].nEjemplares = libros[indice].nEjemplares+stock;    
            System.out.print("STOCK actualizado. ");
        } 
        else {
            System.out.print("No se ha encontrado el libro solicitado. ");
        }
        System.out.print("Pulse Intro para continuar...");
        entrada.nextLine();      
    }
   static void reducirStock() {
        int indice;
        double stock;
        System.out.println("Reducir el Stock ");
        System.out.print("Introduce el numero de libro (0, SALIR):");
        int nLibro = entrada.nextInt();
        
        indice = buscaLibro(nLibro);
        if (indice != -1) {
            System.out.println("Libro: " + libros[indice].nombreLibro +"\n"+
                                "Autor: "   + libros[indice].nombreAutor+"\n" +
                                "Stock: "  + libros[indice].nEjemplares); 
            System.out.print("Digite el nuevo stock a restar: ");
            stock = entrada.nextDouble();
            libros[indice].nEjemplares = libros[indice].nEjemplares-stock;
            libros[indice].contadorVenta = libros[indice].contadorVenta+stock;
            System.out.print("STOCK actualizado. ");
        } 
        else {
            System.out.print("No se ha encontrado el libro solicitado. ");
        }
        System.out.print("Pulse Intro para continuar...");
        entrada.nextLine();      
    }
   
    static void buscarNombreLibro() {
        String buscar;
        System.out.println("Digite el nombre a buscar: ");
        buscar=entrada.nextLine();
        int contador=0;
        boolean encontrado=false;
        
        for(int i=0;i<librosDisponibles;i++){
            String sTexto;
            sTexto=libros[i].nombreLibro;
            contador=0;
            
            while (sTexto.indexOf(buscar) > -1) {
                sTexto = sTexto.substring(sTexto.indexOf(
	        buscar)+buscar.length(),sTexto.length());
                contador++; 
	    }
            
            if(contador>0){
                String continuar;
                System.out.println(libros[i]); 
                System.out.println("Pulse 1 tecla para continuar.....");
                continuar=entrada.nextLine();
                encontrado=true;
            }

        }
        if(encontrado=false){
            System.out.println("No se han encontrado coincidencias. ");
        }
            
	   

	}
    static void buscarNombreAutor() {
        String buscar;
        System.out.println("Digite el nombre a buscar: ");
        buscar=entrada.nextLine();
        int contador=0;
        boolean encontrado=false;
        
        for(int i=0;i<librosDisponibles;i++){
            String sTexto;
            sTexto=libros[i].nombreAutor;
            contador=0;
            
            while (sTexto.indexOf(buscar) > -1) {
                sTexto = sTexto.substring(sTexto.indexOf(
	        buscar)+buscar.length(),sTexto.length());
                contador++; 
	    }
            
            if(contador>0){
                String continuar;
                System.out.println(libros[i]); 
                System.out.println("Pulse 1 tecla para continuar.....");
                continuar=entrada.nextLine();
                encontrado=true;
            }

        }
        if(encontrado==false){
            System.out.println("No se han encontrado coincidencias. ");
        }
            
	   

	}
   
   static void menu() {
        int opcion;
        do {
            System.out.println("\nAPLICACION GESTION LIBRERIA\n");
            System.out.println("1. Dar de alta libro.");
            System.out.println("2. Añadir ejemplares al STOCK de un libro.");
            System.out.println("3. Vender ejemplares de un libro.");
            System.out.println("4. Listar libros.");
            System.out.println("5. Buscar por nombre del libro.");
            System.out.println("6. Buscar por nombre de autor.");
            System.out.println("7. Baja de libros.");
            System.out.println("8. Cargar usuarios pregenerados.");
            System.out.println("9. Salir de la aplicacion.");
            
            System.out.print("\nElige opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 
            switch(opcion) {
                case 1:
                    altaLibro();
                    break;
                case 2:
                    aumentarStock();
                     break;
                case 3:
                    reducirStock();
                    break;
                case 4:
                    listarLibros(libros);
                    break;
                case 5: 
                    buscarNombreLibro();
                    break;
                case 6: 
                    buscarNombreAutor();
                    break;
                case 7:
                    bajaLibro();
                    break;
                case 8:
                    rellenaLibros();
                    break;
                        
                case 9:
                    
                    System.out.print("Realmente desea salir (S/N): ");
                    String confirmacion = entrada.nextLine().toLowerCase();
                    if (confirmacion.equals("n")) {
                        opcion = 0; 
                    }
                    break;
                
                default: 
                   System.out.println("Opcion no valida. Pulse Intro para continuar"); 
                   entrada.nextLine();
                    
            }
        } while(opcion != 9);
        
    }
    
    
    public static void main(String[] args) {
       
        menu();
    }
    
}

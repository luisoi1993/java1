/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlibreria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class libro {
    String nombreLibro;
    String nombreAutor;
    String ISBN;
    String editorial;
    int numLibro;
    double nEjemplares;
    Libreria libreria;
    LocalDate fechaAlta;
    double contadorVenta;
    
    static int contadorLibro =1;
    
    public libro(){
        this.numLibro=contadorLibro;
        contadorLibro++;
    }
    
    public libro(String nombreLibro,String nombreAutor,String ISBN){
        this();
        this.nombreLibro=nombreLibro;
        this.nombreAutor=nombreAutor;
        this.ISBN=ISBN;
    }    

    public String getnombreLibro() {
        return nombreLibro;
    }

    public void setnombreLibro(String nombreLimbro) {
        this.nombreLibro = nombreLibro;
    }

    public String getnombreAutor() {
        return nombreAutor;
    }

    public void setnombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    public String ISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String geteditorial() {
        return editorial;
    }

    public void seteditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getnumLibro() {
        return numLibro;
    }
   
    public double getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(double nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    
      public Libreria getLibreria() {
        return libreria;
    }

    public void setLibreria(Libreria libreria) {
        this.libreria = libreria;
    }
    
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    private String getFechaFormateada(LocalDate date) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formato);
    }
    
     public double getcontadorVenta() {
        return contadorVenta;
    }

    public void setcontadorVenta(double contadorVenta) {
        this.contadorVenta = contadorVenta;
    }
    
    @Override  
    
    public String toString() {
        String resul = 
            "=====================================\n" +
            "Numero de libro: " + numLibro + "\n" +
            "Nombre del libro:  " + nombreLibro + "\n" +
            "Nombre del autor: " + nombreAutor + "\n" +
            "ISBN: " + ISBN + "\n" +
            "Nombre de la editorial: " + editorial + "\n" +
            "Libreria: " + libreria + "\n"  +
            "Fecha de alta: " +  getFechaFormateada(fechaAlta) + "\n" +
            "Total ventas: " +  contadorVenta + "\n" +   
            "-------------------------------------";
        return resul;
    }
    
}


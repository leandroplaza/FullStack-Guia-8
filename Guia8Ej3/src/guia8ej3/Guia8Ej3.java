/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3;

import entidad.alumno;
import java.util.Scanner;
import servicios.serviciosAlumnos;

/**
 *
 * @author ezepl
 */
public class Guia8Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        serviciosAlumnos servAlumnos = new serviciosAlumnos();
        servAlumnos.crearAlumno();
        servAlumnos.mostrarAlumno();
        servAlumnos.notaFinal();
    
}
}
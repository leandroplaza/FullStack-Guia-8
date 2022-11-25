/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.alumno;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class serviciosAlumnos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    ArrayList<alumno> alumnos = new ArrayList();

    public void crearAlumno() {

        String resp = "";
        do {

            alumno alum = new alumno();

            System.out.println("Ingrese su nombre");
            alum.setNombre(leer.next());
            System.out.println("Ingrese la nota del periodo 1");
            int nota1 = leer.nextInt();
            alum.getNotas().add(nota1);
            System.out.println("Ingrese la nota del periodo 2");
            int nota2 = leer.nextInt();
            alum.getNotas().add(nota2);
            System.out.println("Ingrese la nota del periodo 3");
            int nota3 = leer.nextInt();
            alum.getNotas().add(nota3);
            alumnos.add(alum);
            System.out.println("Si desea agregar otro alumno,presione S/s, de lo contrario presione N/n");
            resp = leer.next();
            if (!resp.equalsIgnoreCase("n") && !resp.equalsIgnoreCase("s")) {
                System.out.println("EL caracter ingresado no es valido, ingrese una respuesta nuevamente");
                resp = leer.next();
            }
        } while (resp.equalsIgnoreCase("s"));
    }

    public void mostrarAlumno() {
        for (alumno aux : alumnos) {
            System.out.println(aux.toString());

        }
    }

    public void notaFinal() {
        boolean aux = false;
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final");
        String nombre;
        do {
        nombre = leer.next();
            for (int i = 0; i < alumnos.size(); i++) {

            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                calcularNotaFinal(i);
                aux = true;

            }
            if (aux == false) {
                System.out.println("El alumno no se encuentra en la lista, ingreselo nuevamente");

            }
        }    
        } while (aux==false);
        
        
    }

    public void calcularNotaFinal(int aux) {
        System.out.println("la nota final del alumno " + alumnos.get(aux).getNombre() + " es: ");
        System.out.println((alumnos.get(aux).getNotas().get(0) + alumnos.get(aux).getNotas().get(1) + alumnos.get(aux).getNotas().get(2)) / 3);
    }

}

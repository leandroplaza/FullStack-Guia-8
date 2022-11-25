/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import utilidades.comparadores;

/**
 *
 * @author ezepl
 */
public class serviciosPeliculas {
    comparadores comp = new comparadores();
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    ArrayList<pelicula> peliculas = new ArrayList();

    public void crearPelicula() {

        String resp = "";
        do {

            pelicula peli = new pelicula();

            System.out.println("Ingrese el titulo de la pelicula");
            peli.setTitulo(leer.next());
            System.out.println("Ingrese el director ");
            peli.setAutor(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            peli.setDuracion(leer.nextDouble());

            peliculas.add(peli);
            System.out.println("Si desea agregar otra pelicula, presione S/s, de lo contrario presione N/n");
            resp = leer.next();
            if (!resp.equalsIgnoreCase("n") && !resp.equalsIgnoreCase("s")) {
                System.out.println("EL caracter ingresado no es valido, ingrese una respuesta nuevamente");
                resp = leer.next();
            }
        } while (resp.equalsIgnoreCase("s"));
    }

    public void mostrarPeliculas() {
        System.out.println("La lista de peliculas agregadas a la lista son: ");
        for (pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
    }

    public void mostrarPeliculasMayor() {
        System.out.println("Las peliculas de duracion mayor a 1 hora son : ");
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getDuracion() > 1) {
                System.out.println(peliculas.get(i));
            }

        }
        System.out.println("-------------------------------------------------------");
    }
  
public void mostrarMayorMenor(){
    Collections.sort(peliculas,comp.duracionMayor);
    System.out.println("Las peliculas ordenadas de mayor a menor   se muestran asi: ");
    for (int i = 0; i < peliculas.size(); i++) {
        
        System.out.println(peliculas.get(i));
    }
    System.out.println("-------------------------------------------------------");
}
public void mostrarMenorMayor(){
    Collections.sort(peliculas,comp.duracionMenor);
    System.out.println("Las peliculas ordenadas de menor a mayor se muestran asi: ");
    for (int i = 0; i < peliculas.size(); i++) {
        
        System.out.println(peliculas.get(i));
    }
    System.out.println("-------------------------------------------------------");
}
public void Titulo(){
    Collections.sort(peliculas,comp.titulo);
    System.out.println("Las peliculas segun su titulo ordenadas alfabeticamente se muestran asi : ");
    for (int i = 0; i < peliculas.size(); i++) {
        
        System.out.println(peliculas.get(i));
    }
    System.out.println("-------------------------------------------------------");
}
public void Director(){
    Collections.sort(peliculas,comp.director);
    System.out.println("Las peliculas segun su director ordenadas alfabeticamente se muestran asi : ");
    for (int i = 0; i < peliculas.size(); i++) {
        
        System.out.println(peliculas.get(i));
    }
System.out.println("-------------------------------------------------------");
}

}

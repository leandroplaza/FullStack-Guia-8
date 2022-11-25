/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej4;

import servicios.serviciosPeliculas;

/**
 *
 * @author ezepl
 */
public class Guia8Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviciosPeliculas servPeli = new serviciosPeliculas();
        servPeli.crearPelicula();
        servPeli.mostrarPeliculas();
        servPeli.mostrarPeliculasMayor();
        servPeli.mostrarMayorMenor();
        servPeli.mostrarMenorMayor();
        servPeli.Titulo();
        servPeli.Director();
    }

}

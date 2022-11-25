/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.pelicula;
import java.util.Comparator;

/**
 *
 * @author ezepl
 */
public class comparadores {
    public static Comparator<pelicula> duracionMayor= new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t, pelicula t1) {
         return t1.getDuracion().compareTo(t.getDuracion());
        }
        
    };
public static Comparator<pelicula> duracionMenor= new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t1, pelicula t) {
         return t1.getDuracion().compareTo(t.getDuracion());
        }
        
    };
public static Comparator<pelicula> titulo= new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t1, pelicula t) {
         return t1.getTitulo().compareTo(t.getTitulo());
        }
        
    };
public static Comparator<pelicula> director= new Comparator<pelicula>(){
        @Override
        public int compare(pelicula t1, pelicula t) {
         return t1.getAutor().compareTo(t.getAutor());
        }
        
    };
}

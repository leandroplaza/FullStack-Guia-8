/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej5;

import servicios.serviciosPaises;

/**
 *
 * @author ezepl
 */
public class Guia8Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      serviciosPaises servPaises= new serviciosPaises();
      servPaises.agregarPais();
      servPaises.mostrarPaises();
      servPaises.eliminarPais();
      servPaises.mostrarPaises();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import utilidades.comparadores;

/**
 *
 * @author ezepl
 */
public class serviciosPaises {

    comparadores comp = new comparadores();
    Scanner leer = new Scanner(System.in);
    Set<paises> pais = new HashSet();

    public void agregarPais() {

        String resp = "";
        System.out.println("Ingrese el nombre de algun pais que desee agregar a la lista");
        do {
            paises nombresPais = new paises();

            nombresPais.setNombre(leer.next());
            pais.add(nombresPais);
            System.out.println("Si desea agregar otro pais a la lista presione S/s, si prefiere salir presione N/n");
            resp = (leer.next());
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre del pais");
                     pais.add(nombresPais);
            } else if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                System.out.println("El caracter ingresado no es valido, por favor ingrese una respuesta nuevamente ");
                     resp = (leer.next());
            }

        } while (!resp.equalsIgnoreCase("n"));
        System.out.println("Los paises que ha agregado a la lista son los siguientes: ");
        for (paises aux : pais) {
            System.out.println(aux.toString());
        }
    }

    public void mostrarPaises() {
        System.out.println("Los paises ordenados alfabeticamente se muestran asi:  ");
        List<paises> naciones = new ArrayList(pais);

        Collections.sort(naciones, comp.ordenAlfa);
        for (paises aux : naciones) {
            System.out.println(aux.toString());
        }
    }
    public void eliminarPais(){
        System.out.println("Ingrese un pais de la lista que desee eliminar ");
        String paiseliminar=leer.next();
        Iterator<paises> eliminar = pais.iterator();
        while (eliminar.hasNext()){
            String prox=eliminar.next().getNombre();
            if (paiseliminar.equalsIgnoreCase(prox)) {
                eliminar.remove();
            }
        }  
        
        
        
        
    }
    
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class Guia8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razaPerro = new ArrayList();
        System.out.println("Ingrese una raza de perro");
        String resp;
        resp = "";
        do {
            razaPerro.add(leer.nextLine());
            System.out.println("Si desea ingresar otra raza a la lista presione S, de lo contrario presione N");
            resp = leer.nextLine();
            if (!resp.equalsIgnoreCase("n") && !resp.equalsIgnoreCase("s")) {
                System.out.println("El caracter ingresado no es valido, ingreselo nuevamente");
                resp = leer.nextLine();
            }
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Ingrese otra raza ");
            }

        } while (!resp.equalsIgnoreCase("n"));
        System.out.println("La/s raza/s ingresada/s son:");
        for (String aux : razaPerro) {
            System.out.println(aux);
        }
        System.out.println("Ingrese la raza de perro que desee buscar en la lista");
        String raza = leer.nextLine();
        Iterator<String> iterator = razaPerro.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(raza)) {
                iterator.remove();
                 for (String aux: razaPerro){
                     System.out.println(aux);
            }
            }else{
             for (String aux: razaPerro){
                     System.out.println(aux);
            }   
    
                }           
    }
}

}


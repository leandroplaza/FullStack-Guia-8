/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class serviciosTienda {

    Map<String, Double> almacen = new HashMap<>();
    Scanner leer = new Scanner(System.in);
    tienda mercado = new tienda();

    public void crearProductos() {
        tienda mercado = new tienda();
        System.out.println("--------------------------------------------------------------");
        System.out.println("HA INGRESADO AL MENÚ PARA CREAR SU ALMACEN");
        System.out.println("Ingrese el nombre del articulo que desee agregar al almacen");
        mercado.setProducto(leer.next());
        System.out.println("Ingrese el valor del producto agregado");
        mercado.setPrecio(leer.nextDouble());

        System.out.println("--------------------------------------------------------------");

        almacen.put(mercado.getProducto(), mercado.getPrecio());
    }

    public void agregarProductos() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("HA INGRESADO AL MENU PARA AGREGAR ARTICULOS A SU ALMACEN");

        String resp;
        do {
            System.out.println("Si desea agregar más productos, presione S, de lo contrario presione N");
            resp = (leer.next());
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre del producto");
                mercado.setProducto(leer.next());
                System.out.println("Ingrese el valor del producto agregado");
                mercado.setPrecio(leer.nextDouble());
                almacen.putIfAbsent(mercado.getProducto(), mercado.getPrecio());

            } else if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                System.out.println("El caracter ingresado no es valido, por favor ingrese una respuesta nuevamente ");
                resp = (leer.next());
            }
            System.out.println("--------------------------------------------------------------");
        } while (resp.equalsIgnoreCase("s"));

    }

    public void mostrarAlmacen() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("HA INGRESADO AL MENU PARA MOSTRAR LOS PRODUCTOS DE SU ALMACEN CON SUS RESPECTIVOS PRECIOS");

        for (Map.Entry<String, Double> entry : almacen.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Articulo: " + entry.getKey().toUpperCase() + " Precio $" + entry.getValue());
            System.out.println("--------------------------------------------------------------");

        }

    }

    public void modificarPrecio() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("HA INGRESADO AL MENU DE MODIFICACION DE PRECIOS");
        System.out.println("Ingrese el nombre del producto al que desea modificar el precio");
        String articulo = leer.next();
        if (almacen.containsKey(articulo)) {
            System.out.println("Ingrese el nuevo valor del producto");
            double precioNuevo = leer.nextInt();
            almacen.replace(articulo, precioNuevo);
            System.out.println("El nuevo precio del producto modificado es: $ " + precioNuevo);
        } else {
            System.out.println("El producto ingresado no se encuentra entre los articulos del almacen");
        }
        System.out.println("--------------------------------------------------------------");
    }

    public void eliminarProducto() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("HA INGRESADO AL MENU PARA ELIMINAR ARTICULOS DE SU ALMACEN");
        System.out.println("Ingrese el nombre del articulo que desea eliminar");
        String articulo = leer.next();
        if (almacen.containsKey(articulo)) {
            System.out.println("Se ha eliminado el producto" + articulo + " de su almacen");
            almacen.remove(articulo);
        } else {
            System.out.println("El producto ingresado no se encuentra entre los articulos del almacen");
        }
        System.out.println("--------------------------------------------------------------");
    }

    public void menu() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Bienvenido al sistema de gestion de Almacenes");
        System.out.print("A continuacion se muestran las opciones :\n"
                + "Opcion 1: Ingresar productos a su almacen\n"
                + "Opcion 2: Agregar productos a su almacen\n"
                + "Opcion 3: Modificar precios\n"
                + "Opcion 4: Eliminar productos\n"
                + "Opcion 5: Mostrar todos los productos y precios\n"
                + "Opcion 6: Salir\n");
        int opcion;
        do {
            System.out.println("Ingrese la opcion deseada");
                opcion = leer.nextInt();
            if (opcion < 1 && opcion > 6) {
           
                System.out.println("La opcion ingresada no es valida, ingrese nuevamente");
                    opcion = leer.nextInt();
            } else {
                switch (opcion) {
                    case 1:
                        crearProductos();
                        break;
                    case 2:
                        agregarProductos();
                        break;
                    case 3:
                        modificarPrecio();
                        break;
                    case 4:
                        eliminarProducto();
                        break;
                    case 5:
                        mostrarAlmacen();
                        break;
                    case 6:

                }
            }
        } while (opcion != 6);
        System.out.println("Gracias por utilizar nuestra sistema de gestion. Hasta pronto");
        System.out.println("--------------------------------------------------------------");
    }

}

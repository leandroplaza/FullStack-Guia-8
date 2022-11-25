/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.paises;
import java.util.Comparator;

/**
 *
 * @author ezepl
 */
public class comparadores {
    public static Comparator<paises> ordenAlfa =new Comparator<paises>(){
        @Override
        public int compare(paises t, paises t1) {
        return t.getNombre().compareTo(t1.getNombre());
        }
        
    };
}

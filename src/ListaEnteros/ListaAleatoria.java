//EJERCICIO 8.1
/* Crear una lista de números aleatorios. Insertar los nuevos nodos por la cabeza de la lista. Una vez
creada la lista, se han de recorrer los nodos para mostrar los número pares.
 */
// clase con método main

// @autor GAGO RAMOS EDUARDO JESÚS

import java.util.*;
import ListaEnteros.*;

public class ListaAleatoria {

    public static void main(String[] a) {
        Random r;
        int d;
        Lista lista;
        int k;
        r = new Random();
        lista = new Lista(); // crea lista vacía
        k = Math.abs(r.nextInt() % 55); // número de nodos
        // se insertan elementos en la lista
        for (; k > 0; k--) {
            d = r.nextInt() % 99;
            lista.insertarCabezaLista(d);
        }
        // recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();
    }
}

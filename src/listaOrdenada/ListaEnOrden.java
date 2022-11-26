//EJERCICIO 8.2
/* Crear una lista enlazada ordenada de números enteros. Una vez creada la lista, se recorre para
escribir los datos por pantalla.
 */
package listaOrdenada;
// @autor GAGO RAMOS EDUARDO JESÚS

import java.util.*;

public class ListaEnOrden {

    public static void main(String[] a) {
        Random r;
        int d;
        ListaOrdenada lista;
        int k;
        r = new Random(); // generador de números aleatorios
        lista = new ListaOrdenada(); // crea lista vacía
        k = r.nextInt(99) + 1; // número de elementos
        // inserta elementos en la lista
        for (; k >= 0; k--) {
            d = r.nextInt();
            lista.insertaOrden(d);
        }

        // escribe los elementos de la lista
        System.out.println("Elementos de la lista ordenada \n");
        lista.visualizar();
    }
}

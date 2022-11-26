/* clase Lista con las operaciones: insertar por la cabeza y
 visualizar (recorre los nodos) para mostrar los datos. Además,
 el atributo primero, que apunta al primer nodo.
 */
// @autor GAGO RAMOS EDUARDO JESÚS

package ListaEnteros;

public class Lista {

    protected Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }
}

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.enlace = cabeza;
        cabeza = nuevo;
    }

    public void insertarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.enlace != null) {
            actual = actual.enlace;
        }
        actual.enlace = nuevo;
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.enlace;
        }
        return false;
    }

    public boolean eliminar(int valor) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.valor == valor) {
            cabeza = cabeza.enlace;
            return true;
        }
        Nodo anterior = cabeza;
        Nodo actual = cabeza.enlace;
        while (actual != null) {
            if (actual.valor == valor) {
                anterior.enlace = actual.enlace;
                return true;
            }
            anterior = actual;
            actual = actual.enlace;
        }
        return false;
    }

    public int contar() {
        int total = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            total++;
            actual = actual.enlace;
        }
        return total;
    }

    public int obtener(int indice) {
        if (indice < 0) {
            throw new IndexOutOfBoundsException("El índice no puede ser negativo");
        }
        Nodo actual = cabeza;
        int pos = 0;
        while (actual != null) {
            if (pos == indice) {
                return actual.valor;
            }
            actual = actual.enlace;
            pos++;
        }
        throw new IndexOutOfBoundsException("Índice fuera del rango de la lista");
    }

    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.enlace;
        }
        System.out.println("null");
    }
}
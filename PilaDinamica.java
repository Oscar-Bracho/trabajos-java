public class PilaDinamica {
    private static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cima;

    public PilaDinamica() {
        this.cima = null;
    }

    public boolean vacia() {
        return cima == null;
    }

    public void apilar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public int desapilar() {
        if (vacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valor = cima.dato;
        cima = cima.siguiente;
        return valor;
    }

    public int cima() {
        if (vacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.dato;
    }

    public int contar() {
        int total = 0;
        Nodo actual = cima;
        while (actual != null) {
            total++;
            actual = actual.siguiente;
        }
        return total;
    }

    public void mostrar() {
        if (vacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
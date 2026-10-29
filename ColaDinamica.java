public class ColaDinamica {
    private static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fin;

    public ColaDinamica() {
        this.frente = null;
        this.fin = null;
    }

    public boolean vacia() {
        return frente == null;
    }

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (vacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
    }

    public int quitar() {
        if (vacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }

    public int frenteCola() {
        if (vacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    public int contar() {
        int total = 0;
        Nodo actual = frente;
        while (actual != null) {
            total++;
            actual = actual.siguiente;
        }
        return total;
    }

    public void mostrar() {
        if (vacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo actual = frente;
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
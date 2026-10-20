public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("--- LISTA ENLAZADA DINÁMICA ---");
        System.out.println("¿Está vacía? " + lista.estaVacia());

        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        
        System.out.print("Insertar al final (10, 20, 30): ");
        lista.imprimir();

        lista.insertarAlInicio(5);
        System.out.print("Insertar al inicio (5): ");
        lista.imprimir();

        System.out.println("¿Existe el 20? " + lista.buscar(20));
        System.out.println("¿Existe el 99? " + lista.buscar(99));
        System.out.println("Cantidad de elementos: " + lista.contar());
        System.out.println("Elemento en el índice 2: " + lista.obtener(2));

        lista.eliminar(10);
        System.out.print("Eliminar el 10: ");
        lista.imprimir();

        lista.eliminar(5);
        System.out.print("Eliminar el primero (5): ");
        lista.imprimir();

        lista.eliminar(30);
        System.out.print("Eliminar el último (30): ");
        lista.imprimir();

        lista.eliminar(20);
        System.out.print("Eliminar el último elemento restante: ");
        lista.imprimir();

        System.out.println("¿Está vacía ahora? " + lista.estaVacia());
    }
}
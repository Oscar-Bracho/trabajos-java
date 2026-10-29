public class PruebaCola {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();

        System.out.println("¿Está vacía?: " + cola.vacia());

        cola.agregar(10);
        cola.agregar(20);
        cola.agregar(30);

        System.out.print("Cola: ");
        cola.mostrar();

        System.out.println("Primer elemento: " + cola.frenteCola());
        System.out.println("Elemento eliminado: " + cola.quitar());

        System.out.print("Cola actualizada: ");
        cola.mostrar();

        System.out.println("Tamaño: " + cola.contar());
        System.out.println("¿Está vacía?: " + cola.vacia());
    }
}
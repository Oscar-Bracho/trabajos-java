public class PruebaPila {
    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();

        System.out.println("¿Est vacia?: " + pila.vacia());

        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        System.out.print("Pila: ");
        pila.mostrar();

        System.out.println("Elemento superior: " + pila.cima());
        System.out.println("Elemento eliminado: " + pila.desapilar());

        System.out.print("Pila actualizada: ");
        pila.mostrar();

        System.out.println("Tamano: " + pila.contar());
        System.out.println("¿Esta vacaa?: " + pila.vacia());
    }
}
public class SerieFibonacci {

    public static int calcularFibonacci(int limite) {
        if (limite <= 0) {
            return 0;
        } else if (limite == 1) {
            return 1;
        }
        return calcularFibonacci(limite - 1) + calcularFibonacci(limite - 2);
    }

    public static void main(String[] args) {
        int posicion = 12;
        System.out.println("El término en la posición " + posicion + " es: " + calcularFibonacci(posicion));
    }
}

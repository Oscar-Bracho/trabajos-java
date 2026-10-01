public class CalculoPotencia {

    public static int calcularPotencia(int b, int exp) {
        if (exp == 0) {
            return 1;
        }
        return b * calcularPotencia(b, exp - 1);
    }

    public static void main(String[] args) {
        int base = 7;
        int exponente = 2;
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + calcularPotencia(base, exponente));
    }
}

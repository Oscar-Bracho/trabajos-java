public class SumaNumeros {

    public static int sumar(int num) {
        if (num <= 1) {
            return 1;
        }
        return num + sumar(num - 1);
    }

    public static void main(String[] args) {
        int valor = 3;
        System.out.println("Resultado de la suma: " + sumar(valor));
    }
}

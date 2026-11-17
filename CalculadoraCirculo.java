import java.util.Scanner;

public class CalculadoraCirculo {
    double medidaRadio;

    public CalculadoraCirculo(double medidaRadio) {
        this.medidaRadio = medidaRadio;
    }

    public double calcularAreaCirculo() {
        return Math.PI * medidaRadio * medidaRadio;
    }

    public void imprimirArea() {
        System.out.println("El area del circulo es: " + calcularAreaCirculo());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();

        if (radio >= 0) {
            CalculadoraCirculo circulo = new CalculadoraCirculo(radio);
            circulo.imprimirArea();
        } else {
            System.out.println("El radio no puede ser negativo");
        }
        scanner.close();
    }
}
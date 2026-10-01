public class InvertirCadena {

    public static void imprimirInverso(String palabra) {
        if (palabra == null || palabra.length() == 0) {
            return;
        }
        imprimirInverso(palabra.substring(1));
        System.out.print(palabra.charAt(0));
    }

    public static void main(String[] args) {
        String mensaje = "Hola mundo";
        System.out.print("Cadena invertida: ");
        imprimirInverso(mensaje);
        System.out.println();
    }
}
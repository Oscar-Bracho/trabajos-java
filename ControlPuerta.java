public class ControlPuerta {
    boolean estaAbierta = false;

    public void abrirPuerta() {
        estaAbierta = true;
    }

    public void cerrarPuerta() {
        estaAbierta = false;
    }

    public String revisarEstado() {
        if (estaAbierta) {
            return "Abierta";
        } else {
            return "Cerrada";
        }
    }

    public static void main(String[] args) {
        ControlPuerta puerta = new ControlPuerta();
        System.out.println(puerta.revisarEstado());

        puerta.abrirPuerta();
        System.out.println(puerta.revisarEstado());

        puerta.cerrarPuerta();
        System.out.println(puerta.revisarEstado());
    }
}
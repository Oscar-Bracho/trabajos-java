public class ControlSemaforo {
    String luzActual = "rojo";

    public void fijarRojo() {
        luzActual = "rojo";
    }

    public void fijarAmarillo() {
        luzActual = "amarillo";
    }

    public void fijarVerde() {
        luzActual = "verde";
    }

    public String obtenerLuz() {
        return luzActual;
    }

    public static void main(String[] args) {
        ControlSemaforo semaforo = new ControlSemaforo();
        System.out.println(semaforo.obtenerLuz());

        semaforo.fijarVerde();
        System.out.println(semaforo.obtenerLuz());

        semaforo.fijarAmarillo();
        System.out.println(semaforo.obtenerLuz());

        semaforo.fijarRojo();
        System.out.println(semaforo.obtenerLuz());
    }
}
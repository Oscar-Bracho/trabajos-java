public class ReproductorMedia {
    String pista = "";
    boolean reproduciendo = false;

    public void iniciarReproduccion(String nombrePista) {
        this.pista = nombrePista;
        reproduciendo = true;
    }

    public void pausarReproduccion() {
        reproduciendo = false;
    }

    public String obtenerEstadoReproductor() {
        if (reproduciendo) {
            return "Reproduciendo " + pista;
        } else {
            return "Pausado";
        }
    }

    public static void main(String[] args) {
        ReproductorMedia rep = new ReproductorMedia();

        rep.iniciarReproduccion("Imagine");
        System.out.println(rep.obtenerEstadoReproductor());

        rep.pausarReproduccion();
        System.out.println(rep.obtenerEstadoReproductor());
    }
}
public class ControlTermometro {
    double gradosActuales = 33.0;

    public void incrementar(double valor) {
        gradosActuales += valor;
    }

    public void disminuir(double valor) {
        gradosActuales -= valor;
    }

    public double consultarTemperatura() {
        return gradosActuales;
    }

    public static void main(String[] args) {
        ControlTermometro t = new ControlTermometro();

        t.incrementar(5.0);
        t.disminuir(2.0);

        System.out.println(t.consultarTemperatura());
    }
}
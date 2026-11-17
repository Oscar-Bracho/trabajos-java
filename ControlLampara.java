public class ControlLampara {
    boolean estadoLuz = false;

    public void encenderFoco() {
        estadoLuz = true;
    }

    public void apagarFoco() {
        estadoLuz = false;
    }

    public String verificarEstado() {
        if (estadoLuz) {
            return "Encendida";
        } else {
            return "Apagada";
        }
    }

    public static void main(String[] args) {
        ControlLampara lampara = new ControlLampara();
        System.out.println(lampara.verificarEstado());

        lampara.encenderFoco();
        System.out.println(lampara.verificarEstado());

        lampara.apagarFoco();
        System.out.println(lampara.verificarEstado());
    }
}
public class Usuario extends Persona {
    public String correo;
    public String contrasena;

    public Usuario(String nombre, int edad, String sexo, String correo, String contrasena) {
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void informacionUsuario() {
        System.out.println("--- DATOS DEL USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
    }
}
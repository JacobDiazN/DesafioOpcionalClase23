public class Cliente extends Persona{

    private Persona persona;

    // Constructor sin parámetros
    public Cliente(int edad) {
        super("", edad, ""); // Iniciar atributos con valores por defecto
    }

    public Cliente(String rut, int edad, String nombre) {
        super(rut, edad, nombre);
    }
}

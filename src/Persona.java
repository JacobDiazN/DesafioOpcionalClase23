public class Persona {

    private String rut;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String rut, int edad, String nombre) {
        this.rut = rut;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

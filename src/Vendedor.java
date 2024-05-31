public class Vendedor extends Persona{

    private String direccion;

    public Vendedor() {
    }

    public Vendedor(String rut, int edad, String nombre, String direccion) {
        super(rut, edad, nombre);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

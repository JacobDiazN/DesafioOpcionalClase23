import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /*MiniBus primerMiniBus = new MiniBus("Rojo", "ABC123", 30, "Urbano");
        Tienda tienda = new Tienda();
        tienda.setStock(25);
        System.out.println(tienda.existeStock());
        primerMiniBus.imprimeBus();
        System.out.println("============ Impresion de Atributos ============");
        System.out.println(primerMiniBus.imprimeBus());*/
        try {
            Cliente cliente = new Cliente(19);
            Vehiculo vehiculo = new Vehiculo("XXTY09");
            LibroVenta libroVenta = new LibroVenta("Venta de Mayo", "10062024");

            Cliente cliente2 = new Cliente(35);
            Vehiculo vehiculo2 = new Vehiculo("PBZZ08");
            LibroVenta libroVenta2 = new LibroVenta("Venta de Mayo", "22062024");

            Cliente cliente3 = new Cliente(42);
            Vehiculo vehiculo3 = new Vehiculo("TCEJ88");
            LibroVenta libroVenta3 = new LibroVenta("Venta de Junio", "01062024");

            Cliente cliente4 = new Cliente(35);
            Vehiculo vehiculo4 = new Vehiculo("HHAV47");
            LibroVenta libroVenta4 = new LibroVenta("Venta de Junio", "06062024");

            // Guardar las ventas
            libroVenta.guardarVenta(cliente, vehiculo);
            libroVenta2.guardarVenta(cliente2, vehiculo2);
            libroVenta3.guardarVenta(cliente3, vehiculo3);
            libroVenta4.guardarVenta(cliente4, vehiculo4);

        } catch (NullPointerException e) {
            System.out.println("Error: Uno de los objetos no está inicializado correctamente: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Se produjo un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
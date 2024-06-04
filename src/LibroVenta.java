import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LibroVenta {

    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        String nuevaEntrada = String.format("Patente del vehículo: %s\nEdad del cliente: %d años\nFecha de la venta: %s\nNombre de la venta: %s\n----------------------------------\n",
                vehiculo.getPatente(), cliente.getEdad(), fechaVenta, nombreVenta);

        File dir = new File("src/ficheros");
        if (dir.mkdir()) {
            System.out.println("__________________________________________________________________");
            System.out.printf("Se ha creado el directorio '%s' con éxito.\n", dir.getName());
        } else if (dir.exists()) {
            System.out.println("__________________________________________________________________");
            System.out.printf("El directorio '%s' ya existe\n", dir.getName());
        } else {
            System.out.println("Error al crear directorio");
        }

        File arch = new File(dir, nombreVenta + ".txt");

        // Leer el contenido del archivo
        try {
            if (arch.exists()) {
                List<String> lines = Files.readAllLines(Paths.get(arch.getPath()));
                StringBuilder contenidoArchivo = new StringBuilder();
                for (String line : lines) {
                    contenidoArchivo.append(line).append("\n");
                }

                // Validar si la entrada ya existe
                if (contenidoArchivo.toString().contains(nuevaEntrada)) {
                    System.out.println("La venta ya existe en el archivo.");
                    return;
                }
            }

            // Agregar la nueva entrada al archivo
            try (FileWriter fw = new FileWriter(arch, true); PrintWriter writer = new PrintWriter(fw)) {
                writer.print(nuevaEntrada);
            }

            System.out.println("Venta guardada exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}

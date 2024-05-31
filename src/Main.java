public class Main {
    public static void main(String[] args) {

        MiniBus primerMiniBus = new MiniBus("Rojo", "ABC123", 30, "Urbano");

        Tienda tienda = new Tienda();
        tienda.setStock(25);
        System.out.println(tienda.existeStock());


        primerMiniBus.imprimeBus();
        System.out.println("============ Impresion de Atributos ============");
        System.out.println(primerMiniBus.imprimeBus());

    }
}
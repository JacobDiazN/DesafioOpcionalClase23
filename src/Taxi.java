public class Taxi {

    private int valorPasaje;

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int pasaje){
        int vuelto = 0;
        if (pasaje >= getValorPasaje()){
            vuelto = pasaje - getValorPasaje();
            System.out.printf("Hay $%d de vuelto", vuelto);
        }else {
            System.out.println("El pasaje pagado es menor al valor del pasaje");
            System.out.printf("Se devuelve $%d, lo que pagó el usurio originalmente", pasaje);
        }
        return vuelto;
    }
}

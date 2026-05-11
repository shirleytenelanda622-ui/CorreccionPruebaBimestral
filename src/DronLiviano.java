public class DronLiviano extends Dron{
    private double limiteHoras = 2;
    public DronLiviano(){
        super("LIV001", "LivianoX", 12.5, 2.3, 1.5, 5.0);
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = limiteHoras;
    }

    @Override
    public double calcularCostoEntrega(){
        return getCostoBase() + (getDistanciakm() * 0.50);
    }
    @Override
    public boolean validarDatos(){
        if(getPesoPaquete() <= 5 && getHorasVuelo() <= 2){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("--- Dron Liviano ---");
        super.mostrarInformacion();
        System.out.println("Limite de horas: " + limiteHoras);
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }

}
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }

}

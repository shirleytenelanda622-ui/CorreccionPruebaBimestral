public class DronLiviano extends Dron{
    private double limiteHoras = 2;
    public DronLiviano(){
        super();
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = limiteHoras;
    }

    @Override
    public double calcularCostoEntrega(){
        return costoBase + (getDistanciakm() * 0.50);
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
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }

}

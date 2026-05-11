public class DronCarga extends Dron{
    private double costoPorKg;
    public DronCarga(){
        super();
    }

    public double getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg) {
        this.costoPorKg = costoPorKg;
    }

    @Override
    public double calcularCostoEntrega(){
        return costoBase + (getDistanciakm() * 0.70) + (getPesoPaquete() * costoPorKg);
    }

    @Override
    public boolean validarDatos(){
        if(getPesoPaquete() <= 30 && getHorasVuelo() <= 5){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Costo por entrega: " + calcularCostoEntrega());
    }
}

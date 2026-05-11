public class DronCarga extends Dron{
    private double costoPorKg;
    public DronCarga(){
        super("CAR001", "CargaMax", 45.0, 20.0, 3.0, 12.0);
    }

    public double getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg) {
        this.costoPorKg = costoPorKg;
    }

    @Override
    public double calcularCostoEntrega(){
        return getCostoBase() + (getDistanciakm() * 0.70) + (getPesoPaquete() * costoPorKg);
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
        System.out.println("--- Dron Carga ---");
        super.mostrarInformacion();
        System.out.println("Costo por kg: " + costoPorKg);
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }
}

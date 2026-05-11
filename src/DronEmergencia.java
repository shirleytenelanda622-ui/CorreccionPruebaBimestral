public class DronEmergencia extends Dron{
    private double recargoUrgencia;
    private int nivelPrioridad;
    public DronEmergencia(){
        super("EMG001", "Emergente", 8.0, 3.0, 1.0, 15.0);
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        this.recargoUrgencia = recargoUrgencia;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public double calcularCostoEntrega(){
        return getCostoBase() +(getDistanciakm() * 1.00) + recargoUrgencia;
    }

    @Override
    public boolean validarDatos(){
        if(getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && nivelPrioridad >= 1 && nivelPrioridad <= 3){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("--- Dron Emergencia ---");
        super.mostrarInformacion();
        System.out.println("Nivel de prioridad: " + nivelPrioridad);
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }
}
        return costoBase +(getDistanciakm() * 1.00) + recargoUrgencia;
    }

    @Override
    public boolean validarDatos(){
        if(getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && nivelPrioridad >= 1 && nivelPrioridad <= 3){
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

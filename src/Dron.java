public abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciakm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    public Dron(){}

    public Dron(String codigo, String modelo, double distanciakm, double pesoPaquete, double horasVuelo, double costoBase) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.distanciakm = distanciakm;
        this.pesoPaquete = pesoPaquete;
        this.horasVuelo = horasVuelo;
        this.costoBase = costoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDistanciakm() {
        return distanciakm;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCodigo(String codigo) {
        if(codigo != null && !codigo.isEmpty()){
            this.codigo = codigo;
        }
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }
    }

    public void setDistanciakm(double distanciakm) {
        if(distanciakm > 0){
            this.distanciakm = distanciakm;
        }
    }

    public void setPesoPaquete(double pesoPaquete) {
        if(pesoPaquete > 0){
            this.pesoPaquete = pesoPaquete;
        }
    }

    public void setHorasVuelo(double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
    abstract double calcularCostoEntrega();
    abstract boolean validarDatos();
    public void mostrarInformacion(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia en km: " + distanciakm);
        System.out.println("Peso: " + pesoPaquete);
        System.out.println("Horas de vuelo: " + horasVuelo);
        System.out.println("Costo base: " + costoBase);
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dron d1 = new DronLiviano();
        d1.setCodigo("LIV001");
        d1.setModelo("LivianoX");
        d1.setCostoBase(5.00);
        Dron d2 = new DronCarga();
        d2.setCodigo("D2");
        d2.setModelo("HeavyLift");
        d2.setCostoBase(12.00);
        Dron d3 = new DronEmergencia();
        d3.setCodigo("D3");
        d3.setModelo("RescuePro");
        d3.setCostoBase(15.00);

        System.out.println(" ===== INFORMACION INICIAL DE DRONES =====");
        System.out.println("\n --- Dron Liviano ---");
        d1.mostrarInformacion();
        System.out.println("\n --- Dron Carga ---");
        d2.mostrarInformacion();
        System.out.println("\n --- Dron Emergencia ---");
        d3.mostrarInformacion();
        System.out.println("===========================================");

        Scanner sc = new Scanner(System.in);
        System.out.println(" ==== INGRESO DE NUEVOS DATOS ====");
        System.out.println("¿Que dron desea actualizar? ");
        System.out.println("1. Dron Liviano \n2. Dron Carga \n3. Dron Emergencia \nOpcion: ");
        int opcion = sc.nextInt();

        System.out.print("\nIngrese distancia (km): ");
        double distancia = sc.nextDouble();
        System.out.print("Ingrese peso del paquete (kg): ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese horas de vuelo: ");
        int horas = sc.nextInt();

        Dron seleccionado = null;
        if(opcion == 1){
            seleccionado = d1;
        } else if(opcion == 2){
            seleccionado = d2;
        } else {
            seleccionado = d3;
        }
        if(seleccionado != null){
            seleccionado.setDistanciakm(distancia);
            seleccionado.setPesoPaquete(peso);
            seleccionado.setHorasVuelo(horas);
        }
        if(seleccionado.validarDatos()){
            System.out.println("Los datos cumplen con las validaciones. ");
            System.out.println("\n¿Desea guardar los cambios? (s/n): ");
            sc.nextLine();
            String guardar = sc.nextLine();

            if(guardar.equalsIgnoreCase("s")){
                System.out.println("Datos actualizados correctamente");
            } else {
                System.out.println("Error. Datos no actualizados");
            }
        } else {
            System.out.println("Error. Valores invalidos");
        }

        System.out.println("==== INFORMACION ACTUALIZADA ====");
        if(opcion == 1){
            System.out.println("\n--- Dron Liviano (actualizado) ---");
            d1.mostrarInformacion();
            System.out.println("=================================");
        } else if(opcion == 2){
            System.out.println("\n--- Dron Carga ---");
            d2.mostrarInformacion();
            System.out.println("=================================");
        } else if(opcion == 3){
            System.out.println("\n--- Dron Emergencia ---");
            d3.mostrarInformacion();
            System.out.println("==================================");
        } else {
            System.out.println("\nError. Opcion invalida");
        }
        System.out.println("\n===== DEMOSTRACION DE POLIMORFISMO =====");
        System.out.println("\nLista de drones (tipo Dron): ");
        System.out.println("-> " + d1.getCodigo() + " | Modelo: " + d1.getModelo() + " | Costo entrega: " + d1.calcularCostoEntrega());
        System.out.println("-> " + d2.getCodigo() + " | Modelo: " + d2.getModelo() + " | Costo entrega: " + d2.calcularCostoEntrega());
        System.out.println("-> " + d3.getCodigo() + " | Modelo: " + d3.getModelo() + " | Costo entrega: " + d3.calcularCostoEntrega());
        System.out.println("\nLlamado al metodo mostrarInformacion() desde eferencia Dron: ");
        System.out.println("--- Informacion general ---");
        System.out.println("Codigo: " + d1.getCodigo() + " | Modelo: "+ d1.getModelo());
        System.out.println("Distancia: " + d1.getDistanciakm() + " | Peso: " + d1.getPesoPaquete() + " | Horas: " + d1.getHorasVuelo());
        System.out.println("Costo de entrega: " + d1.calcularCostoEntrega());

        System.out.println("--- Informacion general ---");
        System.out.println("Codigo: " + d2.getCodigo() + " | Modelo: "+ d2.getModelo());
        System.out.println("Distancia: " + d2.getDistanciakm() + " | Peso: " + d2.getPesoPaquete() + " | Horas: " + d2.getHorasVuelo());
        System.out.println("Costo de entrega: " + d2.calcularCostoEntrega());

        System.out.println("--- Informacion general ---");
        System.out.println("Codigo: " + d3.getCodigo() + " | Modelo: "+ d3.getModelo());
        System.out.println("Distancia: " + d3.getDistanciakm() + " | Peso: " + d3.getPesoPaquete() + " | Horas: " + d3.getHorasVuelo());
        System.out.println("Costo de entrega: " + d3.calcularCostoEntrega());
    }
}
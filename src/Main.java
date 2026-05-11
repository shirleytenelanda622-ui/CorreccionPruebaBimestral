import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DronLiviano d1 = new DronLiviano();
        DronCarga d2 = new DronCarga();
        DronEmergencia d3 = new DronEmergencia();

        System.out.println("===== INFORMACIÓN INICIAL DE DRONES =====\n");

        d1.mostrarInformacion();
        System.out.println();

        d1.mostrarInformacion();
        System.out.println();

        d3.mostrarInformacion();
        System.out.println();

        System.out.println("===== INGRESO DE NUEVOS DATOS =====");
        System.out.println("¿Qué dron desea actualizar?");
        System.out.println("1. Dron Liviano");
        System.out.println("2. Dron Carga");
        System.out.println("3. Dron Emergencia");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        Dron dronSeleccionado = null;

        switch (opcion) {
            case 1:
                dronSeleccionado = d1;
                break;
            case 2:
                dronSeleccionado = d2;
                break;
            case 3:
                dronSeleccionado = d3;
                break;
            default:
                System.out.println("Opción inválida.");
                System.exit(0);
        }

        // Ingreso de datos
        System.out.print("Ingrese distancia (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Ingrese peso del paquete (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese horas de vuelo: ");
        double horas = sc.nextDouble();

        // Uso de setters
        dronSeleccionado.setDistanciakm(distancia);
        dronSeleccionado.setPesoPaquete(peso);
        dronSeleccionado.setHorasVuelo(horas);

        // Validar datos
        if (dronSeleccionado.validarDatos()) {

            System.out.println("\nLos datos cumplen con las validaciones.");
            System.out.print("¿Desea guardar los cambios? (s/n): ");
            char respuesta = sc.next().charAt(0);

            if (respuesta == 's' || respuesta == 'S') {
                System.out.println("\nDatos actualizados correctamente.\n");

                System.out.println("===== INFORMACIÓN ACTUALIZADA =====\n");
                dronSeleccionado.mostrarInformacion();
            } else {
                System.out.println("No se guardaron los cambios.");
            }

        } else {
            System.out.println("\nERROR: Los datos ingresados no son válidos.");
            System.out.println("No se guardaron los cambios.");
        }

        System.out.println("\n===== DEMOSTRACION DE POLIMORFISMO =====");
        System.out.println("\nLista de drones (tipo Dron): ");
        System.out.println("-> " + d1.getCodigo() + " | Modelo: " + d1.getModelo() + " | Costo entrega: " + d1.calcularCostoEntrega());
        System.out.println("-> " + d2.getCodigo() + " | Modelo: " + d2.getModelo() + " | Costo entrega: " + d2.calcularCostoEntrega());
        System.out.println("-> " + d3.getCodigo() + " | Modelo: " + d3.getModelo() + " | Costo entrega: " + d3.calcularCostoEntrega());
        System.out.println("\nLlamado al metodo mostrarInformacion() desde referencia Dron: ");
        System.out.println("--- Informacion general ---");
        System.out.println("Codigo: " + d1.getCodigo() + " | Modelo: "+ d1.getModelo());
        System.out.println("Distancia: " + d1.getDistanciakm() + " | Peso: " + d1.getPesoPaquete() + " | Horas: " + d1.getHorasVuelo());
        System.out.println("Costo de entrega: " + d1.calcularCostoEntrega());

        System.out.println("===== FIN DEL PROGRAMA =====");
        System.out.println("Gracias por usar el sistema de drones.");

        sc.close();
    }
}
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

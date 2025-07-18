/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dashboard;

/**
 *
 * @author LENOVO
 */

import modelo.Vehiculo;
import servicio.Parqueadero;
import vista.Consola;

import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consola vista = new Consola();
        Parqueadero parqueadero = new Parqueadero();

        // Mensaje de bienvenida al iniciar el programa
        System.out.println("Bienvenido al Sistema de Parqueadero");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos registrados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    // Pedir datos del vehículo al usuario
                    System.out.print("Ingrese placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Ingrese marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Ingrese color: ");
                    String color = scanner.nextLine();

                    Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, color);
                    parqueadero.registrarVehiculo(nuevoVehiculo);

                    // Mensaje de estado tras registro exitoso
                    System.out.println("✅ Vehículo registrado exitosamente.");
                    break;

                case 2:
                    vista.mostrar(parqueadero);
                    break;

                case 3:
                    // Mensaje antes de salir del programa
                    System.out.println("Gracias por usar el sistema. 👋");
                    continuar = false;
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

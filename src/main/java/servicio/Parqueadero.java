/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author LENOVO
 */


import modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestiona el registro y consulta de vehículos en el parqueadero.
 */
public class Parqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    /**
     * Registrar un vehículo nuevo en el parqueadero.
     * @param vehiculo Vehículo a registrar.
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Mostrar en consola todos los vehículos registrados.
     */
    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            System.out.println("Vehículos en el parqueadero:");
            for (Vehiculo v : vehiculos) {
                System.out.println("- " + v);
            }
        }
    }
}

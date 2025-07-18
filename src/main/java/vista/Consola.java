/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author LENOVO
/**
 * Clase que se encarga de mostrar información al usuario en la consola.
 * Tiene métodos para imprimir los datos del parqueadero.
 * Es la parte que muestra lo que el usuario ve en el programa.
 */


import servicio.Parqueadero;

public class Consola {

    public void mostrar(Parqueadero parqueadero) {
        parqueadero.mostrarVehiculos();
    }
}

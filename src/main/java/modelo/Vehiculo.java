/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase que representa un vehículo con su placa, marca y color.
 * Guarda la información básica de cada vehículo.
 * 
 * @author LENOVO
 */

public class Vehiculo {
    private String placa;
    private String marca;
    private String color;
    
        /**
     * Crea un vehículo nuevo con placa, marca y color.
     * 
     * @param placa La placa del vehículo.
     * @param marca La marca del vehículo.
     * @param color El color del vehículo.
     */

    public Vehiculo(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }
    // Devuelve la placa , marca y color del vehículo
    
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehículo [Placa: " + placa + ", Marca: " + marca + ", Color: " + color + "]";
    }
}

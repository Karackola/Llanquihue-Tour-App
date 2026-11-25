/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa un servicio turistico con atributos comunes
 * de nombre y duracion.
 *
 * @author macbook
 */

public class ServicioTuristico {
    private String nombre;
    private double duracionHoras;

    public ServicioTuristico() {
    }

    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "ServicioTuristico: " 
            + "\nNombre: " + nombre 
            + "\nDuracion Horas: " + duracionHoras;
    }
}

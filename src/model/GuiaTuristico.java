/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author macbook
 */
public class GuiaTuristico {
    private String nombre;
    private String especialidad;
    
public GuiaTuristico(String nombre, String especialidad) {
    setNombre(nombre);
    setEspecialidad(especialidad);
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    if (nombre != null && !nombre.isBlank()) {
        this.nombre = nombre;
    } else {
        throw new IllegalArgumentException("El nombre es obligatorio");
    }
}

public String getEspecialidad() {
    return especialidad;
}
public void setEspecialidad(String especialidad) {
    if (especialidad != null && !especialidad.isBlank()) {
        this.especialidad = especialidad;
    } else {
        throw new IllegalArgumentException("La especialidad es obligatoria");
    }
}

@Override
public String toString() {
    return nombre + " - " + especialidad;
    }
}
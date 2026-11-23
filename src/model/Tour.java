/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa un Tour turistico con sus caracteristicas principales.
 *
 * @author macbook
 */

public class Tour {
    private String ubicacion;
    private int valor;
    private double duracion;
    private String tipoActividad;
    private GuiaTuristico guia;

    public Tour() {
    }
    /**
     * Inicializa un tour con sus datos principales
     * 
     * @param ubicacion lugar donde se realiza
     * @param valor precio del tour
     * @param duracion duración en horas
     * @param tipoActividad categoría de la actividad
     */ 
    
    public Tour(String ubicacion, int valor, double duracion, String tipoActividad) {
        this.ubicacion = ubicacion;
        setValor(valor);
        setDuracion(duracion);
        this.tipoActividad = tipoActividad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        if (duracion > 0 && Double.isFinite(duracion)) {
            this.duracion = duracion;
        } else {
            throw new IllegalArgumentException("La duración debe ser mayor a cero");
        }
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
    
    public GuiaTuristico getGuia() {
        return guia;
    }

    public void setGuia(GuiaTuristico guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour" 
                + "\nUbicacion: " + ubicacion 
                + "\nValor: $ " + valor 
                + "\nDuracion: " + duracion + " horas"
                + "\nTipo de Actividad: " + tipoActividad
                + "\nGuia: " + (guia !=null ? guia : "Sin asignar");
    } 
}

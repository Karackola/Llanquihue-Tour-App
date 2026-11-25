/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa una excursion cultural asociada
 * a un lugar hostorico. 
 *
 * @author macbook
 */

public class ExcursionCultural extends ServicioTuristico{
    private String lugarHistorico;

    public ExcursionCultural() {
    }

    public ExcursionCultural(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de Servicio:  Excursion Cultural" 
                + "\nLugar Historico: " + lugarHistorico;
    }  
}

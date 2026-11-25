/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa un paseo lacustre segun el tipo
 * de embarcacion utilizada.
 *
 * @author macbook
 */

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;

    public PaseoLacustre() {
    }

    public PaseoLacustre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de servicio: Paseo Lacustre" 
                + "\nTipo Embarcacion: " + tipoEmbarcacion;
    }   
}

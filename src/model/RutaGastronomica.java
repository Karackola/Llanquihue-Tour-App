/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa una ruta gastronomica con un numero
 * determinado de paradas.
 *
 * @author macbook
 */
public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;

    public RutaGastronomica() {
    }

    public RutaGastronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
        
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() 
                + "\nTipo de servicio: Ruta Gastronomica" 
                + "\nNumero De Paradas: " + numeroDeParadas;
    }    
}

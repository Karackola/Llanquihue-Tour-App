/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ui;

import data.GestorDatos;
import model.Tour;
import java.util.List;

/**
 * Inicia el programa y muestra los tours disponibles.
 * 
 * @author macbook
 */

public class Main{

    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("   LLANQUIHUE TOUR - SISTEMA DE GESTIÓN DE TOURS          ");
        System.out.println("=================================================================\n");

        GestorDatos gestor = new GestorDatos();

        String rutaArchivo = "src/resources/Tours.txt";

    // 1. Cargar datos desde archivo
    List<Tour> tours = gestor.cargarDesdeArchivo(rutaArchivo);


    // 2. Recorrido completo de la colección
    System.out.println("\n--- LISTA COMPLETA DE TOURS ---");

    for (Tour t : tours) {
      System.out.println(t.toString());
        System.out.println("------------------------");
    }

    // 3. Filtrado por condición (Ejemplo: Tour del tipo Trekking)
        String filtroTipo = "Trekking";
        System.out.println("\n--- TOURS FILTRADOS (TIPO: '" + filtroTipo.toUpperCase() + "') ---");

        for (Tour t : tours) {

            if (t.getTipoActividad().equalsIgnoreCase(filtroTipo)) {
                System.out.println(t.toString());
                System.out.println("----------------------------");
            }
        }
        System.out.println("\n=================================================================");
        System.out.println("Ejecución finalizada correctamente.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Tour;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lee los datos de los tours desde un archivo de texto
 * y los almacena en una coleccion.
 *
 * @author macbook
 */

public class GestorDatos {
    /**
     * Lee un archivo de texto y carga los tours en una lista.
     * 
     * @param rutaArchivo ruta del archivo que contiene los tours
     * @return lista de tours cargados
     */
    public List<Tour> cargarDesdeArchivo(String rutaArchivo) {

        List<Tour> lista = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) {

                    continue;
                }
                // Separación de campos por punto y coma (;)

        String[] partes = linea.split(";");


        if (partes.length == 4) {

          String ubicacion = partes[0].trim();

          int precio = Integer.parseInt(partes[1].trim());

          double duracion = Double.parseDouble(partes[2].trim());
          
          String tipoActividad = partes[3].trim();


          // Creación del objeto y adición a la lista dinámica

          Tour tour = new Tour(ubicacion, precio, duracion, tipoActividad);

          lista.add(tour);

        }

      }

      System.out.println("--> Éxito: Se cargaron " + lista.size() + " tours desde el archivo.");

    } catch (IOException e) {

      System.err.println("Error al leer el archivo: " + e.getMessage());

    } catch (NumberFormatException e) {

      System.err.println("Error al parsear el precio: " + e.getMessage());

    }


    return lista;
}
}

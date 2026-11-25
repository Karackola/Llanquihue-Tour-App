/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;
import model.ServicioTuristico;

/**
 * Gestiona la creacion de instancias de prueba
 * de  los diferentes servicios turisticos.
 * 
 * @author macbook
 */

public class GestorServicios {
    
    /**
     * Creas seis servicios turisticos de diferentes categorias.
     * 
     * @return arreglo de servicios turisticos 
     */
    
    public ServicioTuristico[] crearServicios() {
        ServicioTuristico[] servicios = new ServicioTuristico[6];
        
        servicios[0] = new RutaGastronomica("Sabores de Frutillar", 3.0, 5);
        servicios[1] = new RutaGastronomica("Sabores de Puerto Varas", 4.0, 7);
        
        servicios[2] = new PaseoLacustre("Navegacion Llanquihue", 2.5, "Catamarán");
        servicios[3] = new PaseoLacustre("Paseo por Todos los Santos", 3.0, "Lancha");
        
        servicios[4] = new ExcursionCultural("Historia de Frutillar", 2.0, "Museo Colonial Alemán");
        servicios[5] = new ExcursionCultural("Patrimonio de Puerto Varas", 1.5, "Iglesia del Sagrado Corazón");
        
        return servicios;
        
    }
}

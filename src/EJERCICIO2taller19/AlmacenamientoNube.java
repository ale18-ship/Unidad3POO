/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller19;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asd
 */
public class AlmacenamientoNube implements Almacenamiento {
    private final Map<String, String> almacenamiento = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        almacenamiento.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado en la nube: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return almacenamiento.getOrDefault(nombreArchivo, "Archivo no encontrado.");
    }
}

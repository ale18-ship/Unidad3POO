/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICICIO1taller18;

/**
 *
 * @author asd
 */
public class Unidad3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reparacion servicioReparacion = new ServicioDeReparacion();
        Limpieza servicioLimpieza = new ServicioDeLimpieza();
        ServicioMantenimiento ServicioMantenimiento = new ServicioMantenimiento();

        servicioReparacion.realizarReparacion(); // Llama al método de reparación
        servicioLimpieza.realizarLimpieza();    // Llama al método de limpieza
        ServicioMantenimiento.realizarReparacion(); // Realiza ambas tareas
        ServicioMantenimiento.realizarLimpieza();
    }

    }


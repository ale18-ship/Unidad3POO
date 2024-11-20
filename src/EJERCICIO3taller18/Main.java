/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3taller18;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de los vehículos
        Conduccion coche = new Coche();
        Conduccion camionConduccion = new Camion();
        TransporteMercancias camionTransporte = new Camion();

        // Usar métodos de conducción
        coche.conducir();
        camionConduccion.conducir();

        // Usar métodos de transporte de mercancías
        camionTransporte.cargarMercancias(2000);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO3taller18;

/**
 *
 * @author asd
 */
public class Camion implements Conduccion, TransporteMercancias {

    @Override
    public void conducir() {
        System.out.println("El camión está siendo conducido.");
    }

    @Override
    public void cargarMercancias(double peso) {
        System.out.println("Cargando mercancías de " + peso + " kg en el camión.");
    }
    
}

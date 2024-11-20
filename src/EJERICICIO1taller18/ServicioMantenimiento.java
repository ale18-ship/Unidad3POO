/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICICIO1taller18;

/**
 *
 * @author asd
 */
public class ServicioMantenimiento implements Reparacion, Limpieza {

    @Override
    public void realizarReparacion() {
        System.out.println("Realizando reparación general...");
    }

    @Override
    public void realizarLimpieza() {
        System.out.println("Realizando limpieza general...");
    }
    
}

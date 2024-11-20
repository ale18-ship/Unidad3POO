/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICICIO3taller19;

/**
 *
 * @author asd
 */
public class GestorReportes {
    private final GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generar(String contenido) {
        String resultado = generadorReporte.generarReporte(contenido);
        System.out.println(resultado);
    }    
}

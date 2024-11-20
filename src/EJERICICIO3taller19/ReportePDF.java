/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICICIO3taller19;

/**
 *
 * @author asd
 */
public class ReportePDF implements GeneradorReporte {
    @Override
    public String generarReporte(String contenido) {
        return "Reporte en formato PDF generado: " + contenido;
    }
}
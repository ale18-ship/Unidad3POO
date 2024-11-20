/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICICIO3taller19;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorReporte generadorPDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(generadorPDF);
        System.out.println("Generando Reporte PDF...");
        gestorPDF.generar("Contenido del reporte en PDF.");

        GeneradorReporte generadorExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(generadorExcel);
        System.out.println("\nGenerando Reporte Excel...");
        gestorExcel.generar("Contenido del reporte en Excel.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller18;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transferencia transferencia = new ServicioTransferencia();
        Retiro retiro = new ServicioRetiro();
        PagoFactura pagoFactura = new ServicioPagoFactura();
        ServicioBancario operacionesCompletas = new ServicioBancario();

        // Usar servicios específicos
        transferencia.realizarTransferencia(1000, "123-456-789");
        retiro.realizarRetiro(500);
        pagoFactura.pagarFactura("FAC-2024-001", 200);

        // Usar un servicio completo
        operacionesCompletas.realizarTransferencia(2000, "987-654-321");
        operacionesCompletas.realizarRetiro(1000);
        operacionesCompletas.pagarFactura("FAC-2024-002", 300);

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller18;

/**
 *
 * @author asd
 */
public class ServicioPagoFactura implements PagoFactura {

    @Override
    public void pagarFactura(String numeroFactura, double cantidad) {
        System.out.println("Pagando la factura " + numeroFactura + " por un monto de " + cantidad);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller18;

/**
 *
 * @author asd
 */
public class ServicioBancario implements Transferencia, Retiro, PagoFactura {

    @Override
    public void realizarTransferencia(double cantidad, String cuentaDestino) {
        System.out.println("Transfiriendo " + cantidad + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void realizarRetiro(double cantidad) {
        System.out.println("Retirando " + cantidad + " de la cuenta");
    }

    @Override
    public void pagarFactura(String numeroFactura, double cantidad) {
        System.out.println("Pagando la factura " + numeroFactura + " por un importe de " + cantidad);
    }
}


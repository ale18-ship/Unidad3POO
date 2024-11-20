/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller18;

/**
 *
 * @author asd
 */
public class ServicioTransferencia implements Transferencia {

    @Override
    public void realizarTransferencia(double cantidad, String cuentaDestino) {
        System.out.println("Transfiriendo " + cantidad + " a la cuenta " + cuentaDestino);
    }
    
}

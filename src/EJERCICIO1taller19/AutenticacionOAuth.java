/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller19;

/**
 *
 * @author asd
 */
public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(Usuario usuario, String clave) {
        System.out.println("Autenticando con OAuth para: " + usuario.getNombre());
        return usuario.getContraseña().equals(clave);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller19;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuarioLocal = new Usuario("admin", "1234");
        Usuario usuarioOAuth = new Usuario("user1", "password123");

        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);
        System.out.println("Resultado autenticación local: " +
            gestorLocal.autenticar(usuarioLocal, "1234")); // Debe ser true

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);
        System.out.println("Resultado autenticación OAuth: " +
            gestorOAuth.autenticar(usuarioOAuth, "password123")); // Debe ser true
    }
    
}

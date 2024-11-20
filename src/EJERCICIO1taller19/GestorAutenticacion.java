/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller19;

/**
 *
 * @author asd
 */
public class GestorAutenticacion {
  private final ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean autenticar(Usuario usuario, String clave) {
        return servicioAutenticacion.autenticar(usuario, clave);
    }  
}

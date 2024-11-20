/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller19;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);

        gestorLocal.guardar("archivo1.txt", "Contenido en almacenamiento local.");
        System.out.println(gestorLocal.recuperar("archivo1.txt"));

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);

        gestorNube.guardar("archivo2.txt", "Contenido en almacenamiento en la nube.");
        System.out.println(gestorNube.recuperar("archivo2.txt"));
    }
    }

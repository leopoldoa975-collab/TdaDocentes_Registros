package com.mycompany.tdadocentes;

/**
 * Clase base Persona
 * @author Lenovo
 */
public class Persona {
    // Atributo privado (Encapsulamiento)
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar el nombre
    public String mostrarNombre() {
        return "Nombre: " + nombre;
    }
}
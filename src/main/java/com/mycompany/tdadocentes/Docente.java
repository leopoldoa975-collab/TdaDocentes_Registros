package com.mycompany.tdadocentes;

/**
 * Subclase Docente que hereda de Persona (TDA Docente)
 * @author Lenovo
 */
public class Docente extends Persona {
    // Atributos privados
    private String especialidad;
    private String clave;

    // Constructor que invoca al constructor de la clase padre (super)
    public Docente(String nombre, String especialidad, String clave) {
        super(nombre);
        this.especialidad = especialidad;
        this.clave = clave;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Método para mostrar la información completa del docente
    public String mostrarDatos() {
        return "Nombre: " + getNombre()
                + "\nEspecialidad: " + especialidad
                + "\nClave: " + clave;
    }
}
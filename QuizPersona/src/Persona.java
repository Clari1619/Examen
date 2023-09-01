/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbv16
 */
abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    // Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método abstracto
    abstract void presentarse();

    // Método
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}

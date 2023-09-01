/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbv16
 */

 class Empresario extends Persona implements PerfilPPE {
    String empresa;

    // Constructor
    public Empresario(String nombre, String apellido, int edad, String empresa) {
        super(nombre, apellido, edad);
        this.empresa = empresa;
    }

    // Implementación del método abstracto de Persona
    @Override
    void presentarse() {
        System.out.println("Soy " + getNombreCompleto() + ", empresario de la empresa " + empresa + ".");
    }

    // Implementación del método de la interfaz PerfilPPE
    @Override
    public boolean esPPE() {
        /*Lógica para determinar si el empresario es considerado PPE
        Implementa tus criterios específicos aquí
        Por ejemplo, si la empresa es de gran envergadura y la edad es menor a 50, se considera PPE*/
        return empresa.equalsIgnoreCase("Gran Empresa") && edad < 50;
    }
}


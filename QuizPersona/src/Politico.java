/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbv16
 */
class Politico extends Persona implements PerfilPPE {
    private String partidoPolitico;

    // Constructor
    public Politico(String nombre, String apellido, int edad, String partidoPolitico) {
        super(nombre, apellido, edad);
        this.partidoPolitico = partidoPolitico;
    }

    // Implementación del método abstracto de Persona
    @Override
    void presentarse() {
        System.out.println("Soy " + getNombreCompleto() + ", político del partido " + partidoPolitico + ".");
    }

    // Implementación del método de la interfaz PerfilPPE
    @Override
    public boolean esPPE() {
        /* Lógica para determinar si el político es considerado PPE
        Implementa tus criterios específicos aquí
        Por ejemplo, si el partido político pertenece a un gobierno y la edad es mayor a 40, se considera PPE*/
        return partidoPolitico.equalsIgnoreCase("Gobierno") && edad > 40;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cbv16
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Crear objetos de tipo Politico y Empresario
        Politico politico = new Politico("Juan", "Pérez", 45, "Gobierno");
        Empresario empresario = new Empresario("María", "López", 55, "Gran Empresa");

        // Llamar al método presentarse() y esPPE() para cada objeto
        politico.presentarse();
        System.out.println("¿Es considerado PPE? " + politico.esPPE());

        empresario.presentarse();
        System.out.println("¿Es considerado PPE? " + empresario.esPPE());

        // Mostrar los datos del empresario de la misma forma que los del político
        System.out.println("Nombre completo: " + empresario.getNombreCompleto());
        System.out.println("Empresa: " + empresario.empresa);
        System.out.println("¿Es considerado PPE? " + empresario.esPPE());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbv16
 */
public class PersonaPoliticaExpuesta {
    
    private String nombre;
    private String apellido;
    private String cargo;
    private String organizacion;
    private String nivelRiesgo;
    private String estatusActual;

    // Constructor
    public PersonaPoliticaExpuesta(String nombre, String apellido, String cargo, String organizacion, String nivelRiesgo, String estatusActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.organizacion = organizacion;
        this.nivelRiesgo = nivelRiesgo;
        this.estatusActual = estatusActual;
    }

    // Métodos Getter
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public String getEstatusActual() {
        return estatusActual;
    }

    // Método esPPE
    public boolean esPPE() {
        /*Lógica para determinar si la persona es considerada políticamente expuesta
        Implementa tus criterios específicos aquí
        Por ejemplo, si el nivel de riesgo es alto y la persona está en el cargo, se considera PPE*/
        return nivelRiesgo.equalsIgnoreCase("alto") && estatusActual.equalsIgnoreCase("en el cargo");
    }
}

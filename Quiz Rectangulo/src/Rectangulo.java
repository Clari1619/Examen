
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cbv16
 */
public class Rectangulo {

    private int ancho;
    private int altura;

    public Rectangulo(int ancho, int altura) throws RectanguloException {
        if (ancho <= 0 || altura <= 0) {
            throw new RectanguloException("El ancho y la altura deben ser mayores a 0");
        }
        this.ancho = ancho;
        this.altura = altura;
    }

    public int calcularArea() {
        return ancho * altura;
    }

    private static class RectanguloException extends Exception {

        public RectanguloException() {
        }

        private RectanguloException(String el_ancho_y_la_altura_deben_ser_mayores_a_) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

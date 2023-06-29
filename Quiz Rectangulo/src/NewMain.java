
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cbv16
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el ancho del rectángulo: ");
            int ancho = scanner.nextInt();
            System.out.print("Ingrese la altura del rectángulo: ");
            int altura = scanner.nextInt();

            Rectangulo rectangulo = new Rectangulo(ancho, altura);
            int area = rectangulo.calcularArea();
            System.out.println("El área del rectángulo es: " + area);
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores enteros válidos para el ancho y la altura.");
        }
    }

    private static class RectanguloException {

        public RectanguloException() {
        }

        private String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}

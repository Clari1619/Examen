/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author cbv16
 */
public class Items {
    
    private String concepto;
    private int preCantidad;
    private int cantidad;

    public Items(String concepto, int preCantidad, int cantidad) {
        this.concepto = concepto;
        this.preCantidad = preCantidad;
        this.cantidad = cantidad;
    }

    public Items() {
        this.concepto = "";
        this.preCantidad = 0;
        this.cantidad = 0;        
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getPreCantidad() {
        return preCantidad;
    }

    public void setPreCantidad(int preCantidad) {
        this.preCantidad = preCantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}

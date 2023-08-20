/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import javax.swing.JOptionPane;

/**
 *
 * @author cbv16
 */
public class AlmacItems {
    
    private Items datos[];
    private int numRegs;

    public AlmacItems(int tam) {
        this.datos = new Items[tam];
        this.numRegs = 0;
    }

    public Items[] getDatos() {
        return datos;
    }

    public void setDatos(Items[] datos) {
        this.datos = datos;
    }

    public int getNumRegs() {
        return numRegs;
    }

    public void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }
    
    public boolean isFull(){
        return datos.length == this.getNumRegs();
    }
    
    public Items buscarItems(String concept){
        for(int i = 0; i < this.numRegs; i++){
            if (concept == this.datos[i].getConcepto()){
                return this.datos[i];
            }
        }
        return null;
    }
    
    public boolean eliminarItems(int index){
        if (index > -1 && index < this.numRegs){
            for (int i = index; i < this.numRegs-1; i++) {
                this.datos[i]=this.datos[i+1];
            }
            this.datos[this.numRegs-1] = new Items ();
            this.numRegs --;
            return true;
        }
        return false;
    }
    
    public boolean editarItems(Items item, int index){
        this.datos[index]= item;
        return true;
    }
    
        public boolean insertarItems(Items item){
        if (isFull()){
            JOptionPane.showMessageDialog(null, "El vector está lleno");
        }else{
            this.datos[this.numRegs] = item;
            this.numRegs ++;
            return true;
        }
        return false;
    }
    
    
}

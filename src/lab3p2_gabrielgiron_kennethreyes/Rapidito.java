/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;


public class Rapidito extends Transporte{

    private int sillas;

    public Rapidito(String nombre, int sillas, String placa, String color) {
        super(nombre, placa, color);
        this.sillas = sillas;
    }
    
    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }
    
    @Override
    public String toString() {
        return "Vehiculo: Rapidito, "+super.toString()+", Sillas: "+sillas;
    }

}

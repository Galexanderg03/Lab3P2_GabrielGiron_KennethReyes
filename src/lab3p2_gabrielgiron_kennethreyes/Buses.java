/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Daniel
 */

public class Buses extends Transporte {

    private int sillas;
    private int pie;

    public Buses(String nombre, int sillas, int pie, String placa, String color) {
        super(nombre, placa, color);
        this.sillas = sillas;
        this.pie = pie;
    }
    
    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getPie() {
        return pie;
    }

    public void setPie(int pie) {
        this.pie = pie;
    }

    @Override
    public String toString() {
        return "Vehiculo: Bus: "+super.toString();
    }

}

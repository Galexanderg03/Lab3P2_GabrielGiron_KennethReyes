/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Daniel
 */
public class MotoTaxi extends Transporte{

    final int capacidad = 2;

    public MotoTaxi(String placa, String color) {
        super(placa, color);
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    @Override
    public String toString() {
        return "Vehiculo: MotoTaxi"+super.toString();
    }

}

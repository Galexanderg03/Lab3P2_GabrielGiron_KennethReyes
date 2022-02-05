/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Daniel
 */
public class Taxi extends Transporte{

    final int capacidad = 4;
    private String idTaxi;

    public Taxi(String nombre, String id, String placa, String color) {
        super(nombre, placa, color);
        this.idTaxi = id;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public String getIdTaxi() {
        return idTaxi;
    }

    public void setId(String idTaxi) {
        this.idTaxi = idTaxi;
    }

    @Override
    public String toString() {
        return "Vehiculo: Taxi"+super.toString()+", Capacidad: "+capacidad+", Numero de taxi: "+idTaxi;
    }

}

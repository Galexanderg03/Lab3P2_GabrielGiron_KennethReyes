/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3p2_kennethreyes;

/**
 *
 * @author Daniel
 */
public class MotoTaxi {
int capacidad;

    public MotoTaxi() {
    }

    public MotoTaxi(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "MotoTaxi" + "capacidad= " + capacidad ;
    }

}

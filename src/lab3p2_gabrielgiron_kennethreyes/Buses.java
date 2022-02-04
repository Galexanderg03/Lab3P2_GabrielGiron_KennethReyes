/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_gabrielgiron_kennethreyes;

import java.util.ArrayList;

/**
 *
 * @author Galex
 */
public class Buses extends Transportes {
    
    private ArrayList<Alumno> Alumnos = new ArrayList();

    public Buses(String Placa, String Color, String Transportista) {
        super(Placa, Color, Transportista);
    }

    public ArrayList<Alumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> Alumnos) {
        this.Alumnos = Alumnos;
    }
    
}

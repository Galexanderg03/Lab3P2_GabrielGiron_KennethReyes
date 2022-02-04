/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_gabrielgiron_kennethreyes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Galex
 */
public class Alumno extends Personas{
    private long IDEstudiante;
    private ArrayList<Clase> Clases = new ArrayList();
    
    public Alumno(long IDEstudiante, String Nombre, long ID, Date FechaNacimiento) {
        super(Nombre, ID, FechaNacimiento);
        this.IDEstudiante = IDEstudiante;
    }

    public long getIDEstudiante() {
        return IDEstudiante;
    }

    public void setIDEstudiante(long IDEstudiante) {
        this.IDEstudiante = IDEstudiante;
    }

    public ArrayList<Clase> getClases() {
        return Clases;
    }

    public void setClases(ArrayList<Clase> Clases) {
        this.Clases = Clases;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IDEstudiante=" + IDEstudiante + ", Clases=" + Clases + '}';
    }
}

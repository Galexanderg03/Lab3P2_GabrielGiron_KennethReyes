/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3p2_kennethreyes;

/**
 *
 * @author Daniel
 */
import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona{
    int estudentid;
    ArrayList <Clase> clases;

    public Alumno(int estudentid, ArrayList<Clase> clases, String nombre, int id, Date fecha) {
        super(nombre, id, fecha);
        this.estudentid = estudentid;
        this.clases = clases;
    }

    public Alumno() {
    }

    public int getEstudentid() {
        return estudentid;
    }

    public void setEstudentid(int estudentid) {
        this.estudentid = estudentid;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumno " + "estudiante identidad= " + estudentid + ", clases= " + clases ;
    }
    
    
}

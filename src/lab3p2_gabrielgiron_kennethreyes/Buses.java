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

public class Buses {
ArrayList<Alumno> alumnos;
int sillas;
int pie;

    public Buses(ArrayList<Alumno> alumnos, int sillas, int pie) {
        this.alumnos = alumnos;
        this.sillas = sillas;
        this.pie = pie;
    }

    public Buses() {
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
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
        return "Buses " + "alumnos= " + alumnos + ", sillas= " + sillas + ", pie= " + pie ;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Daniel
 */
import java.util.ArrayList;

public class Rapidito {

    private int sillas;
    private ArrayList<Alumno> alummnos;

    public Rapidito() {
    }

    public Rapidito(int sillas, ArrayList<Alumno> alummnos) {
        this.sillas = sillas;
        this.alummnos = alummnos;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Alumno> getAlummnos() {
        return alummnos;
    }

    public void setAlummnos(ArrayList<Alumno> alummnos) {
        this.alummnos = alummnos;
    }

    @Override
    public String toString() {
        return "Rapidito " + "sillas= " + sillas + ", alummnos= " + alummnos;
    }

}

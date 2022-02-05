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
import java.util.Date;

public class Alumno extends Persona {

    private int estudentid;
    private ArrayList<Clase> clases = new ArrayList();

    public Alumno(int estudentid, String nombre, int id, Date fecha) {
        super(nombre, id, fecha);
        this.estudentid = estudentid;
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
        return super.toString()+"Id estudiante: "+estudentid;
    }

}

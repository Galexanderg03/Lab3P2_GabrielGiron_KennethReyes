/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Daniel
 */
import java.util.Date;

public class Transportista extends Persona {

    private int timeexp;
    private String apodo;

    public Transportista(int timeexp, String apodo, String nombre, int id, Date fecha) {
        super(nombre, id, fecha);
        this.timeexp = timeexp;
        this.apodo = apodo;
    }

    public int getTimeexp() {
        return timeexp;
    }

    public void setTimeexp(int timeexp) {
        this.timeexp = timeexp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString()+", Tiempo de experiencia: "+timeexp+", Apodo: "+apodo;
    }

}

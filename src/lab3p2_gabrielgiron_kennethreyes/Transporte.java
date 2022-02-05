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

public class Transporte {

    private String placa;
    private String color;
    private String transportista;
    private ArrayList<Rutas> rutas = new ArrayList();
    private ArrayList<Alumno> alumn = new ArrayList();

    public Transporte(String placa, String color) {
        this.placa = placa;
        this.color = color;
    }

    public ArrayList<Alumno> getAlumn() {
        return alumn;
    }

    public void setAlumn(ArrayList<Alumno> alumn) {
        this.alumn = alumn;
    }

    public Transporte() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Rutas> getRutas() {
        return rutas;
    }

    public void setRutas(ArrayList<Rutas> rutas) {
        this.rutas = rutas;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Color: " + color + ", Transportista: " + transportista + ", Rutas: " + rutas;
    }

}

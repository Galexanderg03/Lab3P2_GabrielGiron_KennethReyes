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
public class Transportes {
    private String Placa;
    private String Color;
    private String Transportista;
    private ArrayList<Estacion> Estaciones = new ArrayList();

    public Transportes(String Placa, String Color, String Transportista) {
        this.Placa = Placa;
        this.Color = Color;
        this.Transportista = Transportista;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTransportista() {
        return Transportista;
    }

    public void setTransportista(String Transportista) {
        this.Transportista = Transportista;
    }

    public ArrayList<Estacion> getEstaciones() {
        return Estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> Estaciones) {
        this.Estaciones = Estaciones;
    }
    
    @Override
    public String toString() {
        return "Transportes{" + "Placa=" + Placa + ", Color=" + Color + ", Transportista=" + Transportista + ", Estaciones=" + Estaciones + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Galex
 */
public class Clase {
    private int Codigo;
    private String Nombre;

    public Clase(int Codigo, String Nombre) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Clase{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + '}';
    }
}

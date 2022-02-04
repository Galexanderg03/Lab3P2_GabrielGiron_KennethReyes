/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_gabrielgiron_kennethreyes;

import java.util.Date;

/**
 *
 * @author Galex
 */
public class Transportista extends Personas{
    private int AñosEXP;
    private String Apodo;

    public Transportista(int AñosEXP, String Apodo, String Nombre, long ID, Date FechaNacimiento) {
        super(Nombre, ID, FechaNacimiento);
        this.AñosEXP = AñosEXP;
        this.Apodo = Apodo;
    }

    public int getAñosEXP() {
        return AñosEXP;
    }

    public void setAñosEXP(int AñosEXP) {
        this.AñosEXP = AñosEXP;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    @Override
    public String toString() {
        return "Transportista{" + "AñosEXP=" + AñosEXP + ", Apodo=" + Apodo + '}';
    }
}

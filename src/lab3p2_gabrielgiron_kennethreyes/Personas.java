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
public class Personas {
    private String Nombre;
    private long ID;
    private Date FechaNacimiento;

    public Personas(String Nombre, long ID, Date FechaNacimiento) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", ID=" + ID + ", FechaNacimiento=" + FechaNacimiento + '}';
    }
}

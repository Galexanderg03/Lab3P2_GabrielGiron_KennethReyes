/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

/**
 *
 * @author Daniel
 */
public class Clase {
    private int codigo;
    private String Name;
    
    public Clase(int codigo, String Name) {
        this.codigo = codigo;
        this.Name = Name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Clase: "+ Name + "codigo: " + codigo;
    }

}

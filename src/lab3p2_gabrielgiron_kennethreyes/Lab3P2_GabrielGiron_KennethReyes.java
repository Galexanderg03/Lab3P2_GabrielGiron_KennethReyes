/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_gabrielgiron_kennethreyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Galex
 */
public class Lab3P2_GabrielGiron_KennethReyes {
static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Personas> Personas = new ArrayList();
        ArrayList<Transportes> Transportes = new ArrayList();
        ArrayList<Estacion> Rutas = new ArrayList();
        int opcion = -1;
        do {
            System.out.println("0. Salir\n1. Crear Clase\n2. Crear Ruta\n3. Crear Alumno\n4. Agregar Clase a Alumno\n"
                    + "5. Crear Transportista\n6. Crear Transporte\n7. Simulación\n8. Listar Clases\n9. Listar Rutas\n"
                    + "10. Listar Alumnos\n11. Listar Transportistas\n12. Listar Transportes");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    Simulacion();
                    break;
                    
                case 8:
                    break;
                    
                case 9:
                    break;
                    
                case 10:
                    break;
                    
                case 11:
                    break;
                    
                case 12:
                    break;
                    
                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        } while (opcion != 0);
    }
    
    public static void Simulacion(){
        int opcion = 0;
        do{
        System.out.println("0. Salir\n1. Subir alumno al transporte\n2. Bajar alumno del transporte\n" +
                "3. Listar alumnos del transporte\n4. Escoger transportista\n5. Quitar transportista\n" +
                "6. Añadir ruta\n7. Quitar ruta\n8. Imprimir transporte\n9. Comenzar");
        opcion = read.nextInt();
        switch(opcion){
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
                
            case 5:
                break;
                
            case 6:
                break;
                
            case 7:
                break;
                
            case 8:
                break;
                
            case 9:
                break;
                
            default:
                System.out.println("Opcion no valida!");
                break;
        }
        }while(opcion!=0);
    }
}
    


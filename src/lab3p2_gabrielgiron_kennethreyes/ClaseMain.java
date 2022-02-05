/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielgiron_kennethreyes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class ClaseMain {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Clase> clases = new ArrayList();
    static ArrayList<Persona> pers = new ArrayList();
    static ArrayList<Transporte> trans = new ArrayList();
    static ArrayList<Rutas> rutas = new ArrayList();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("0. Salir\n1. Crear Clase\n2. Crear Ruta\n3. Crear Alumno\n4. Agregar Clase a Alumno\n"
                    + "5. Crear Transportista\n6. Crear Transporte\n7. Simulación\n8. Listar Clases\n9. Listar Rutas\n"
                    + "10. Listar Alumnos\n11. Listar Transportistas\n12. Listar Transportes");
            opcion = read.nextInt();
            switch (opcion) {
                case 0:
                    break;
                    
                case 1:
                    crearClass();
                    break;

                case 2:
                    crearRuta();
                    break;

                case 3:
                    crearAlum();
                    break;

                case 4:
                    agregarClaseAlumno();
                    break;

                case 5:
                    crearTransportista();
                    break;

                case 6:
                    crearTransporte();
                    break;

                case 7:
                    System.out.println("Ingrese la posicion del transporte en la lista");
                    int pos = read.nextInt();
                    if (pos < trans.size()) {
                        Simulacion(trans.get(pos));
                    } else {
                        System.out.println("Posicion no valida");
                    }
                    break;

                case 8:
                    listarClases();
                    break;

                case 9:
                    listarRutas();
                    break;

                case 10:
                    listarAlum();
                    break;

                case 11:
                    listarTransportistas();
                    break;

                case 12:
                    listarTransportes();
                    break;

                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        } while (opcion != 0);
    }

    public static void Simulacion(Transporte tran) {
        int opcion;
        do {
            System.out.println("0. Salir\n1. Subir alumno al transporte\n2. Bajar alumno del transporte\n"
                    + "3. Listar alumnos del transporte\n4. Escoger transportista\n5. Quitar transportista\n"
                    + "6. Añadir ruta\n7. Quitar ruta\n8. Imprimir transporte\n9. Comenzar");
            opcion = read.nextInt();
            switch (opcion) {
                case 0:
                    break;
                
                case 1: {
                    System.out.println("Ingrese la posicion del alumno en la lista");
                    int pos = read.nextInt();
                    if (pos < pers.size()) {
                        if (pers.get(pos) instanceof Alumno) {
                            tran.getAlumn().add(((Alumno) pers.get(pos)));
                        } else {
                            System.out.println("Posicion no Valida");
                        }
                    } else {
                        System.out.println("Posicion no Valida");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Ingrese la posicion del alumno en la lista");
                    int pos = read.nextInt();
                    if (pos < pers.size()) {
                        if (pers.get(pos) instanceof Alumno) {
                            tran.getAlumn().remove(pos);
                        } else {
                            System.out.println("Posicion no Valida");
                        }
                    } else {
                        System.out.println("Posicion no Valida");
                    }
                    break;
                }

                case 3: {
                    String salida = "";
                    for (int i = 0; i < tran.getAlumn().size(); i++) {
                        salida = salida + tran.getAlumn().get(i) + "\n";
                    }
                    System.out.println(salida);
                    break;
                }

                case 4: {
                    System.out.println("Ingrese la posicion del transportista en la lista: ");
                    int pos = read.nextInt();
                    if(pos<pers.size()){
                        if(pers.get(pos) instanceof Transportista){
                            String transports = pers.get(pos).getNombre();
                            tran.setTransportista(transports);
                        }
                    }
                    break;
                }

                case 5: {
                    tran.setTransportista("");
                    break;
                }

                case 6:{
                    System.out.println("Ingrese la posicion de la ruta en la lista");
                    int pos = read.nextInt();
                    if (pos < rutas.size()) {
                        tran.getRutas().add(rutas.get(pos));
                    } else {
                        System.out.println("Posicion no Valida");
                    }
                    break;
                }
                
                case 7:
                    System.out.println("Ingrese la posicion de la ruta en la lista a eliminar");
                    int pos = read.nextInt();
                    if (pos < rutas.size()) {
                        tran.getRutas().remove(pos);
                    } else {
                        System.out.println("Posicion no Valida");
                    }
                    break;

                case 8:
                    Transporte Trans = new Transporte();
                    System.out.println(Trans.toString());
                    break;

                case 9:
                    Simulacion(tran);
                    break;

                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        } while (opcion != 0);
    }

    public static void crearClass() {
        System.out.println("Ingrese el codigo de la clase");
        int codigo = read.nextInt();
        System.out.println("Ingrese el nombre de la clase");
        String clase = read.next();
        Clase u = new Clase(codigo, clase);
        clases.add(u);
    }

    public static void crearAlum() {
        System.out.println("Ingrese id de estudiante: ");
        int idEstudiante = read.nextInt();
        System.out.println("Nombre del estudiante: ");
        String name = read.next();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fecha = read.next();
        try {
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            Alumno u = new Alumno(idEstudiante, name, idEstudiante, fechaNacimiento);
            pers.add(u);
        } catch (ParseException ex) {
            Logger.getLogger(ClaseMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void crearRuta() {
        System.out.println("Ingrese el nombre de la ruta: ");
        String name = read.next();
        System.out.println("Ingrese la posicion X: ");
        int x = read.nextInt();
        System.out.println("Ingrese la posicion Y: ");
        int y = read.nextInt();
        rutas.add(new Rutas(name, x, y));
    }

    public static void crearTransporte() {
        System.out.println("1. Bus\n2. Rapidito\n3. Mototaxi\n4. Taxi");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Cuantas sillas tiene el bus: ");
                int sillas = read.nextInt();
                System.out.println("Cuantas personas pueden estar de pie: ");
                int pie = read.nextInt();
                System.out.println("Ingrese la placa: ");
                String placa = read.next();
                System.out.println("Ingrese el color del bus: ");
                String color = read.next();
                Buses u = new Buses(sillas, pie, placa, color);
                trans.add(u);
                break;
            }
            case 2: {
                System.out.println("Cuantas sillas tiene el rapidito: ");
                int sillas = read.nextInt();
                System.out.println("Ingrese la placa: ");
                String placa = read.next();
                System.out.println("Ingrese el color del Rapidito: ");
                String color = read.next();
                Rapidito u = new Rapidito(sillas, placa, color);
                trans.add(u);
                break;
            }
            case 3: {
                System.out.println("Ingrese la placa: ");
                String placa = read.next();
                System.out.println("Ingrese el color del MotoTaxi: ");
                String color = read.next();
                MotoTaxi u = new MotoTaxi(placa, color);
                trans.add(u);
                break;
            }

            case 4: {
                System.out.println("Ingrese el numero de Taxi : ");
                String idTaxi = read.next();
                System.out.println("Ingrese la placa: ");
                String placa = read.next();
                System.out.println("Ingrese el color del Taxi: ");
                String color = read.next();
                Taxi u = new Taxi(idTaxi, placa, color);
                trans.add(u);
                break;
            }
            default:
                System.out.println("Opcion no valida!");
                break;
        }
    }

    public static void crearTransportista() {
        System.out.println("Ingrese el tiempo de experiencia: ");
        int timeexp = read.nextInt();
        System.out.println("Ingrese el apodo: ");
        String apodo = read.next();
        System.out.println("Ingrese el nombre: ");
        String nombre = read.next();
        System.out.println("Ingrese el id: ");
        int id = read.nextInt();
        System.out.println("Ingrese la fecha de nacimiento: ");
        String fecha = read.next();
        try {
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            Transportista u = new Transportista(timeexp, apodo, nombre, id, fechaNacimiento);
            pers.add(u);
        } catch (ParseException ex) {
            Logger.getLogger(ClaseMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void agregarClaseAlumno() {
        System.out.println("Ingrese la posicion del Alumno en la lista");
        int pos1 = read.nextInt();
        System.out.println("Ingrese la posicion de la clase en la lista");
        int pos2 = read.nextInt();
        if (pos1 < pers.size()) {
            if (pers.get(pos1) instanceof Alumno) {
                ((Alumno) pers.get(pos1)).getClases().add(clases.get(pos2));
            }
        } else {
            System.out.println("Posicion Invalida");
        }
    }

    public static void listarClases() {
        for (Clase clas : clases) {
            System.out.println(clases.indexOf(clas));
        }
    }

    public static void listarRutas() {
        for (Rutas rut : rutas) {
            System.out.println(rutas.indexOf(rut));
        }
    }

    public static void listarAlum() {
        String salida = "";
        for (int i = 0; i < pers.size(); i++) {
            if (pers.get(i) instanceof Alumno) {
                salida = salida + pers.get(i) + "\n";
            }
        }
        System.out.println(salida);
    }

    public static void listarTransportistas() {
        String salida = "";
        for (int i = 0; i < pers.size(); i++) {
            if (pers.get(i) instanceof Transportista) {
                salida = salida + pers.get(i) + "\n";
            }
        }
        System.out.println(salida);
    }

    public static void listarTransportes() {
        for (Transporte transp : trans) {
            System.out.println(trans.indexOf(transp));
        }
    }
}

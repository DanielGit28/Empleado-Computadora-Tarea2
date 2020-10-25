package cr.ac.ucenfotec.tarea2.bl.logica;

import cr.ac.ucenfotec.tarea2.bl.entidades.Computadora;
import cr.ac.ucenfotec.tarea2.bl.entidades.Empleado;

import java.util.ArrayList;

public class Gestor {
    ArrayList<Empleado> empleados = new ArrayList<> ();
    ArrayList<Computadora> computadoras = new ArrayList<> ();

    public Gestor() {
        this.empleados = new ArrayList<> ();
    }
    public void agregarEmpleado(String identificacion, String nombre, String edad) {
        Empleado empleado = new Empleado(identificacion, nombre, edad);
        empleados.add(empleado);
    }
    public void agregarComputadora(String idEmpleado, String serie, String marca) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado temp = empleados.get(i);
            if(temp.getIdentificacion().equals(idEmpleado)) {
                Computadora compu = new Computadora(serie, marca, temp);
                computadoras.add(compu);
                break;
            }
        }
    }

    public ArrayList<Empleado> listarEmpleados() {
        return this.empleados;
    }
    public ArrayList<Computadora> listarComputadoras() {
        return this.computadoras;
    }

}

package cr.ac.ucenfotec.tarea2.bl.logica;

import cr.ac.ucenfotec.tarea2.bl.entidades.Computadora;
import cr.ac.ucenfotec.tarea2.bl.entidades.Empleado;

import java.util.ArrayList;
/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
public class Gestor {
    ArrayList<Empleado> empleados = new ArrayList<> ();
    ArrayList<Computadora> computadoras = new ArrayList<> ();

    public Gestor() {
        this.empleados = new ArrayList<> ();
    }

    /**
     *
     * @param identificacion cadena de caracteres que determina la identificacion del empleado
     * @param nombre cadena de caracteres que determina el nombre del empleado
     * @param edad el entero que determina la edad del empleado
     */
    public void agregarEmpleado(String identificacion, String nombre, String edad) {
        Empleado empleado = new Empleado(identificacion, nombre, edad);
        empleados.add(empleado);
    }

    /**
     *
     * @param idEmpleado cadena de caracteres que determina que a que empleado le corresponde la computadora
     * @param serie cadena de caracteres que determina el codigo de serie de la computadora
     * @param marca cadena de caracteres que determina la marca de la computadora
     */
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

    /**
     *
     * @return empleados arreglo que contiene objetos del tipo Empleado
     */
    public ArrayList<Empleado> listarEmpleados() {
        return this.empleados;
    }

    /**
     *
     * @return computadoras arreglo que contiene objetos del tipo Computadora
     */
    public ArrayList<Computadora> listarComputadoras() {
        return this.computadoras;
    }

}

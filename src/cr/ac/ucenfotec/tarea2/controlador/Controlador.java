package cr.ac.ucenfotec.tarea2.controlador;

import cr.ac.ucenfotec.tarea2.bl.entidades.Computadora;
import cr.ac.ucenfotec.tarea2.bl.entidades.Empleado;
import cr.ac.ucenfotec.tarea2.bl.logica.Gestor;
import cr.ac.ucenfotec.tarea2.iu.IU;

import java.util.ArrayList;
/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
public class Controlador {
    private IU interfaz = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion!=5);
    }

    /**
     *
     * @param opcion el entero que procesa el switch con diferentes opciones
     */
    private void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                crearEmpleado();
                break;
            case 2:
                crearComputadora();
                break;
            case 3:
                listarEmpleados();
                break;
            case 4:
                listarComputadoras();
            case 5:
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    private void crearEmpleado() {
        interfaz.imprimirMensaje("Introduzca la identificación del empleado: ");
        String id = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca el nombre del empleado: ");
        String nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca la edad del empleado: ");
        String edad = interfaz.leerTexto();
        gestor.agregarEmpleado(id, nombre,edad);
        interfaz.imprimirMensaje("Empleado creado creado");
    }
    private void crearComputadora() {
        interfaz.imprimirMensaje("Introduzca la identificación del empleado al que le corresponde la computadora: ");
        String idEmpleado = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca el numero de serie de la computadora: ");
        String serie = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca la marca de la computadora: ");
        String marca = interfaz.leerTexto();
        gestor.agregarComputadora(idEmpleado, serie, marca);
        interfaz.imprimirMensaje("Computadora asignada con éxito");
    }

    private void listarEmpleados() {
        ArrayList<Empleado> empleados = gestor.listarEmpleados();
        interfaz.imprimirMensaje("Lista de empleados");
        for (int i = 0; i < empleados.size(); i++) {
            interfaz.imprimirMensaje(empleados.get(i).toString());
        }
    }
    private void listarComputadoras() {
        ArrayList<Computadora> compus = gestor.listarComputadoras();
        interfaz.imprimirMensaje("Lista de computadoras");
        for (int i = 0; i < compus.size(); i++) {
            interfaz.imprimirMensaje(compus.get(i).toString());
        }
    }
}

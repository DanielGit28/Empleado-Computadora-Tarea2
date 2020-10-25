package cr.ac.ucenfotec.tarea2.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu() {
        output.println("Bienvenido, escoja una opción");
        output.println("1. Registrar empleados");
        output.println("2. Registrar computadoras");
        output.println("3. Listar empleados");
        output.println("4. Listar computadoras");
        output.println("5. Salir");
    }

    public int leerOpcion() {
        output.println("Su opción es: ");
        return input.nextInt();
    }
    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }
    public String leerTexto() {
        return input.next();
    }
}

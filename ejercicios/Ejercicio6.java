import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = teclado.nextLine();

        System.out.print( "Ingrese el apellido del alumno: ");
        String apellido = teclado.nextLine();

        System.out.print( "Ingrese su edad: ");
        String edad = teclado.nextLine();

        System.out.print( "Ingrese su nota: ");
        String nota = teclado.nextLine();

        teclado.close();

        System.out.print("Esperando respuesta: ");

        System.out.println(" El alumno " + nombre + "" + apellido + ", de " + edad + " años de edad tiene una nota media de " + nota + ".");
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");

        String nombre = teclado.nextLine();

        System.out.print("El nombre guardado en la variable es: " + nombre);

        teclado.close();
    }
}

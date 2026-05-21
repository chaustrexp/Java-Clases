import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = teclado.nextDouble();

        double cuadrado = numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        teclado.close();
    }

}

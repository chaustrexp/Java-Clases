
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor limite (x): ");
        int x = teclado.nextInt();

        int numeroActual = 1;
        int sumaAcumulada = 0;

        System.out.print("Numeros: ");

        while (sumaAcumulada <= x) {
            System.out.print(numeroActual + " ");

            sumaAcumulada += numeroActual;

            numeroActual++;
        }

        System.out.println("\nSuma total obtenida: " + sumaAcumulada);

        teclado.close();
    }
}

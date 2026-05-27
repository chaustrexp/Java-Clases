import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero para verificar si es primo: ");
        int numero = teclado.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " SÍ es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }

        teclado.close();
    }

    public static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
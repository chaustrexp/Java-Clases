import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroIntroducido;
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros. El programa terminará cuando ingreses un 0.");

        do {
            System.out.print("Introduce un número: ");
            numeroIntroducido = teclado.nextInt();

            if (numeroIntroducido != 0) {
                numeros.add(numeroIntroducido);
            }
        } while (numeroIntroducido != 0);

        if (numeros.isEmpty()) {
            System.out.println("No se introdujo ningún número además del 0.");
        } else {

            Collections.sort(numeros);

            System.out.println("\nLos números insertados (ordenados de menor a mayor) son:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
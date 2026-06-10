import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vector = new int[10];

        System.out.println("Por favor, ingrese 10 numeros enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento en la posicion [" + i + "]: ");
            vector[i] = teclado.nextInt();
        }

        System.out.println("\n--- Los elementos guardados en el vector son: ---");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion " + i + " -> Valor: " + vector[i]);
        }

        teclado.close();
    }
}


import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vector = new int[10];
        int elementosLeidos = 0;

        System.out.println("Ingrese hasta 10 numeros enteros (si ingresa uno mayor a 20, el programa se detendra):");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento [" + i + "]: ");
            int numero = teclado.nextInt();

            if (numero > 20) {
                System.out.println("\n¡Lectura interrumpida! Se ingreso un numero mayor a 20 (" + numero + ").");
                break;
            }

            vector[i] = numero;
            elementosLeidos++;
        }

        System.out.println("\n--- Elementos leidos con exito ---");
        for (int i = 0; i < elementosLeidos; i++) {
            System.out.println("Posicion " + i + " -> Valor: " + vector[i]);
        }

        teclado.close();
    }
}
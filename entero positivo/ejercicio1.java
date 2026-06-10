import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo n: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: El número debe ser entero positivo (mayor que 0).");
            } else {
                double suma = 0.0;
                System.out.print("Serie: ");
                for (int i = 1; i <= n; i++) {
                    suma += 1.0 / i;
                    if (i == 1) {
                        System.out.print("1");
                    } else {
                        System.out.print(" + 1/" + i);
                    }
                }
                System.out.println();
                System.out.printf("La suma de la serie para n = %d es: %.6f%n", n, suma);
            }
        } else {
            System.out.println("Error: Entrada no válida.");
        }
        scanner.close();
    }
}

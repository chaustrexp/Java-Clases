import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de Fibonacci (n): ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: El número de términos debe ser mayor que 0.");
            } else {
                System.out.print("Los primeros " + n + " números de Fibonacci son: ");

                long t1 = 0;
                long t2 = 1;

                for (int i = 1; i <= n; i++) {
                    System.out.print(t1);
                    if (i < n) {
                        System.out.print(", ");
                    }

                    long sum = t1 + t2;
                    t1 = t2;
                    t2 = sum;
                }
                System.out.println();
            }
        } else {
            System.out.println("Error: Entrada no válida.");
        }
        scanner.close();
    }
}

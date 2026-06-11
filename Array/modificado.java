package Array;

import java.util.Scanner;

public class modificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("  BUSCADOR DE ELEMENTO EN UN ARRAY ");
        System.out.print("Ingrese el tamano del array: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un numero entero valido.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Error: El tamano del array debe ser mayor a 0.");
            scanner.close();
            return;
        }

        int[] numeros = new int[n];
        System.out.println("Ingrese los " + n + " elementos del array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + (i + 1) + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un numero entero valido.");
                System.out.print("Elemento [" + (i + 1) + "]: ");
                scanner.next();
            }
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nIngrese el numero entero que desea buscar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingrese un numero entero valido.");
            System.out.print("Ingrese el numero entero que desea buscar: ");
            scanner.next();
        }
        int buscar = scanner.nextInt();

        int posicion = -1;
        int giros = 0;
        for (int i = 0; i < n; i++) {
            giros++;
            if (numeros[i] == buscar) {
                posicion = i;
                break;
            }
        }

        System.out.println(" RESULTADOS ");
        System.out.println("Numero de giros en la busqueda: " + giros);
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        if (posicion != -1) {
            System.out.println("El numero " + buscar + " se encuentra en la posicion (indice) " + posicion
                    + " (Elemento " + (posicion + 1) + ").");
        } else {
            System.out.println("El numero " + buscar + " no se encuentra en el array.");
        }

        scanner.close();
    }
}

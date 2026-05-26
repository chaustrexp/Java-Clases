import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
      
        if (numero >= 1000 && numero <= 10000 && numero % 5 != 0) {
            System.out.println("El número es válido");
        } else {
            System.out.println("El número NO es válido");
        }
        
        scanner.close();
    }
}
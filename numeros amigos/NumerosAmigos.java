import java.util.Scanner;

public class NumerosAmigos {

    // Método para calcular la suma de los divisores propios de un número
    public static int sumarDivisores(int numero) {
        int suma = 0;

        // El bucle 'for' asegura que 'i' se incremente en cada iteración,
        // corrigiendo el error de bucle infinito del diagrama.
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i; // Acumular si es divisor
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Verificador de Números Amigos ---");
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // 1. Obtener la suma de los divisores del primer número
        int suma = sumarDivisores(numero1);

        // 2. Verificar la primera condición (suma != numero2)
        if (suma != numero2) {
            System.out.println("No son números amigos");
        } else {
            // 3. Reiniciar la suma en cero y evaluar el segundo número
            suma = sumarDivisores(numero2);

            // 4. Condición corregida: Si la suma de divisores de numero2 es igual a
            // numero1, SÍ son amigos
            if (suma == numero1) {
                System.out.println("Son números amigos");
            } else {
                System.out.println("No son números amigos");
            }
        }

        scanner.close();
    }
}
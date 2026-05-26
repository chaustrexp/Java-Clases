import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        // Calculamos el módulo (residuo) con 5
        int residuo = numero % 5;
        
        // Evaluamos el resultado del módulo
        switch (residuo) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
                break;
        }
        
        scanner.close();
    }
}
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = teclado.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        double perimetro = 2 * (base + altura);
        double superficie = base * altura;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Superficie: " + superficie);

        teclado.close();
    }
}

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la velocidad de km/h: ");
        double kmeh = teclado.nextDouble();

        double metrosPorSegundo = kmeh / 3.6;

        System.out.printf("\n%.2f Km/h equivalen a %.2f m/s.%n", kmeh, metrosPorSegundo);

        teclado.close();


    }
}
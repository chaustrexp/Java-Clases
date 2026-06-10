

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el diviendo (el numero a dividir): ");
        int diviendo = teclado.nextInt();

        System.out.print("Ingrese el divisor (el numero que divide): ");
        int divisor = teclado.nextInt();

        if (divisor == 0) {
            System.out.println("Error: No es posible dividir entre cero.");
        } else {
            if (diviendo % divisor == 0) {
                System.out.println("La division es exacta. El resto es 0.");
            } else {
                System.out.println("La division NO es exacta. El resto es: " + (diviendo % divisor));
            }
        }
        teclado.close();
    }
}
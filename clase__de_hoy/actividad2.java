package clase__de_hoy;

import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese unan frase: ");
        String frase = sc.nextLine();

        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("Frase invertida: " + fraseInvertida);

    }
}

// El truco es por el inicio con un "Hola", donde java agarra la longitud del
// texto
// con el (frase.leght()), donde lo posiciona del 0 al 3, y la variable
// fraseInvertida,
// es una canasta donde ingresa las letras al reves.

// El (for) donde se realiza el bucle, un recorrido donde empieza su posicion
// desde 3,
// ejemplo= "4 - 1 = 3", en poca palabras por la letra a.

package clase__de_hoy;

//Para este ejercicio se utiliza el la clase string con su scanner para que el nombre salga invertido.

//escribir un programa en java que pida una frase al usuario y escriba invertida la frase, es decir, que el programa escriba la frase al reves

import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split("\\s+");
        String fraseInvertida = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            fraseInvertida += palabras[i];
            if (i > 0) {
                fraseInvertida += " ";
            }
        }
        System.out.println("Frase invertida: " + fraseInvertida);
        sc.close();
    }
}

// El truco en este codigo es en el (split), ayuda a dividir la frase y su
// (.split(" "),
// ayuda a cortar la frase, busca los espacios blanco, realiz el tijeretea,
// donde lo guarda
// con el casillero de (un Array), automaticamente los ordena.

// Y el (for) empieza a ralizar la parte invertida, en lugar de empezar en 0 lo
// que hace,
// es empezar desde el final, donde la longitud del casillero , empieza por la
// posicion 2.

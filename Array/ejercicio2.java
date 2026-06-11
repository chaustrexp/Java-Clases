// En el ejercicio 2, se necesita dar un numero entero,
// donde se busque cuantas veces esta dicho numero en un array.
// Para este ejercicio se utiliza el int, for, if y else.

package Array;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50, 40, 60, 40 };
        int numeroABuscar = 40;
        int contador = 0;

        // Recorre el array.
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                contador++;
            }
        }

        // Donde se muestra el resultado.
        if (contador > 0) {
            System.out.println("El numero " + numeroABuscar + " se encuentra " + contador + " veces en el array.");
        } else {
            System.out.println("El numero " + numeroABuscar + " no se encuentra en el array.");
        }
    }
}
// En el ejercicio 3 se necesita buscar elementos comunes.
// Con dos arrays de enteros.
// Para este ejercicio se utiliza el int, for y if.

package Array;

public class ejercicio3 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };

        System.out.println("Elementos comunes entre los dos arrays:");
        boolean encontrado = false;

        // Bucle aninados para recorrer las arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No hay elementos comunes.");
        }
    }
}
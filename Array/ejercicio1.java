// En el ejercicio 1 se necesita crear una Array con numeros enteros,
// se determine el mayor y el menor del array entero.
// Y se necesita el int y el for.

package Array;

public class ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = { 15, 4, 24, 28, 8, 12, 2 };

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            // Los if son la base principal, ayuda actualizar el valor de mayor y menor.
            // El array recorre los elementos desde la posicion 1.
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        }
    }
}
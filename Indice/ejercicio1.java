// En este ejercicio el metodo .chartAt (index).
// Es una clase del String y ayuda a extraer un solo caracter.
// La posicion se cuenta desde el 0 en lugar de 1.

package Indice;

public class ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola Buenos dias Mundo"; // la linea 9 es la parte principal del codigo.
        char car_0 = cadena.charAt(0);
        char car_10 = cadena.charAt(10);

        System.out.println("Cadena Original = " + cadena);
        System.out.println("El caracter en la posicion de 0 es: " + car_0);
        System.out.println("El caracter en la posicion de 1 es: " + car_10);
    }
}

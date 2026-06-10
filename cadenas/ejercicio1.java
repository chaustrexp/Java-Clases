// El metodo de este ejercicio es .compareTo(String otraCadena).
// Ayuda a compara dos textos basandose en los valores de Unicode de sus caracteres.
// Es decir si lo devuelve en 0, son iguales, y si un numero lo devuelve menor a 0.
// Porque  es la primera del alfanumerico.

package cadenas;

public class ejercicio1 {
    public static void main(String[] args) {
        String cadena1 = "Este es el ejercicio 1";
        String cadena2 = "Este es el ejercicio 2";

        int resultado = cadena1.compareTo(cadena2);

        System.out.println("La cadena 1 es: " + cadena1);
        System.out.println("La cadena 2 es: " + cadena2);

        if (resultado < 0) {
            System.out.println("\"" + cadena1 + "\" es alfabeticamente menor que " + "\"" + cadena2 + "\"");
        } else if (resultado > 0) {
            System.out.println("\"" + cadena2 + "\" es alfabeticamente mayor que " + "\"" + cadena2 + "\"");
        } else {
            System.out.println("Ambas cadenas son iguales");
        }
    }
}

// cadena1.compareTo(cadena2); es la funcion principal, empieza a ejecutar ambas
// cadenas caracter por caracter.
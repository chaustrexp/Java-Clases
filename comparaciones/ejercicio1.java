// Se utiliza el mismo metodo pero de la siguiente manera.
// .compareToIgnoreCase(String otraCadena), lo que aplica es igualar,
// los caracteres antes de evaluar el orden lexicografico.

package comparaciones;

public class ejercicio1 {
    public static void main(String[] args) {

        // desde la linea 11 es el control principal donde se realiza la comparacion con
        // mayuscula y miniscula.
        String cadena1 = "BUENOS DIAS";
        String cadena2 = "buenos dias";
        int resultado = cadena1.compareToIgnoreCase(cadena2);

        System.out.println("La cadena 1 es: " + cadena1);
        System.out.println("La cadena 2 es: " + cadena2);

        if (resultado == 0) { // el metodo de la linea 16 se trata de compara todas las cadenas, si todas las
                              // coincide de resto de no.
            System.out.println("\"" + cadena1 + "\" es igual a  \"" + cadena2 + "\"");
        } else if (resultado < 0) {
            System.out.println("\"" + cadena1 + "\" es menor que  \"" + cadena2 + "\"");
        } else {
            System.out.println("\"" + cadena1 + "\" es mayor que  \"" + cadena2 + "\"");
        }
    }
}
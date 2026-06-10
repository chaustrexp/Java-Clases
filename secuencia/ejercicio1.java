// Si en un texto contiene subcadena o una secuenia exacta de los caracteres.
// El metodo que se usa para en este caso seria el .contains (CharSequence secuencia)
// Y para retonar un valor booleano es (true or false).

package secuencia;

public class ejercicio1 {
    public static void main(String[] args) {
        String cadenaOriginal = "El dia de hoy estamos repasando java"; // El motor principal
        String secuencia = "java";

        boolean contiene = cadenaOriginal.contains(secuencia);

        String resultadoTexto = contiene ? "Verdadero" : "Falso";

        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Secuencia especificada de valores caracteres: " + secuencia);
        System.out.println(resultadoTexto);

    }
}
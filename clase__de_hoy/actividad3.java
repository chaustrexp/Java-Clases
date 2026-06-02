package clase__de_hoy;

public class actividad3 {
    public static void main(String[] args) {

        String cancion = "Tu lo que quieres es que me coma el tigre\n" +
                "Que me coma el tigre, que me coma el tigre\n" +
                "Mi carne morena\n" +
                "Tu lo que quieres es que me coma el tigre\n" +
                "Que me coma el tigre, que me coma el tigre\n" +
                "Que baila tan buena\n" +
                "Tu lo que quieres es que me coma el tigre\n" +
                "Que me coma el tigre, que me coma el tigre\n" +
                "Mi carne morena\n" +
                "Tu lo que quieres es que me coma el tigre\n" +
                "Que me coma el tigre, que me coma el tigre\n" +
                "Mi carne sabrosa";

        String textoEnMayusculas = cancion.toUpperCase();
        int vecesTigre = textoEnMayusculas.split("TIGRE").length - 1;

        int vecesLetraT = 0;
        for (int i = 0; i < textoEnMayusculas.length(); i++) {
            if (textoEnMayusculas.charAt(i) == 'T') {
                vecesLetraT++;
            }
        }

        System.out.println("3.a) La palabra 'TIGRE' aparece: " + vecesTigre + " veces. ");
        System.out.println("3.b) El caracter 'T' aparece: " + vecesLetraT + " veces. ");
    }
}

// El truco en este codigo es por medio del (charAt),
// y el charAt(i), la i es el indice del inicio del String,
// El . toUpperCase() ayuda a pasar todo a mayuscula es, decir
// si esta todo en minuscula a la hora de imprimir lo devuelve todo a mayuscula.

// Y el famoso bucle (for), donde indica la casillas del 0 hasta 4 y hasta el
// final.
// Su condicion (if), cuenta la veces que se repite su respectivo caracter.

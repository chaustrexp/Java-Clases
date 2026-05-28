// Ejemeplo 2: Triangulo  de astericos el bucle consiste de que
//El bucle de afuera dice "Vamos por la fila 3"
//El bucle  de adentro va a mirar el número y se dibuja  minimo 3 asteriscos en la pantalla.
// Al terminar , el bucle de afuera  avanza a la siguiente fila (fila 4)

package Ciclos;

public class Ciclo2 {
    public static void main(String[] args) {
        int filas = 8;

        // ciclo externo: donde se controla cuantas lienas se van a pintar.
        for (int i = 1; i <= filas; i++) {

            // ciclo interno: la parte donde se pinta los asteriscos.
            // OJO= la condicion se ejecuta cuando la j sea igaual a la i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }

            // se salata a la linea terminar para dibujar los asteriscos de esa fila
            System.out.println();
        }
    }
}
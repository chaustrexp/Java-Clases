// Ejemplo 1: tablas de multiiplicar consiste
// En el bucle de afuera se queda congelado en el número 1 mientras
// El bucle de adentro corre 10 veces para hacer el 1*1, 1*2, 1*3 hasta llegar
// 1*10.
// Solo cuando el de adentro termina y el de afuera avanza el número 2
// Y el de adentro vuelve a empezar.

package Ciclos;

public class Ciclo1 {
    public static void main(String[] args) {

        // ciclo externo controla el número de tabla
        for (int i = 1; i <= 5; i++) {
            System.out.println("== TABLA DEL " + i + " ===");

            // ciclo interno multiplica el numero del 1 al 10
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x" + j + " = " + resultado);
            }

            System.out.println();
        }
    }
}
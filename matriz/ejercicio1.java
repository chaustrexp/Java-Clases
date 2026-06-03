// Objetivo es mutiplicar la matriz a por la matriz b,
// Y ese resultado se guarde temporal,
// por medio de la matriz temoral se multiplica por la matriz c, para obtener un resultado final.

package matriz;

public class ejercicio1 {
    public static void main(String[] args) {

        // definicion de las 3 matrices
        int[][] matrizA = {
                { 2, 0, 1 },
                { 3, 0, 0 },
                { 5, 1, 1 }
        };

        int[][] matrizB = {
                { 1, 0, 1 },
                { 1, 2, 1 },
                { 1, 1, 0 }
        };

        // definicion de la matriz 3 paea completar el ejercicio
        int[][] matrizC = {
                { 1, 2 },
                { 0, 1 },
                { 3, 1 }
        };

        System.out.println("--- Ejecutando la Multiplicacion de 3 matrices ---");

        // primer paso es muliplcar la A * B
        int[][] resultadoTemporal = multiplicarMatrices(matrizA, matrizB);

        if (resultadoTemporal != null) {

            // segundo paso = multiplicar el resultado anterior por la matriz c
            int[][] resultadoFinal = multiplicarMatrices(resultadoTemporal, matrizC);

            // mostrar el resultado final
            if (resultadoFinal != null) {
                System.out.println("\nResultado final de (A * B) * C: ");
                imprimirMatriz(resultadoFinal);
            }

        }
    }

    // metodo de multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
        int filasM1 = m1.length;
        int columnasM1 = m1[0].length;
        int filasM2 = m2.length;
        int columnasM2 = m2[0].length;

        // validar la regla oro: la comulna m1 debe ser igual a la filas de m2

        if (columnasM1 != filasM2) {
            System.out.println("Error: Las matrices no se pueden multiplicar. Dimensiones incompatibles. ");
            return null;
        }

        // matriz resultante donde tendra las filas de m1 y columnas de m2
        int[][] resultado = new int[filasM1][columnasM2];

        // los 3 bucles se añande a un algoritmo en un nucleo
        for (int i = 0; i < filasM1; i++) {
            for (int j = 0; j < columnasM2; j++) {
                for (int k = 0; k < columnasM1; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) { // metodo auxiliar para imprimir las matrices
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
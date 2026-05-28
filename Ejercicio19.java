
public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][10];
        int sumaTotal = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = (int) (Math.random() * 9) + 1;
            }
        }

        System.out.println("--- Matriz Generada (5x10) ---");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                sumaTotal += matriz[fila][col];
            }
        }

        System.out.println("\n------------------------------------------");
        System.out.println("La suma de los 50 elementos de la matriz es: " + sumaTotal);

    }

}
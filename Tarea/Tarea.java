package Tarea;

public class Tarea {
    public static void main(String[] args) {
        // declares and allocates memory for 10 integers
        int[] anArray = new int[10];

        // initialize elements using a loop
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (i + 1) * 100;
        }

        // print elements using a loop
        for (int i = 0; i < anArray.length; i++) {
            IO.println("Element at index " + i + ": " + anArray[i]);
        }
    }
}

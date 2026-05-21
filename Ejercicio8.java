import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
      
    Scanner teclado  =  new Scanner(System.in);

    System.out.print(" Introdzca un numero entero de 3 cifras: ");
    int numero = teclado.nextInt();

    int numeroAbs  = Math.abs(numero);
    if (numeroAbs < 100 ||  numeroAbs > 999) {

       System.out.println("Error el numero debe  tener 3 cifras.");

    } else {

        int centenas = numeroAbs / 100;
            int decenas = (numeroAbs % 100) / 10;
            int unidades = numeroAbs % 10;

            
            System.out.println("\n--- Cifras por separado ---");
            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas:  " + decenas);
            System.out.println("Unidades: " + unidades);
    }


       teclado.close();
    }


}
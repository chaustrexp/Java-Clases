import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingrese un numero para analizar: ");
        double  numero = teclado.nextDouble();


        String paridad;
        String signo;
        String tipo;


        if (numero % 1 == 0) {
            tipo = "entero";
        
            if ((int) numero % 2 == 0) {
                paridad = "par";
            } else {
                paridad = "impar";
            }
        } else {
            tipo = "decimal";
            paridad = "no aplica (es decimal)";
        }

    
        if (numero > 0) {
            signo = "positivo";
        } else if (numero < 0) {
            signo = "negativo";
        } else {
            signo = "neutro (cero)";
        }

        
        System.out.println("\nEl numero " + numero + " es:");
        System.out.println("- Tipo: " + tipo);
        System.out.println("- Signo: " + signo);
        System.out.println("- Paridad: " + paridad);

        
        teclado.close();
    }
}
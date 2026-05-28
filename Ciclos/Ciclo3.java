// Ejemplo 3: Menu interactivo:
// Bucle de afuera: (do-while) se mantiene la aplicacion abierta de forma permanente, solo si eliges la  opcion de validar el token.
// Bucle de adentro:  se activara el (while) el cual no se va a dejar salir de ahi hasta que no se adivine la clave y maximo se tiene 
// 3 intentos despues de los 3 intentos se agotaran.

package Ciclos;

import java.util.Scanner;

public class Ciclo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionPrincipal;

        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN ---");
            System.out.println("1. Validar Token de Seguridad");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = teclado.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    int intentos = 1;
                    while (intentos <= 3) {
                        System.out.print("[Intento " + intentos + "/3] Ingrese el codigo de 4 digitor: ");
                        int codigo = teclado.nextInt();

                        if (codigo == 9988) {
                            System.out.println("¡Codigo correcto! Acceso concedido. ");
                            break;
                        } else {
                            System.out.println("Codigo incorrecto.");
                            intentos++;
                        }
                    }
                    if (intentos > 3) {
                        System.out.println("Se agotaron los intentos para esta sesión.");
                    }
                    break;
                case 2:
                    System.out.println("Cerrando el sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        }
        while (opcionPrincipal != 2)
            ;

        teclado.close();
    }
}
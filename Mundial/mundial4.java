package Mundial;

import java.util.Scanner;

public class mundial4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 48 equipos en un vector (12 grupos de 4)
        String[] equipos = {
                "México", "Canadá", "USA", "Nueva Zelanda",
                "Argentina", "Colombia", "Perú", "Chile",
                "Brasil", "Uruguay", "Ecuador", "Venezuela",
                "España", "Alemania", "Francia", "Inglaterra",
                "Portugal", "Italia", "Países Bajos", "Croacia",
                "Bélgica", "Dinamarca", "Suiza", "Gales",
                "Marruecos", "Senegal", "Egipto", "Argelia",
                "Nigeria", "Camerún", "Ghana", "C. de Marfil",
                "Japón", "Corea del Sur", "Irán", "Arabia Saudita",
                "Australia", "Qatar", "Emiratos", "Irak",
                "Costa Rica", "Panamá", "Honduras", "Jamaica",
                "El Salvador", "Guatemala", "Trinidad y T.", "Haití"
        };

        System.out.println("==================================================");
        System.out.println("         SISTEMA DE APUESTAS - MUNDIAL 2026       ");
        System.out.println("==================================================\n");

        // 1. Preguntar cuántas personas van a apostar
        System.out.print("¿Cuántas personas van a apostar en la polla?: ");
        int cantidadApostadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Arreglos para los apostadores y sus puntajes finales
        String[] nombresApostadores = new String[cantidadApostadores];
        int[] puntosApostadores = new int[cantidadApostadores];

        // Guardar los nombres
        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.print("Ingrese el nombre del apostador " + (i + 1) + ": ");
            nombresApostadores[i] = scanner.nextLine();
        }

        System.out.print("\n¿Para qué grupo desean apostar? (1 al 12): ");
        int grupoSeleccionado = scanner.nextInt();

        if (grupoSeleccionado >= 1 && grupoSeleccionado <= 12) {
            int inicio = (grupoSeleccionado - 1) * 4;
            char letraGrupo = (char) ('A' + (grupoSeleccionado - 1));

            // Los 6 enfrentamientos del grupo
            int[][] enfrentamientos = {
                    { 0, 1 }, { 2, 3 }, // Jornada 1
                    { 0, 2 }, { 1, 3 }, // Jornada 2
                    { 0, 3 }, { 1, 2 } // Jornada 3
            };

            // Matrices para guardar las predicciones de cada jugador para los 6 partidos
            int[][] predGoles1 = new int[cantidadApostadores][6];
            int[][] predGoles2 = new int[cantidadApostadores][6];

            // 2. Ciclo para capturar las PREDICCIONES de cada persona
            System.out.println("\n--- REGISTRO DE PREDICCIONES (GRUPO " + letraGrupo + ") ---");
            for (int p = 0; p < cantidadApostadores; p++) {
                System.out.println("\n>> Turno de: " + nombresApostadores[p].toUpperCase());

                for (int i = 0; i < enfrentamientos.length; i++) {
                    int eq1 = inicio + enfrentamientos[i][0];
                    int eq2 = inicio + enfrentamientos[i][1];

                    System.out.println("Partido " + (i + 1) + ": " + equipos[eq1] + " vs " + equipos[eq2]);
                    System.out.print("   Predicción goles " + equipos[eq1] + ": ");
                    predGoles1[p][i] = scanner.nextInt();
                    System.out.print("   Predicción goles " + equipos[eq2] + ": ");
                    predGoles2[p][i] = scanner.nextInt();
                }
            }

            // 3. Capturar los RESULTADOS REALES del grupo
            System.out.println("\n==================================================");
            System.out.println("--- INGRESO DE RESULTADOS REALES OFICIALES ---");
            System.out.println("==================================================");

            int[] realesGoles1 = new int[6];
            int[] realesGoles2 = new int[6];

            for (int i = 0; i < enfrentamientos.length; i++) {
                int eq1 = inicio + enfrentamientos[i][0];
                int eq2 = inicio + enfrentamientos[i][1];

                System.out.println("\nPartido " + (i + 1) + ": " + equipos[eq1] + " vs " + equipos[eq2]);
                System.out.print("Goles REALES de " + equipos[eq1] + ": ");
                realesGoles1[i] = scanner.nextInt();
                System.out.print("Goles REALES de " + equipos[eq2] + ": ");
                realesGoles2[i] = scanner.nextInt();
            }

            // 4. Ciclo para evaluar los aciertos y calcular los puntos ganados
            for (int p = 0; p < cantidadApostadores; p++) {
                for (int i = 0; i < 6; i++) {
                    int pG1 = predGoles1[p][i]; // Predicción de goles 1
                    int pG2 = predGoles2[p][i]; // Predicción de goles 2
                    int rG1 = realesGoles1[i]; // Goles reales 1
                    int rG2 = realesGoles2[i]; // Goles reales 2

                    // CASO 1: Acertó el marcador exacto -> 5 puntos
                    if (pG1 == rG1 && pG2 == rG2) {
                        puntosApostadores[p] += 5;
                    }
                    // CASO 2: Acertó quién ganó o si fue empate -> 3 puntos
                    else {
                        boolean predijoGanaEq1 = pG1 > pG2;
                        boolean realGanoEq1 = rG1 > rG2;

                        boolean predijoGanaEq2 = pG2 > pG1;
                        boolean realGanoEq2 = rG2 > rG1;

                        boolean predijoEmpate = pG1 == pG2;
                        boolean realEmpate = rG1 == rG2;

                        if ((predijoGanaEq1 && realGanoEq1) ||
                                (predijoGanaEq2 && realGanoEq2) ||
                                (predijoEmpate && realEmpate)) {
                            puntosApostadores[p] += 3;
                        }
                    }
                }
            }

            // 5. Mostrar los resultados finales de la apuesta
            System.out.println("\n==================================================");
            System.out.println("        TABLA DE POSICIONES DE LA POLLA           ");
            System.out.println("==================================================");
            System.out.printf("%-20s %s\n", "Apostador", "Puntos Totales");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < cantidadApostadores; i++) {
                System.out.printf("%-20s %d pts\n", nombresApostadores[i], puntosApostadores[i]);
            }
            System.out.println("==================================================");

        } else {
            System.out.println("Grupo no válido.");
        }

        System.out.println("\n¡Gracias por jugar!");
        scanner.close();
    }
}
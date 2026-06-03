package Mundial;

import java.util.Scanner;

public class mundial2 {
    // Scanner y variables globales para que mantengan los datos vivos durante toda
    // la simulación
    static Scanner scanner = new Scanner(System.in);

    static String[] equipos = {
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

    // Datos de la Polla / Apuesta
    static int cantidadApostadores = 0;
    static String[] nombresApostadores;
    static int[] puntosApostadores;

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       SISTEMA DE APUESTAS - MUNDIAL 2026         ");
        System.out.println("==================================================\n");

        // [BOTÓN INGRESO] -> Configuración inicial obligatoria
        System.out.println("[SIMULANDO CLIC EN: INGRESO]");
        System.out.print("¿Cuántas personas van a apostar en total?: ");
        cantidadApostadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        nombresApostadores = new String[cantidadApostadores];
        puntosApostadores = new int[cantidadApostadores];

        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.print("Ingrese el nombre del apostador #" + (i + 1) + ": ");
            nombresApostadores[i] = scanner.nextLine();
        }

        // MENÚ INTERACTIVO BASADO EN TU IMAGEN
        String opcion = "";
        do {
            System.out.println("\n==================================================");
            System.out.println("          MENÚ PRINCIPAL (VISTA INTERFAZ)         ");
            System.out.println("==================================================");
            System.out.println("  [A] al [L] -> Seleccionar un Grupo");
            System.out.println("  [1]        -> Dieciseisavos de final");
            System.out.println("  [2]        -> Octavos de final");
            System.out.println("  [3]        -> Cuartos de final");
            System.out.println("  [4]        -> Semifinales");
            System.out.println("  [5]        -> FINAL del torneo");
            System.out.println("  [EXTRA]    -> Ver Tabla de Posiciones de la Polla");
            System.out.println("  [0]        -> Salir del Programa");
            System.out.println("==================================================");
            System.out.print("Presione un botón de la interfaz: ");
            opcion = scanner.next().toUpperCase();

            switch (opcion) {
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "H":
                case "I":
                case "J":
                case "K":
                case "L":
                    // Convertimos la letra (A-L) a un número indexado (1-12)
                    int numGrupo = opcion.charAt(0) - 'A' + 1;
                    jugarGrupo(numGrupo, opcion.charAt(0));
                    break;
                case "1":
                    fasesEliminatorias("DIECISEISAVOS DE FINAL");
                    break;
                case "2":
                    fasesEliminatorias("OCTAVOS DE FINAL");
                    break;
                case "3":
                    fasesEliminatorias("CUARTOS DE FINAL");
                    break;
                case "4":
                    fasesEliminatorias("SEMIFINALES");
                    break;
                case "5":
                    fasesEliminatorias("FINAL DEL TORNEO");
                    break;
                case "EXTRA":
                    mostrarResultadosPolla();
                    break;
                case "0":
                    System.out.println("\nSaliendo del sistema de apuestas...");
                    break;
                default:
                    System.out.println("\nBotón no reconocido. Intente de nuevo.");
            }

        } while (!opcion.equals("0"));

        System.out.println("¡Gracias por usar el software del Mundial!");
        scanner.close();
    }

    // --- LÓGICA DE APUESTAS POR GRUPO ---
    public static void jugarGrupo(int grupoSeleccionado, char letraGrupo) {
        int inicio = (grupoSeleccionado - 1) * 4;
        System.out.println("\n--------------------------------------------------");
        System.out.println("      INGRESANDO DATOS PARA EL GRUPO " + letraGrupo);
        System.out.println("--------------------------------------------------");

        // Estructura fija de los 6 partidos del grupo de 4 equipos
        int[][] enfrentamientos = { { 0, 1 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 0, 3 }, { 1, 2 } };

        // Arrays bidimensionales para guardar el tamaño del marcador (predicciones)
        int[][] predGoles1 = new int[cantidadApostadores][6];
        int[][] predGoles2 = new int[cantidadApostadores][6];

        // 1. Ciclo para recolectar las PREDICCIONES de cada apostador
        for (int p = 0; p < cantidadApostadores; p++) {
            System.out.println("\n>> Predicciones de: " + nombresApostadores[p].toUpperCase());

            for (int i = 0; i < enfrentamientos.length; i++) {
                int eq1 = inicio + enfrentamientos[i][0];
                int eq2 = inicio + enfrentamientos[i][1];

                System.out.println("Partido " + (i + 1) + ": " + equipos[eq1] + " vs " + equipos[eq2]);
                System.out.print("   Goles " + equipos[eq1] + ": ");
                predGoles1[p][i] = scanner.nextInt();
                System.out.print("   Goles " + equipos[eq2] + ": ");
                predGoles2[p][i] = scanner.nextInt();
            }
        }

        // 2. Ciclo para registrar los RESULTADOS REALES del grupo
        System.out.println("\n--------------------------------------------------");
        System.out.println("   INGRESO DE MARCADORES REALES OFICIALES (GRUPO " + letraGrupo + ")");
        System.out.println("--------------------------------------------------");
        int[] realesGoles1 = new int[6];
        int[] realesGoles2 = new int[6];

        for (int i = 0; i < enfrentamientos.length; i++) {
            int eq1 = inicio + enfrentamientos[i][0];
            int eq2 = inicio + enfrentamientos[i][1];

            System.out.println("Resultado REAL Partido " + (i + 1) + ": " + equipos[eq1] + " vs " + equipos[eq2]);
            System.out.print("   Goles de " + equipos[eq1] + ": ");
            realesGoles1[i] = scanner.nextInt();
            System.out.print("   Goles de " + equipos[eq2] + ": ");
            realesGoles2[i] = scanner.nextInt();
        }

        // 3. Ciclo de evaluación y asignación de puntos
        for (int p = 0; p < cantidadApostadores; p++) {
            for (int i = 0; i < 6; i++) {
                int pg1 = predGoles1[p][i];
                int pg2 = predGoles2[p][i];
                int rg1 = realesGoles1[i];
                int rg2 = realesGoles2[i];

                // Regla 1: Marcador exacto -> Gana 5 puntos
                if (pg1 == rg1 && pg2 == rg2) {
                    puntosApostadores[p] += 5;
                    System.out.println("¡" + nombresApostadores[p] + " acertó el marcador exacto del Partido " + (i + 1)
                            + "! (+5 pts)");
                }
                // Regla 2: Acertó ganador o empate -> Gana 3 puntos
                else {
                    boolean predijoGanaL = pg1 > pg2;
                    boolean realGanoL = rg1 > rg2;

                    boolean predijoGanaV = pg2 > pg1;
                    boolean realGanoV = rg2 > rg1;

                    boolean predijoEmpate = pg1 == pg2;
                    boolean realEmpate = rg1 == rg2;

                    if ((predijoGanaL && realGanoL) || (predijoGanaV && realGanoV) || (predijoEmpate && realEmpate)) {
                        puntosApostadores[p] += 3;
                        System.out.println("¡" + nombresApostadores[p]
                                + " acertó el resultado (ganador/empate) del Partido " + (i + 1) + "! (+3 pts)");
                    }
                }
            }
        }
        System.out.println("\n¡Puntajes del Grupo " + letraGrupo + " calculados con éxito!");
    }

    // --- SIMULACIÓN DE BOTONES DE FASES DE ELIMINACIÓN DIRECTA ---
    public static void fasesEliminatorias(String nombreFase) {
        System.out.println("\n==================================================");
        System.out.println("        ENTRANDO A LA FASE: " + nombreFase);
        System.out.println("==================================================");
        System.out.println("Nota: Esta sección está lista para que registres los");
        System.out.println("cruces eliminatorios directos de forma similar a los grupos.");
        System.out.println("==================================================");
    }

    // --- SIMULACIÓN DEL BOTÓN 'EXTRA' (TABLA DE POSICIONES DE LA POLLA) ---
    public static void mostrarResultadosPolla() {
        System.out.println("\n==================================================");
        System.out.println("       TABLA DE POSICIONES GENERAL DE LA POLLA     ");
        System.out.println("==================================================");
        System.out.printf("%-20s %s\n", "Apostador", "Puntos acumulados");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.printf("%-20s %d pts\n", nombresApostadores[i], puntosApostadores[i]);
        }
        System.out.println("==================================================");
    }
}
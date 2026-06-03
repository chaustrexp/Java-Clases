package Mundial;

import java.util.Scanner;

public class mundial5 {
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

    // Datos de la Polla controlados por el Administrador
    static int cantidadApostadores = 0;
    static String[] nombresApostadores;
    static int[] puntosApostadores;

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   PANEL DE CONTROL DEL ADMINISTRADOR - POLA 2026 ");
        System.out.println("==================================================\n");

        // El administrador inicia el torneo y registra a los participantes
        System.out.println("[CONFIGURACIÓN INICIAL DEL ADMINISTRADOR]");
        System.out.print("Señor Administrador, ¿cuántas personas van a participar?: ");
        cantidadApostadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer del teclado

        nombresApostadores = new String[cantidadApostadores];
        puntosApostadores = new int[cantidadApostadores];

        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.print("Registre el nombre del apostador #" + (i + 1) + ": ");
            nombresApostadores[i] = scanner.nextLine();
        }

        System.out.println("\n--> ¡Participantes registrados con éxito! Redirigiendo al menú de control...");

        String botonPresionado = "";
        do {
            System.out.println("\n==================================================");
            System.out.println("          VISTA DE BOTONERA INTERACTIVA           ");
            System.out.println("==================================================");
            System.out.println("  [A] al [L] -> Gestionar Grupo Específico");
            System.out.println("  [1]        -> Panel: Dieciseisavos de final");
            System.out.println("  [2]        -> Panel: Octavos de final");
            System.out.println("  [3]        -> Panel: Cuartos de final");
            System.out.println("  [4]        -> Panel: Semifinales");
            System.out.println("  [5]        -> Panel: FINAL del torneo");
            System.out.println("  [EXTRA]    -> Mostrar Tabla General de Posiciones");
            System.out.println("  [0]        -> Cerrar Sistema de Registro");
            System.out.println("==================================================");
            System.out.print("Administrador, elija qué botón de la interfaz operar: ");
            botonPresionado = scanner.next().toUpperCase();

            switch (botonPresionado) {
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
                    int numGrupo = botonPresionado.charAt(0) - 'A' + 1;
                    registrarDatosGrupo(numGrupo, botonPresionado.charAt(0));
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
                    publicarResultadosPolla();
                    break;
                case "0":
                    System.out.println("\nCerrando sesión del administrador de forma segura...");
                    break;
                default:
                    System.out.println("\nAcción no válida. Por favor, presione un botón correcto.");
            }

        } while (!botonPresionado.equals("0"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    // --- PROCESO COMPLETO DE REGISTRO EN MANOS DEL ADMINISTRADOR ---
    public static void registrarDatosGrupo(int grupoSeleccionado, char letraGrupo) {
        int inicio = (grupoSeleccionado - 1) * 4;
        System.out.println("\n--------------------------------------------------");
        System.out.println(" MODULO DE REGISTRO: GRUPO " + letraGrupo);
        System.out.println("--------------------------------------------------");

        int[][] enfrentamientos = { { 0, 1 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 0, 3 }, { 1, 2 } };

        int[][] predGoles1 = new int[cantidadApostadores][6];
        int[][] predGoles2 = new int[cantidadApostadores][6];

        // PASO 1: El administrador digita lo que cada jugador predijo
        System.out.println("\n--- PASO 1: REGISTRAR PREDICCIONES DE LOS JUGADORES ---");
        for (int p = 0; p < cantidadApostadores; p++) {
            System.out.println("\nDigitando plantilla de: " + nombresApostadores[p].toUpperCase());

            for (int i = 0; i < enfrentamientos.length; i++) {
                int eq1 = inicio + enfrentamientos[i][0];
                int eq2 = inicio + enfrentamientos[i][1];

                System.out.println("Partido " + (i + 1) + ": " + equipos[eq1] + " vs " + equipos[eq2]);
                System.out.print("   Goles pronosticados para " + equipos[eq1] + ": ");
                predGoles1[p][i] = scanner.nextInt();
                System.out.print("   Goles pronosticados para " + equipos[eq2] + ": ");
                predGoles2[p][i] = scanner.nextInt();
            }
        }

        // PASO 2: El administrador digita los resultados oficiales tras jugarse los
        // partidos reales
        System.out.println("\n--- PASO 2: REGISTRAR RESULTADOS OFICIALES DE LA FIFA ---");
        int[] realesGoles1 = new int[6];
        int[] realesGoles2 = new int[6];

        for (int i = 0; i < enfrentamientos.length; i++) {
            int eq1 = inicio + enfrentamientos[i][0];
            int eq2 = inicio + enfrentamientos[i][1];

            System.out.println("Marcador REAL del Partido " + (i + 1) + ": " + equipos[eq1] + " vs " + equipos[eq2]);
            System.out.print("   Goles reales anotados por " + equipos[eq1] + ": ");
            realesGoles1[i] = scanner.nextInt();
            System.out.print("   Goles reales anotados por " + equipos[eq2] + ": ");
            realesGoles2[i] = scanner.nextInt();
        }

        // PASO 3: El sistema calcula todo internamente bajo el comando del
        // administrador
        System.out.println("\n--- PASO 3: AUDITORÍA Y ACTUALIZACIÓN DE PUNTOS ---");
        for (int p = 0; p < cantidadApostadores; p++) {
            int puntosGanadosEnEsteGrupo = 0;
            for (int i = 0; i < 6; i++) {
                int pg1 = predGoles1[p][i];
                int pg2 = predGoles2[p][i];
                int rg1 = realesGoles1[i];
                int rg2 = realesGoles2[i];

                // Acierto Exacto -> 5 puntos
                if (pg1 == rg1 && pg2 == rg2) {
                    puntosApostadores[p] += 5;
                    puntosGanadosEnEsteGrupo += 5;
                }
                // Acierto de Tendencia (Ganador/Empate) -> 3 puntos
                else {
                    boolean predijoGanaL = pg1 > pg2;
                    boolean realGanoL = rg1 > rg2;

                    boolean predijoGanaV = pg2 > pg1;
                    boolean realGanoV = rg2 > rg1;

                    boolean predijoEmpate = pg1 == pg2;
                    boolean realEmpate = rg1 == rg2;

                    if ((predijoGanaL && realGanoL) || (predijoGanaV && realGanoV) || (predijoEmpate && realEmpate)) {
                        puntosApostadores[p] += 3;
                        puntosGanadosEnEsteGrupo += 3;
                    }
                }
            }
            System.out.println(
                    "> " + nombresApostadores[p] + " sumó +" + puntosGanadosEnEsteGrupo + " pts en esta sección.");
        }
        System.out.println("\n[SISTEMA]: Datos guardados correctamente. Volviendo al panel principal.");
    }

    public static void fasesEliminatorias(String nombreFase) {
        System.out.println("\n==================================================");
        System.out.println("   REGISTRO EN PANEL FASE: " + nombreFase);
        System.out.println("==================================================");
        System.out.println("Señor Administrador, esta sección está lista para");
        System.out.println("recibir los marcadores de eliminación directa.");
        System.out.println("==================================================");
    }

    public static void publicarResultadosPolla() {
        System.out.println("\n==================================================");
        System.out.println("       TABLA DE POSICIONES OFICIAL DE LA POLLA     ");
        System.out.println("==================================================");
        System.out.printf("%-20s %s\n", "Participante", "Puntaje Total");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.printf("%-20s %d PTS\n", nombresApostadores[i].toUpperCase(), puntosApostadores[i]);
        }
        System.out.println("==================================================");
    }
}
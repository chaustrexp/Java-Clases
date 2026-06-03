
package Mundial;

import java.util.Scanner;

public class mundial3 {
    // Escáner global para no tener que abrirlo y cerrarlo en cada método
    static Scanner scanner = new Scanner(System.in);

    // Datos globales del mundial (Vectores paralelos)
    static String[] equipos = {
            "México", "Canadá", "USA", "Nueva Zelanda", "Argentina", "Colombia", "Perú", "Chile",
            "Brasil", "Uruguay", "Ecuador", "Venezuela", "España", "Alemania", "Francia", "Inglaterra",
            "Portugal", "Italia", "Países Bajos", "Croacia", "Bélgica", "Dinamarca", "Suiza", "Gales",
            "Marruecos", "Senegal", "Egipto", "Argelia", "Nigeria", "Camerún", "Ghana", "C. de Marfil",
            "Japón", "Corea del Sur", "Irán", "Arabia Saudita", "Australia", "Qatar", "Emiratos", "Irak",
            "Costa Rica", "Panamá", "Honduras", "Jamaica", "El Salvador", "Guatemala", "Trinidad y T.", "Haití"
    };

    // Variables de control de apuestas
    static int cantidadApostadores = 0;
    static String[] nombresApostadores;
    static int[] puntosApostadores;

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       BACKEND DEL SISTEMA DE APUESTAS            ");
        System.out.println("==================================================\n");

        // Configuración inicial (Equivalente al botón "Ingreso" o configuración
        // inicial)
        inicializarApostadores();

        int opcion;
        do {
            // Este menú simula los clics de tu interfaz gráfica
            System.out.println("\n--- SIMULADOR DE CLICS DE INTERFAZ ---");
            System.out.println("1. Simular clic en Fase de Grupos (A-L)");
            System.out.println("2. Simular clic en Diecisieteavos de final");
            System.out.println("3. Simular clic en Octavos de final");
            System.out.println("4. Simular clic en Cuartos de final");
            System.out.println("5. Simular clic en Semifinales");
            System.out.println("6. Simular clic en FINAL del torneo");
            System.out.println("7. Ver Tabla General de la Polla");
            System.out.println("0. Salir");
            System.out.print("Seleccione qué botón de la imagen presionó el usuario: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Qué letra de grupo presionó? (1=A, 2=B, ..., 12=L): ");
                    int numGrupo = scanner.nextInt();
                    gestionarFaseGrupos(numGrupo);
                    break;
                case 2:
                    fasesEliminatorias("DIECISEISAVOS DE FINAL");
                    break;
                case 3:
                    fasesEliminatorias("OCTAVOS DE FINAL");
                    break;
                case 4:
                    fasesEliminatorias("CUARTOS DE FINAL");
                    break;
                case 5:
                    fasesEliminatorias("SEMIFINALES");
                    break;
                case 6:
                    fasesEliminatorias("FINAL DEL TORNEO");
                    break;
                case 7:
                    mostrarTablaPolla();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // --- MÉTODOS MODULARES (Uno para cada sección de tu imagen) ---

    public static void inicializarApostadores() {
        System.out.print("¿Cuántas personas van a apostar?: ");
        cantidadApostadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        nombresApostadores = new String[cantidadApostadores];
        puntosApostadores = new int[cantidadApostadores];

        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.print("Nombre del apostador " + (i + 1) + ": ");
            nombresApostadores[i] = scanner.nextLine();
        }
    }

    // Se ejecuta al tocar los botones A, B, C, D, E, F, G, H, I, J, K, L
    public static void gestionarFaseGrupos(int grupoSeleccionado) {
        if (grupoSeleccionado < 1 || grupoSeleccionado > 12) {
            System.out.println("Grupo inválido.");
            return;
        }

        int inicio = (grupoSeleccionado - 1) * 4;
        char letraGrupo = (char) ('A' + (grupoSeleccionado - 1));
        System.out.println("\n[MÓDULO] Abriendo Panel del GRUPO " + letraGrupo);

        int[][] enfrentamientos = { { 0, 1 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 0, 3 }, { 1, 2 } };

        // Matrices locales para procesar este grupo
        int[][] predGoles1 = new int[cantidadApostadores][6];
        int[][] predGoles2 = new int[cantidadApostadores][6];
        int[] realesGoles1 = new int[6];
        int[] realesGoles2 = new int[6];

        // 1. Capturar Predicciones
        for (int p = 0; p < cantidadApostadores; p++) {
            System.out.println("\n>> Predicciones de: " + nombresApostadores[p]);
            for (int i = 0; i < enfrentamientos.length; i++) {
                int eq1 = inicio + enfrentamientos[i][0];
                int eq2 = inicio + enfrentamientos[i][1];
                System.out.print("   " + equipos[eq1] + " vs " + equipos[eq2] + " (Goles L): ");
                predGoles1[p][i] = scanner.nextInt();
                System.out.print("   " + equipos[eq1] + " vs " + equipos[eq2] + " (Goles V): ");
                predGoles2[p][i] = scanner.nextInt();
            }
        }

        // 2. Capturar Resultados Reales
        System.out.println("\n--- INGRESAR RESULTADOS REALES DEL GRUPO " + letraGrupo + " ---");
        for (int i = 0; i < enfrentamientos.length; i++) {
            int eq1 = inicio + enfrentamientos[i][0];
            int eq2 = inicio + enfrentamientos[i][1];
            System.out.print("Resultado REAL " + equipos[eq1] + ": ");
            realesGoles1[i] = scanner.nextInt();
            System.out.print("Resultado REAL " + equipos[eq2] + ": ");
            realesGoles2[i] = scanner.nextInt();
        }

        // 3. Procesar Puntos (Regla: 5 exacto, 3 tendencia)
        for (int p = 0; p < cantidadApostadores; p++) {
            for (int i = 0; i < 6; i++) {
                if (predGoles1[p][i] == realesGoles1[i] && predGoles2[p][i] == realesGoles2[i]) {
                    puntosApostadores[p] += 5;
                } else {
                    if ((predGoles1[p][i] > predGoles2[p][i] && realesGoles1[i] > realesGoles2[i]) ||
                            (predGoles2[p][i] > predGoles1[p][i] && realesGoles2[i] > realesGoles1[i]) ||
                            (predGoles1[p][i] == predGoles2[p][i] && realesGoles1[i] == realesGoles2[i])) {
                        puntosApostadores[p] += 3;
                    }
                }
            }
        }
        System.out.println("\n¡Puntajes actualizados para el Grupo " + letraGrupo + "!");
    }

    // Se ejecuta al tocar los botones de fases finales (Diecisieteavos, Octavos,
    // etc.)
    public static void fasesEliminatorias(String nombreFase) {
        System.out.println("\n==================================================");
        System.out.println("[MÓDULO INTERFAZ] " + nombreFase);
        System.out.println("==================================================");
        System.out.println("Aquí puedes programar los cruces directos de esta fase.");
        System.out.println("La lógica de apuestas de 5 y 3 puntos se aplicará igual por cada partido.");
    }

    public static void mostrarTablaPolla() {
        System.out.println("\n==================================================");
        System.out.println("        ESTADO ACTUAL DE LA POLLA MUNDIAL         ");
        System.out.println("==================================================");
        for (int i = 0; i < cantidadApostadores; i++) {
            System.out.printf("- %-20s : %d pts\n", nombresApostadores[i], puntosApostadores[i]);
        }
    }
}
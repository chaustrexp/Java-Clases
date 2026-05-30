package Mundial;

import java.util.Scanner;

public class mundial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 48 equipos almacenados en un vector (12 grupos de 4)
        // Nota: Como los clasificados al mundial 2026 aún no están todos definidos, 
        // usamos una lista representativa de 48 equipos como ejemplo.
        String[] equipos = {
            // Grupo A 
            "México", "Canadá", "USA", "Nueva Zelanda",
            // Grupo B 
            "Argentina", "Colombia", "Perú", "Chile",
            // Grupo C 
            "Brasil", "Uruguay", "Ecuador", "Venezuela",
            // Grupo D 
            "España", "Alemania", "Francia", "Inglaterra",
            // Grupo E 
            "Portugal", "Italia", "Países Bajos", "Croacia",
            // Grupo F 
            "Bélgica", "Dinamarca", "Suiza", "Gales",
            // Grupo G 
            "Marruecos", "Senegal", "Egipto", "Argelia",
            // Grupo H 
            "Nigeria", "Camerún", "Ghana", "C. de Marfil",
            // Grupo I 
            "Japón", "Corea del Sur", "Irán", "Arabia Saudita",
            // Grupo J 
            "Australia", "Qatar", "Emiratos", "Irak",
            // Grupo K 
            "Costa Rica", "Panamá", "Honduras", "Jamaica",
            // Grupo L 
            "El Salvador", "Guatemala", "Trinidad y T.", "Haití"
        };
        
        // Vector paralelo para federaciones (América dividida en 2: CONMEBOL y CONCACAF)
        String[] federaciones = {
            "CONCACAF", "CONCACAF", "CONCACAF", "OFC",
            "CONMEBOL", "CONMEBOL", "CONMEBOL", "CONMEBOL",
            "CONMEBOL", "CONMEBOL", "CONMEBOL", "CONMEBOL",
            "UEFA", "UEFA", "UEFA", "UEFA",
            "UEFA", "UEFA", "UEFA", "UEFA",
            "UEFA", "UEFA", "UEFA", "UEFA",
            "CAF", "CAF", "CAF", "CAF",
            "CAF", "CAF", "CAF", "CAF",
            "AFC", "AFC", "AFC", "AFC",
            "AFC", "AFC", "AFC", "AFC",
            "CONCACAF", "CONCACAF", "CONCACAF", "CONCACAF",
            "CONCACAF", "CONCACAF", "CONCACAF", "CONCACAF"
        };
        
        // Vectores paralelos para estadísticas
        int[] puntos = new int[48];
        int[] pj = new int[48]; // Partidos Jugados
        int[] pg = new int[48]; // Partidos Ganados
        int[] pe = new int[48]; // Partidos Empatados
        int[] pp = new int[48]; // Partidos Perdidos
        int[] gf = new int[48]; // Goles a Favor
        int[] gc = new int[48]; // Goles en Contra
        
        // Vectores para guardar fechas y resultados de los partidos del grupo
        String[] fechasPartidos = new String[6];
        int[] resultadosEq1 = new int[6];
        int[] resultadosEq2 = new int[6];
        
        System.out.println("==================================================");
        System.out.println("             MINI PROYECTO MUNDIAL 2026           ");
        System.out.println(" Sedes: México, Estados Unidos, Canadá (América)  ");
        System.out.println("         48 Equipos | 12 Grupos de 4              ");
        System.out.println("==================================================\n");
        
        System.out.print("¿Desea ingresar resultados para algún grupo en específico? (1 al 12) o 0 para salir: ");
        int grupoSeleccionado = scanner.nextInt();
        
        while (grupoSeleccionado >= 1 && grupoSeleccionado <= 12) {
            int inicio = (grupoSeleccionado - 1) * 4;
            char letraGrupo = (char) ('A' + (grupoSeleccionado - 1));
            
            System.out.println("\n--- INGRESANDO RESULTADOS DEL GRUPO " + letraGrupo + " ---");
            
            // Cada grupo de 4 tiene 6 partidos en total: (0vs1, 2vs3), (0vs2, 1vs3), (0vs3, 1vs2)
            int[][] enfrentamientos = {
                {0, 1}, {2, 3}, // Jornada 1
                {0, 2}, {1, 3}, // Jornada 2
                {0, 3}, {1, 2}  // Jornada 3
            };
            
            for (int i = 0; i < enfrentamientos.length; i++) {
                int eq1 = inicio + enfrentamientos[i][0];
                int eq2 = inicio + enfrentamientos[i][1];
                
                System.out.println("\nPartido " + (i+1) + ": " + equipos[eq1] + " (" + federaciones[eq1] + ") vs " + equipos[eq2] + " (" + federaciones[eq2] + ")");
                
                System.out.print("Ingrese la fecha del partido (ej. 15/06/2026): ");
                fechasPartidos[i] = scanner.next();
                
                System.out.print("Goles marcados por " + equipos[eq1] + ": ");
                resultadosEq1[i] = scanner.nextInt();
                
                System.out.print("Goles marcados por " + equipos[eq2] + ": ");
                resultadosEq2[i] = scanner.nextInt();
                
                int goles1 = resultadosEq1[i];
                int goles2 = resultadosEq2[i];
                
                // Actualizando vectores de estadísticas
                pj[eq1]++; pj[eq2]++;
                gf[eq1] += goles1; gc[eq1] += goles2;
                gf[eq2] += goles2; gc[eq2] += goles1;
                
                if (goles1 > goles2) { // Gana equipo 1
                    pg[eq1]++; pp[eq2]++;
                    puntos[eq1] += 3;
                } else if (goles2 > goles1) { // Gana equipo 2
                    pg[eq2]++; pp[eq1]++;
                    puntos[eq2] += 3;
                } else { // Empate
                    pe[eq1]++; pe[eq2]++;
                    puntos[eq1] += 1; puntos[eq2] += 1;
                }
            }
            
            // Mostrar tabla de posiciones
            System.out.println("\n==========================================================================");
            System.out.println("TABLA DE POSICIONES - GRUPO " + letraGrupo);
            System.out.printf("%-15s %4s %4s %4s %4s %4s %4s %4s %4s\n", "Equipo", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF", "PTS");
            System.out.println("==========================================================================");
            
            for (int i = inicio; i < inicio + 4; i++) {
                int dif = gf[i] - gc[i]; // Diferencia de goles
                System.out.printf("%-15s %4d %4d %4d %4d %4d %4d %4d %4d\n", 
                    equipos[i], pj[i], pg[i], pe[i], pp[i], gf[i], gc[i], dif, puntos[i]);
            }
            
            // Mostrar resultados registrados guardados en los vectores
            System.out.println("\nResultados Registrados en este Grupo:");
            for (int i = 0; i < enfrentamientos.length; i++) {
                int eq1 = inicio + enfrentamientos[i][0];
                int eq2 = inicio + enfrentamientos[i][1];
                System.out.println("Fecha: " + fechasPartidos[i] + " | " + equipos[eq1] + " " + resultadosEq1[i] + " - " + resultadosEq2[i] + " " + equipos[eq2]);
            }
            System.out.println("==========================================================================\n");
            
            System.out.print("¿Desea ingresar resultados para otro grupo? (1 al 12) o 0 para salir: ");
            grupoSeleccionado = scanner.nextInt();
        }
        
        System.out.println("\n¡Gracias por usar el sistema del Mundial 2026!");
        scanner.close();
    }
}
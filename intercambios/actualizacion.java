// Para este ejemplo mi lamina de messi esta repetida dos veces y yo quiero una de neymar.
// En cambio mi compañero juan tiene la de neymar dos veces y quiere la de messi.
// Para eso necesitamos un algoritmo  para que nos permitan a realizar el intercambio.
// Para en este caso necesitamos ek contains(), remove() y add() para la clase de String.

package intercambios;

import java.util.ArrayList;

public class actualizacion {
    public static void main(String[] args) {
        ArrayList<String> miLista = new ArrayList<>();

        // Lista mia
        miLista.add("Ronaldo");
        miLista.add("Messi");
        miLista.add("Mbappe");

        // Lista de mi compañero
        ArrayList<String> listaAmigo = new ArrayList<>();
        listaAmigo.add("Modric");
        listaAmigo.add("Neymar");
        listaAmigo.add("Benzema");

        System.out.println("--- ANTES DEL INTERCAMBIO ---");
        System.out.println("Mi lista: " + miLista);
        System.out.println("Lista de mi amigo: " + listaAmigo);
        System.out.println("----------------------------------------------\n");

        String[] misOfrendas = { "Messi", "Ronaldo" };
        String[] loQueQuiero = { "Neymar", "Modric" };

        for (int i = 0; i < misOfrendas.length; i++) {
            String miOfrenda = misOfrendas[i];
            String quiero = loQueQuiero[i];

            if (miLista.contains(miOfrenda) && listaAmigo.contains(quiero)) {
                // Quitas la ofrenda de tu lista
                miLista.remove(miOfrenda);
                // Agregas la lámina que quieres a tu lista
                miLista.add(quiero);

                // Tu amigo quita de su lista la que te dio
                listaAmigo.remove(quiero);
                // Tu amigo agrega a su lista la que le diste
                listaAmigo.add(miOfrenda);

                System.out.println("¡Intercambio realizado con exito! 🥳 (" + miOfrenda + " por " + quiero + ")");
            } else {
                System.out.println("❌ No se pudo realizar el intercambio de " + miOfrenda + " por " + quiero
                        + ", las laminas están incompletas.");
            }
        }

        System.out.println("\n-------- DESPUES DEL INTERCAMBIO -----");
        System.out.println("Mi lista actualizada: " + miLista);
        System.out.println("Lista de mi amigo actualizada: " + listaAmigo);
    }
}
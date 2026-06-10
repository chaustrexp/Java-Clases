// Para este ejemplo mi lamina de messi esta repetida dos veces y yo quiero una de neymar.
// En cambio mi compañero juan tiene la de neymar dos veces y quiere la de messi.
// Para eso necesitamos un algoritmo  para que nos permitan a realizar el intercambio.
// Para en este caso necesitamos ek contains(), remove() y add() para la clase de String.

package intercambios;

import java.util.ArrayList;

public class ejercicio1 {
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

        String miOfrenda = "Messi";
        String loQueQuiero = "Neymar";

        if (miLista.contains(miOfrenda) && listaAmigo.contains(loQueQuiero)) {

            // Quitas a Messi de tu lista
            miLista.remove(miOfrenda);
            // Agregas a Neymar a tu lista
            miLista.add(loQueQuiero);

            // Tu amigo quita a Neymar de su lista
            listaAmigo.remove(loQueQuiero);
            // Tu amigo agrega a Messi a su lista
            listaAmigo.add(miOfrenda);

            System.out.println("¡Intercambio realizado con exito! 🥳");
        } else {
            System.out.println("❌ No se pudo realizar el intercambio, la laminas estan incompletas.");
        }

        System.out.println("\n-------- DESPUES DEL INTERCAMBIO -----");
        System.out.println("Mi lista actualizada: " + miLista);
        System.out.println("Lista de mi amigo actualizada: " + listaAmigo);
    }
}
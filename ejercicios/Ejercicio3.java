public class Ejercicio3 {

    public static long aMilisegundos(int dias, int horas, int minutos, int segundos) {

        long msPorsegundo = 100L;
        long msPorminuto = 60L * msPorsegundo;
        long msPorhora = 60L * msPorminuto;
        long msPordia = 24L * msPorhora;

        return (dias * msPordia) +
                (horas * msPorhora) +
                (minutos * msPorminuto) +
                (segundos * msPorsegundo);
    }

    public static void main(String[] args) {
        int d = 1;
        int h = 2;
        int m = 30;
        int s = 15;

        long resultado = aMilisegundos(d, h, m, s);

        System.out.println("El resultado es: " + resultado + " ms");
    }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random gerador = new Random();
        int[] vetorNumeros = new int[80];
        int contador = 0;

        for (int i = 0; i < 80; i++) {
            vetorNumeros[i] = gerador.nextInt(200);
            System.out.println(vetorNumeros[i]);
            if (vetorNumeros[i] >= 10 && vetorNumeros[i] <= 150) {
                contador++;
            }
        }

        System.out.println("Existem " + contador + " números entre 10 e 150.");

    }
}
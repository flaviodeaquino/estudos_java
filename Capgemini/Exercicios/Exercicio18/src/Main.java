import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random gerador = new Random();
        int[] vetorIdade = new int[80];
        int contador = 0;

        for (int i = 0; i < 75; i++) {
            vetorIdade[i] = gerador.nextInt(100);
            System.out.println(vetorIdade[i]);
            if (vetorIdade[i] >= 18) {
                System.out.println("Maior de idade.");
            } else {
                System.out.println("Menor de idade.");
            }
        }

    }
}
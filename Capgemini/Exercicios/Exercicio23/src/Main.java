import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        char escolha = 's';

        while (escolha == 's' || escolha == 'S') {
            System.out.println("Digite um número");
            numero = scan.nextInt();
            if (numero > 80) {
                System.out.println("Número maior que 80.");
            } else if (numero < 25) {
                System.out.println("Número menor do que 25");
            } else if (numero == 40) {
                System.out.println("Numero igual a 40.");
            }

            System.out.println("Deseja continuar? [s] sim");
            escolha = scan.next().charAt(0);
            if (escolha != 's' && escolha != 'S') {
                System.out.println("Encerrando...");
            }


        }



    }
}
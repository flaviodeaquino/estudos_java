import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 1;

        Scanner leitorScanner = new Scanner(System.in);

        while (numero != 0) {
            System.out.println("Digite um número qualquer ou 0 (zero) para sair: ");
            numero = leitorScanner.nextInt();
            if (numero > 0) {
                System.out.println("O número digitado é positivo.");
            } else if (numero < 0) {
                System.out.println("O número digitado é negativo.");
            } else {
                System.out.println("O número digitado é 0 (zero). Saindo do programa...");
            }
        }

    }
}
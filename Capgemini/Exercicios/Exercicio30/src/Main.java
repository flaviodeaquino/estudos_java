import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero[] = new int[3];
        int aux;

        System.out.println("Digite o primeiro número: ");
        numero[0] = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        numero[1] = scan.nextInt();
        System.out.println("Digite o terceito número: ");
        numero[2] = scan.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                if (numero[i] > numero[j]) {
                    aux = numero[i];
                    numero[i] = numero[j];
                    numero[j] = aux;
                }
            }
        }

        System.out.println("Números ordenados em ordem crescente: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

    }
}
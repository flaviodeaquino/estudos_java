import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        System.out.println("Digite um número: ");
        Scanner leitorScanner = new Scanner(System.in);
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número digitado está entre 100 e 200.");
        } else {
            System.out.println("O número digitado não está entre 100 e 200.");
        }
    }




}
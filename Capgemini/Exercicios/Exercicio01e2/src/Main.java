import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitorScanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = leitorScanner.nextInt();;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        float divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
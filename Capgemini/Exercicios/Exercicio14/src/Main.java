import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior do que o número " + numero2 + ".");
        } else if (numero2 > numero1){
            System.out.println("O número " + numero2 + " é maior do que o número " + numero1 + ".");
        } else {
            System.out.println("Os números digitados são iguais.");
        }
    }
}
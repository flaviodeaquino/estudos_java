import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float compra = scan.nextFloat();

        float prestacao = compra / 5;

        System.out.println("A compra será dividida em 5 prestações de R$ " + String.format("%.2f", prestacao));
    }
}
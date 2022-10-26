import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em Real: ");
        float real = scan.nextFloat();
        System.out.println("Digite a cotação do dólar (1 dolár = x reais): ");
        float cotacao = scan.nextFloat();
        float dolar = real / cotacao;
        System.out.println(real + " reais é equivalente à " + dolar + " doláres." );

    }
}
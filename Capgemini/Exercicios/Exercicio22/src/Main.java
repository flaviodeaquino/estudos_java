import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        String nomeProduto;
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitorScanner.next();
            System.out.println("Digite o preço de custo deste produto: ");
            precoCusto = leitorScanner.nextFloat();
            System.out.println("Digite o preço de venda deste produto: ");
            precoVenda = leitorScanner.nextFloat();
            System.out.println(nomeProduto + " tem um preço de custo de " + precoCusto + " e um preço de venda de " + precoVenda);

            mediaCusto = (mediaCusto + precoCusto) / 2;
            mediaVenda = (mediaVenda + precoVenda) / 2;
        }

        System.out.println("A média do preço de custo é " + mediaCusto);
        System.out.println("A média do preço de venda é " + mediaVenda);
    }
}
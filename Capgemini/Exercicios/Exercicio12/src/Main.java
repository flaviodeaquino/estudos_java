import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        float custoFabrica = scan.nextFloat();

        float percentFornecedor = 0.28f;
        float imposto = 0.45f;
        float custoConsumidor = (custoFabrica + imposto * custoFabrica) * (1 + percentFornecedor);

        System.out.println("O custo do carro para o consumidor será de R$ " + String.format("%.2f", custoConsumidor));

    }
}
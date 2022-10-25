import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        float desconto = 0.0f;
        char escolha = 'S';
        int carros2k = 0;
        int carros3k = 0;
        int totalVeiculos = 0;

        while (escolha == 'S' || escolha == 's'){

                System.out.println("Digite o valor do veículo: ");
                int valorVeiculo = leitorScanner.nextInt();

                System.out.println("Digite o ano do veículo vendido: ");
                int anoVeiculo = leitorScanner.nextInt();

                if (anoVeiculo <= 2000) {
                    carros2k++;
                    desconto = 0.12f;
                    double valorTotal = valorVeiculo * (1 - desconto);
                    double valorDesconto = desconto * valorVeiculo;

                    System.out.println("O valor do desconto é: " + valorDesconto);
                    System.out.println("O valor total do veículo é: " + valorTotal);

                } else {
                    carros3k++;
                    desconto = 0.07f;
                    double valorTotal = valorVeiculo * (1 - desconto);
                    double valorDesconto = desconto * valorVeiculo;

                    System.out.println("O valor do desconto é: " + valorDesconto);
                    System.out.println("O valor total do veículo é: " + valorTotal);

                }

            System.out.println("Deseja continuar calculando desconto? S - sim / N - não");
            escolha = leitorScanner.next().charAt(0);

        }

        totalVeiculos = carros2k + carros3k;
        System.out.println("A quantidade de veículos cadastrados com ano de fabricação anterior à 2000 foi de: " + carros2k);
        System.out.println("O total de veículos cadastrados foi de: " + totalVeiculos);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float precoBase = 1.0f;
        float precoCliente;
        float desconto;

        while (precoBase != 0.0) {
            System.out.println("Digite o valor do veículo [0 para sair]: ");
            precoBase = scan.nextFloat();

            if (precoBase == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Qual o combustível do veículo?");
                System.out.println("1 - Álcool");
                System.out.println("2 - Gasolina");
                System.out.println("3 - Diesel");
                int combustivel = scan.nextInt();
                switch (combustivel) {
                    case 1:
                        desconto = precoBase * 0.25f;
                        precoCliente = precoBase - desconto;
                        System.out.println("Desconto: " + desconto);
                        System.out.println("Preço para o cliente: " + precoCliente);
                        break;
                    case 2:
                        desconto = precoBase * 0.21f;
                        precoCliente = precoBase - desconto;
                        System.out.println("Desconto: " + desconto);
                        System.out.println("Preço para o cliente: " + precoCliente);
                        break;
                    case 3:
                        desconto = precoBase * 0.14f;
                        precoCliente = precoBase - desconto;
                        System.out.println("Desconto: " + desconto);
                        System.out.println("Preço para o cliente: " + precoCliente);
                        break;
                    default:
                        System.out.println("Opção inválida. Saindo...");
                        precoBase = 0.0f;
                }

            }
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Finalizar operação");
            int escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Operação não implementada.");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    float deposito = scan.nextFloat();
                    float rendimento = deposito * 1.07f;
                    System.out.println("O rendimento do seu deposito será de R$" + rendimento + " ao final do mês.");
                    break;
                case 3:
                    System.out.println("Operação não implementada.");
                    break;
                case 4:
                    System.out.println("Finalizando operação...");
                    continuar = 'N';
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println("Finalizando operação...");
                    continuar = 'N';
            }
        }
    }
}
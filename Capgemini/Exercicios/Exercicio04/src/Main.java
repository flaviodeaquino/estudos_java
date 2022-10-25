import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = leitorScanner.nextLine();
        System.out.println("Digite o salário base do vendedor: ");
        float salarioBase = leitorScanner.nextFloat();
        System.out.println("Digite o valor total das vendas deste vendedor: ");
        float vendasTotais = leitorScanner.nextFloat();

        float comissao = 0.15f;
        float salarioFinal = salarioBase + (vendasTotais * comissao);

        System.out.println("Vendedor: " + nome);
        System.out.println("Salário base: " + salarioBase);
        System.out.println("Salário final: " + salarioFinal);
    }
}
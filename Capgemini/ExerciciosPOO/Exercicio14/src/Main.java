import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o número do item: ");
        String numero = scan.nextLine();
        System.out.print("\nDigite a descrição do item: ");
        String descricao = scan.nextLine();
        System.out.print("\nDigite a quantidade comprada do item: ");
        int quantidadeComprada = scan.nextInt();
        System.out.print("\nDigite o preço do item: ");
        double precoItem = scan.nextDouble();

        Fatura fatura = new Fatura(numero, descricao, quantidadeComprada, precoItem);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade de item: " + fatura.getQtdCompradaItem());
        System.out.println("Preço por item: " + fatura.getPrecoItem());
        System.out.println("Valor da fatura: " + fatura.getTotalFatura());


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int variavelA = leitorScanner.nextInt();
        System.out.println("Digite um número: ");
        int variavelB = leitorScanner.nextInt();

        System.out.println("Variável A: " + variavelA);
        System.out.println("Variável B: " + variavelB);
        System.out.println("Efetuando a troca...");

        int aux = variavelA;
        variavelA = variavelB;
        variavelB = aux;

        System.out.println("Troca efetuada!");
        System.out.println("Variável A: " + variavelA);
        System.out.println("Variável B: " + variavelB);


    }
}
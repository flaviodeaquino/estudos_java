import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitorScanner.nextLine();
        System.out.println("Digite a nota da prova 1: ");
        float nota1 = leitorScanner.nextFloat();
        System.out.println("Digite a nota da prova 2: ");
        float nota2 = leitorScanner.nextFloat();
        System.out.println("Digite a nota da prova 3: ");
        float nota3 = leitorScanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média Final: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media <= 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em recuperação.");
        }
    }
}
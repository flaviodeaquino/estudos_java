import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int escolha = 1;
        String nome;
        char sexo;
        int idade;
        int apto;

        while (escolha == 1) {
            System.out.println("Digite o nome da pessoa: ");
            nome = scan.next();
            System.out.println("Digite o sexo da pessoa: ");
            sexo = scan.next().charAt(0);
            while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f') {
                System.out.println("Erro. Digite o sexo da pessoa - M / F :");
                sexo = scan.next().charAt(0);
            }
            System.out.println("Digite a idade da pessoa: ");
            idade = scan.nextInt();
            System.out.println("A pessoa está apta para cumprir o serviço militar obrigatório? [1] sim / [2] não");
            apto = scan.nextInt();
            while (apto != 1 && apto != 2) {
                System.out.println("Erro. A pessoa está apta para cumprir o serviço militar obrigatório? [1] sim / [2] não");
                apto = scan.nextInt();
            }

            System.out.println("Nome: " + nome);
            System.out.println("Sexo: " + sexo);
            System.out.println("Idade: " + idade);
            if (apto == 1) {
                System.out.println("Está apto para cumprir o serviço militar obrigatório.");
            } else {
                System.out.println("Não está apto para cumprir o serviço militar obrigatório.");
            }

            System.out.println("Deseja continuar? [1] sim / [2] não");
            escolha = scan.nextInt();
            while (escolha != 1 && escolha != 2) {
                escolha = 2;
            }
            if (escolha == 2) {
                System.out.println("Finalizando operação...");
            }

        }

    }
}
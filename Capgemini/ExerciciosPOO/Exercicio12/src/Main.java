import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // cria uma nova Agenda
        Agenda agenda = new Agenda(10);
        String nome; // nome da pessoa
        int idade; // idade da pessoa
        float altura; // altura da pessoa
        boolean menu = true;

        // cria o menu de opções
        while(menu) {
            System.out.println("\n-------------------------------");
            System.out.println("1. Nova Pessoa");
            System.out.println("2. Excluir Pessoa");
            System.out.println("3. Buscar Pessoa");
            System.out.println("4. Imprimir Agenda");
            System.out.println("5. Imprimir Pessoa (Índice)");
            System.out.println("6. Sair");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o nome: ");
                    nome = scan.nextLine();
                    System.out.print("Informe a idade: ");
                    idade = Integer.parseInt(scan.nextLine());
                    System.out.print("Informe a altura (use ponto em vez de vírgula): ");
                    altura = Float.parseFloat(scan.nextLine());
                    agenda.armazenarPessoa(nome, idade, altura);
                    break;
                case 2:
                    System.out.print("Informe o nome do cadastro a ser excluído: ");
                    nome = scan.nextLine();
                    agenda.removerPessoa(nome);
                    break;
                case 3:
                    System.out.print("Informe o nome do cadastro a ser encontrado: ");
                    nome = scan.nextLine();
                    agenda.buscarPessoa(nome);
                    break;
                case 4:
                    agenda.imprimirAgenda();
                    break;
                case 5:
                    System.out.println("Informe a posição da agenda que deseja imprimir.");
                    int index = Integer.parseInt(scan.nextLine());
                    agenda.imprimirPessoa(index);
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
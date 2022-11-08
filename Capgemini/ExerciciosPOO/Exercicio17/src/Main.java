import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda(2);
        String tipo, data, nomeParticipante, telefone;
        boolean menu = true;

        while (menu) {
            System.out.println("\n-------------------------------");
            System.out.println("1. Novo compromisso");
            System.out.println("2. Remover compromisso");
            System.out.println("3. Encontrar compromisso");
            System.out.println("4. Alterar compromisso");
            System.out.println("5. Imprimir compromissos por participante.");
            System.out.println("6. Imprimir compromissos por data");
            System.out.println("7. Sair");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Informe o tipo (Reunião, Pagamento, Entrega de projeto):");
                    tipo = scan.nextLine();
                    System.out.println("Informe a data: ");
                    data = scan.nextLine();
                    System.out.println("Informe o participante: ");
                    nomeParticipante = scan.nextLine();
                    System.out.println("Informe o telefone do participante: ");
                    telefone = scan.nextLine();
                    agenda.agendarCompromisso(tipo, data, nomeParticipante, telefone);
                    break;
                case 2:
                    System.out.println("Informe o tipo (Reunião, Pagamento, Entrega de projeto):");
                    tipo = scan.nextLine();
                    System.out.println("Informe a data: ");
                    data = scan.nextLine();
                    System.out.println("Informe o participante: ");
                    nomeParticipante = scan.nextLine();
                    agenda.removerCompromisso(tipo, data, nomeParticipante);
                    break;
                case 3:
                    System.out.println("Informe o tipo (Reunião, Pagamento, Entrega de projeto):");
                    tipo = scan.nextLine();
                    System.out.println("Informe a data: ");
                    data = scan.nextLine();
                    System.out.println("Informe o participante: ");
                    nomeParticipante = scan.nextLine();
                    agenda.encontrarCompromisso(tipo, data, nomeParticipante);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Informe o participante: ");
                    nomeParticipante = scan.nextLine();
                    agenda.exibirCompromissosParticipante(nomeParticipante);
                    break;
                case 6:
                    System.out.println("Informe a data: ");
                    data = scan.nextLine();
                    agenda.exibirCompromissoData(data);
                    break;
                case 7:
                    System.out.println("Encerrando...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }
}
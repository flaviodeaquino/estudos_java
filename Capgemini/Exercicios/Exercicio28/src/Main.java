import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char escolha = 's';
        String nomeFuncionario;
        float salarioFuncionario;
        float salarioMinimo = 100.0f;
        float folhaPagamentoAntiga = 0.0f;
        float folhaPagamentoNova = 0.0f;
        float diferencaFolha = 0.0f;

        while (escolha == 's' || escolha == 'S') {
            System.out.println("Digite o nome do funcionário: ");
            nomeFuncionario = scan.next();
            System.out.println("Digite o salário do funcionário: ");
            salarioFuncionario = scan.nextFloat();
            if (salarioFuncionario < 3 * salarioMinimo) {
                folhaPagamentoAntiga = folhaPagamentoAntiga + salarioFuncionario;
                salarioFuncionario = salarioFuncionario * 1.5f;
                folhaPagamentoNova = folhaPagamentoNova + salarioFuncionario;
            } else if (salarioFuncionario > 3 * salarioMinimo && salarioFuncionario < 10 * salarioMinimo) {
                folhaPagamentoAntiga = folhaPagamentoAntiga + salarioFuncionario;
                salarioFuncionario = salarioFuncionario * 1.2f;
                folhaPagamentoNova = folhaPagamentoNova + salarioFuncionario;
            } else if (salarioFuncionario > 10 * salarioMinimo && salarioFuncionario < 20 * salarioMinimo) {
                folhaPagamentoAntiga = folhaPagamentoAntiga + salarioFuncionario;
                salarioFuncionario = salarioFuncionario * 1.15f;
                folhaPagamentoNova = folhaPagamentoNova + salarioFuncionario;
            } else {
                folhaPagamentoAntiga = folhaPagamentoAntiga + salarioFuncionario;
                salarioFuncionario = salarioFuncionario * 1.1f;
                folhaPagamentoNova = folhaPagamentoNova + salarioFuncionario;
            }

            diferencaFolha = folhaPagamentoNova - folhaPagamentoAntiga;

            System.out.println("Nome: " + nomeFuncionario);
            System.out.println("Salário mínimo: " + salarioMinimo);
            System.out.println("Salário do funcionário: " + salarioFuncionario);


            System.out.println("Deseja continuar? [s] para sim");
            escolha = scan.next().charAt(0);
        }
        System.out.println("Aumento na folha de pagamento da empresa: " + diferencaFolha);
    }
}
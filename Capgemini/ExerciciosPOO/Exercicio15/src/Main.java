import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        RegistroFuncionario regitro = new RegistroFuncionario(2);
        String nome;
        String sobrenome;
        double salarioMensal;

        boolean escolha = true;
        while (escolha) {
            System.out.println("\nDigite a operação desejada: ");
            System.out.println("1 - Registrar funcionário");
            System.out.println("2 - Verificar salário anual");
            System.out.println("3 - Número de funcionário que já passaram pela empresa");
            System.out.println("4 - Sair");
            System.out.print("\nSua escolha: ");
            int opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("\nDigite o primeiro nome do funcionário: ");
                    nome = scan.next();
                    System.out.print("\nDigite o sobrenome do funcionário: ");
                    sobrenome = scan.next();
                    System.out.print("\nDigite o salário do funcionário: ");
                    salarioMensal = scan.nextDouble();

                    regitro.registrarFuncionario(nome, sobrenome, salarioMensal);
                    break;
                case 2:
                    System.out.print("\nDigite o primeiro nome do funcionário: ");
                    nome = scan.next();
                    System.out.print("\nDigite o sobrenome do funcionário: ");
                    sobrenome = scan.next();
                    System.out.print("\nDigite o salário do funcionário: ");
                    salarioMensal = scan.nextDouble();

                    regitro.salarioAnual(nome,sobrenome, salarioMensal);
                    break;
                case 3:
                    System.out.println("Número de funcionário que já passaram pela empresa: " + regitro.getCodigoFuncionario());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    escolha = false;
                    break;
                default:
                    System.out.println("Opção incorreta. Tente novamente.");
            }
        }






    }
}
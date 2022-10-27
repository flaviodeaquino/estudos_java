import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeProfessor;
        int nivelProfessor;
        int horasTrabalhadas;
        float salarioProfessor;

        System.out.println("Digite o nome do professor: ");
        nomeProfessor = scan.next();
        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        nivelProfessor = scan.nextInt();
        while (nivelProfessor != 1 && nivelProfessor != 2 && nivelProfessor != 3) {
            System.out.println("Nível inválido. Digite o nível do professor (1, 2 ou 3): ");
            nivelProfessor = scan.nextInt();
        }
        System.out.println("Digite a quantidade de horas/aula trabalhadas: ");
        horasTrabalhadas = scan.nextInt();

        switch (nivelProfessor){
            case 1:
                salarioProfessor = 12 * horasTrabalhadas;
                System.out.println("Salário: R$" + salarioProfessor);
                break;
            case 2:
                salarioProfessor = 17 * horasTrabalhadas;
                System.out.println("Salário: R$" + salarioProfessor);
                break;
            case 3:
                salarioProfessor = 25 * horasTrabalhadas;
                System.out.println("Salário: R$" + salarioProfessor);
                break;
            default:
                System.out.println("Erro.");
        }
    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tipo de imóvel? ");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoImovel = scan.nextInt();

        System.out.println("Digite a quantidade de KW/h: ");
        int kwHoras = scan.nextInt();

        float resultado = 0;

        switch (tipoImovel) {
            case 1:
                resultado = kwHoras * 0.60f;
                break;
            case 2:
                resultado = kwHoras * 0.48f;
                break;
            case 3:
                resultado = kwHoras * 1.29f;
                break;
            default:
                System.out.println("Opção inválida. Encerrando operação...");
        }

        System.out.println("O valor da conta de luz será de R$ " + resultado);

    }
}
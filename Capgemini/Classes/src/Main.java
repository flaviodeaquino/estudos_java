import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitorScanner.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitorScanner.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
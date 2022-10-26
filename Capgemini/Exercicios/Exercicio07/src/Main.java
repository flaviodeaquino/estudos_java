import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus Celsius: ");
        float celsius = leitor.nextFloat();

        float fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é de : " + fahrenheit);
    }
}
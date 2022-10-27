import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Digite o lado A do triângulo: ");
        ladoA = scan.nextInt();
        System.out.println("Digite o lado B do triângulo: ");
        ladoB = scan.nextInt();
        System.out.println("Digite o lado C do triângulo: ");
        ladoC = scan.nextInt();

        if (ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB) {
            System.out.println("Os lados informados não formam um triângulo.");
        } else {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo equilátero.");
            } else if (ladoA == ladoB && ladoB != ladoC) {
                System.out.println("Triângulo isósceles e equilátero.");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("Triângulo escaleno.");
            }
        }
    }
}
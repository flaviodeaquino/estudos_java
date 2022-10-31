import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idadeNadador = scan.nextInt();

        if (idadeNadador >= 5 && idadeNadador <= 7) {
            System.out.println("Infantil A.");
        } else if (idadeNadador >= 8 && idadeNadador <= 10) {
            System.out.println("Infantil B.");
        } else if (idadeNadador >= 11 && idadeNadador <= 13) {
            System.out.println("Juvenil A.");
        } else if (idadeNadador >= 14 && idadeNadador <= 17) {
            System.out.println("Juvenil B.");
        } else if (idadeNadador >= 18 && idadeNadador <= 25) {
            System.out.println("Sênior.");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }
    }
}
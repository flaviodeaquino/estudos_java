import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int totalM = 0;
        int totalF = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scan.next();
            System.out.println("Digite o sexo da pessoa - M / F :");
            char sexo = scan.next().charAt(0);
            while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f') {
                System.out.println("Erro. Digite o sexo da pessoa - M / F :");
                sexo = scan.next().charAt(0);
            }
            if (sexo == 'm' || sexo == 'M') {
                totalM++;
            } else {
                totalF++;
            }
        }

        System.out.println("Foram cadastrados " + totalM + " homens e " + totalF + " mulheres.");


    }
}
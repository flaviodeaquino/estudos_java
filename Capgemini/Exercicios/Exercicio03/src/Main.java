import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida pelo automóvel em km: ");
        float distanciaPercorrida = leitorScanner.nextFloat();
        System.out.print("Digite o total de combustível consumido em litros: ");
        float combustivelConsumido = leitorScanner.nextFloat();

        float consumoMedio = distanciaPercorrida / combustivelConsumido;
        System.out.println("O consumo médio do veículo foi de " + consumoMedio + " km/l");
    }
}
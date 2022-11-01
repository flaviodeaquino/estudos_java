import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BombaCombustivel b = new BombaCombustivel();
        b.setTipoCombustivel("Gasolina");
        b.setValorLitro(5.0f);
        b.setQtdCombustivel(100.0f);

        b.abastecerPorValor(100.0f);
        b.abastecerPorLitro(10.0f);
        b.alterarValor(5.5f);
        b.alterarCombustivel("Álcool");
        b.alterarQuantidadeCombustivel(100.0f);

    }
}
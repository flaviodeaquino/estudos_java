import java.util.Scanner;

public class BombaCombustivel {

    Scanner scan = new Scanner(System.in);
    private String tipoCombustivel;
    private float valorLitro;
    private float qtdCombustivel;

    public void abastecerPorValor(float valorReais) {
        float qtdAbastecido = valorReais / valorLitro;
        System.out.println("Foi abastecido " + qtdAbastecido + " litros de " + tipoCombustivel);
    }

    public void abastecerPorLitro(float qtdLitros) {
        float valorReais = qtdLitros * valorLitro;
        System.out.println("O valor do abastecimento foi de R$ " + valorReais);
    }

    public void alterarValor(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(float qtdLitros) {
        System.out.println("Digite o número da operação desejada: ");
        System.out.println("1 - Adicionar combustível na bomba");
        System.out.println("2 - Retirar combustível da bomba");
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                qtdCombustivel += qtdLitros;
                System.out.println("Foi adicionado " + qtdLitros + " litros de combustível");
                System.out.println("A bomba possui " + qtdCombustivel + " litros de combustível.");
                break;
            case 2:
                qtdCombustivel -= qtdLitros;
                System.out.println("Foi retirado " + qtdLitros + " litros de combustível");
                System.out.println("A bomba possui " + qtdCombustivel + " litros de combustível.");
                break;
            default:
                System.out.println("Erro. Finalizando operação...");
        }

    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }
}

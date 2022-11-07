import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculadora c = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        double numero1;
        double numero2;

        System.out.print("\nDigite o primeiro número: ");
        numero1 = scan.nextDouble();
        c.setNumero1(numero1);
        System.out.print("Digite o segundo número: ");
        numero2 = scan.nextDouble();
        c.setNumero2(numero2);

        System.out.println(cc.adicao(c.getNumero1(), c.getNumero2()));
        System.out.println(cc.subtracao(c.getNumero1(), c.getNumero2()));
        System.out.println(cc.multiplicacao(c.getNumero1(), c.getNumero2()));
        System.out.println(cc.divisao(c.getNumero1(), c.getNumero2()));
        System.out.println(cc.raizQuadrada(c.getNumero1()));
        System.out.println(cc.raiz(c.getNumero1(), c.getNumero2()));
        System.out.println(cc.potencia(c.getNumero1(), c.getNumero2()));
    }
}
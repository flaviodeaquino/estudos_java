import java.lang.Math;

public class CalculadoraCientifica extends Calculadora{

    public double raizQuadrada(double numero1) {
        double resultado = Math.sqrt(numero1);
        System.out.print("\nRaiz Quadrada: ");
        return resultado;
    }

    public double raiz(double numero1, double numero2) {
        System.out.print("\nCalcular a raiz " + numero1 + " de " + numero2 + ": ");
        double resultado = Math.pow(numero2, 1/numero1);
        return resultado;
    }

    public double potencia(double numero1, double numero2) {
        double resultado = Math.pow(numero1, numero2);
        System.out.print("\nPotenciação: ");
        return resultado;
    }

}

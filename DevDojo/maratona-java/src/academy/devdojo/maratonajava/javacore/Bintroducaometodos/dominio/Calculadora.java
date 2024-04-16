package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int x, int y) {
        System.out.println(x * y);
    }

    public double divideDoisNumeros(double x, double y) {
        if (y == 0) return 0;
        return x / y;
    }

    public void imprimeDivisaoDeDoisNumeros(double x, double y) {
        if (y == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(x / y);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros:");
        System.out.println("Num1 = " + numero1);
        System.out.println("Num2 = " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}


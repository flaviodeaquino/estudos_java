import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float resultado = 0.0f;

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();
        System.out.println("Digite o operador (+, -, *, /");
        char operador = scan.next().charAt(0);

        if (operador == '+') {
            resultado = numero1 + numero2;
            System.out.println("Resultado da soma: " + resultado);
        } else if (operador == '-') {
            resultado = numero1 - numero2;
            System.out.println("Resultado da subtração: " + resultado);
        } else if (operador == '*') {
            resultado = numero1 * numero2;
            System.out.println("Resultado da multiplicação: " + resultado);
        } else if (operador == '/') {
            if (numero2 == 0) {
                System.out.println("Não é possível realizar a divisão de um número real por zero.");
            } else {
                resultado = numero1 / numero2;
                System.out.println("Resultado da divisão: " + resultado);
            }
        } else {
            System.out.println("Operador inválido. Encerrando...");
        }


    }
}
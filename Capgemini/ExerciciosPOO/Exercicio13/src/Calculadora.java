public class Calculadora {

    private double numero1;
    private double numero2;
    private double resultado;

    public Calculadora(double numero1, double numero2, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public Calculadora() {

    }

    public double adicao(double numero1, double numero2) {
        resultado = numero1 + numero2;
        System.out.print("\nAdição: ");
        return resultado;
    }

    public double subtracao(double numero1, double numero2) {
        resultado = numero1 - numero2;
        System.out.print("\nSubtração: ");
        return resultado;
    }

    public double multiplicacao(double numero1, double numero2) {
        resultado = numero1 * numero2;
        System.out.print("\nMultiplicação: ");
        return resultado;
    }

    public double divisao (double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Não existe resultado em número real em divisões pelo número 0");
            return Double.parseDouble(null);
        } else {
            resultado = numero1 / numero2;
            System.out.print("\nDivisão: ");
            return resultado;
        }
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double impostoDevido;

        if (salarioAnual < 34713) {
            impostoDevido = salarioAnual * 9.70/100;
        } else if (salarioAnual >= 34713 && salarioAnual < 68508) {
            impostoDevido = salarioAnual * 37.55/100;
        } else {
            impostoDevido = salarioAnual * 49.50/100;
        }
        System.out.println("O imposto a ser pago será de: $ " + impostoDevido);

    }
}

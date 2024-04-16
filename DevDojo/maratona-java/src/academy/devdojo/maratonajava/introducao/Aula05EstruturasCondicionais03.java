package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo.";
        String mensagemNaoDoar = "Ainda não tenho condições de doar.";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        // (condição) ? verdadeiro : falso
        String resultado2 = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado2);

        // Deixando o código ainda mais limpo

        String resultado3 = (salario > 5000) ? "Eu vou doar 500 para o DevDojo." : "Ainda não tenho condições de doar.";
        System.out.println(resultado3);
    }
}

package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;
import java.util.Date;

/*
Prática:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome> morando no <endereço>, confimo que recebi o salário de  <salario>, na data <data>

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Paulo Freire";
        String endereco = "Avenida Gustavo Kuerten, 150";
        double salario = 10000.01;
        String dataRecebimentoSalario = "23/11/2023";

        System.out.println("Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$ " +
                salario + ", na data de " + dataRecebimentoSalario + ".");
    }
}

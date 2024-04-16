package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

import java.sql.SQLOutput;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$ " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());

            // OU
            // System.out.println(((Tomate) produto).getDataValidade());
            // OU
            // String dataValidade = ((Tomate) produto).getDataValidade();
            // System.out.println(dataValidade)

        }

    }
}

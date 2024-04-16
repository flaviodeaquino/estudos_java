package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Spider", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alex", 12000);

        gerente.imprime();
        System.out.println(gerente);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
    }
}

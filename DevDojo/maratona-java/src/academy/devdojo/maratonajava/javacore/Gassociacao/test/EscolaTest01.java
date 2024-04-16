package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Regina");
        Professor professor2 = new Professor("Rosenda");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("EE Joaquin Saraiva", professores);

        escola.imprime();

    }
}

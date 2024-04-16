package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("José", 18);
        Professor professor1 = new Professor("Ciro", "História");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Humanas", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();



//        Aluno aluno1 = new Aluno("José", 18);
//        Aluno aluno2 = new Aluno("Patrícia", 17);
//        Aluno aluno3 = new Aluno("Vanessa", 19);
//        Professor professor1 = new Professor("Alberto", "Matemática");
//        Professor professor2 = new Professor("Ciro", "História");
//        Professor professor3 = new Professor("Rosenda", "Metrologia");
//        Seminario seminario1 = new Seminario("Humanas");
//        Seminario seminario2 = new Seminario("Exatas");
//
//        aluno1.setSeminario(seminario1);
//        aluno2.setSeminario(seminario1);
//        aluno3.setSeminario(seminario2);
//
////        professor1.setSeminarios(seminario2);
////        professor2.setSeminarios(seminario1);
//
//
//
//        aluno1.imprime();
//        professor1.imprime();
//        seminario1.imprime();
    }
}

public class Main {
    public static void main(String[] args) {

        AlunosMatriculados aluno = new AlunosMatriculados();
        aluno.setNome("Flávio Ferreira");
        aluno.setNotaProva1(8.0f);
        aluno.setNotaProva2(3.0f);
        aluno.setNotaTrabalho(5.0f);
        aluno.setNumeroMatricula(1);

        aluno.media();
        aluno.notaProvaFinal(7);

    }
}
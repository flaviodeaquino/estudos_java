public class AlunosMatriculados {

    private int numeroMatricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;

    public void media() {
        float mediaNotas = ((2.5f * (notaProva1 + notaProva2)) + (2 * notaTrabalho)) / (2.5f + 2.5f + 2.0f);
        System.out.println("A média do aluno foi de " + mediaNotas + " pontos.");
    }

    public void notaProvaFinal(float mediaFinal) {
        float notaProva3 = ((mediaFinal * (3 * 2.5f + 2.0f) - 2.0f * notaTrabalho) / 2.5f) - notaProva1 - notaProva2;
        System.out.println("A nota da prova final deverá ser de " + notaProva3 + " pontos.");
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}

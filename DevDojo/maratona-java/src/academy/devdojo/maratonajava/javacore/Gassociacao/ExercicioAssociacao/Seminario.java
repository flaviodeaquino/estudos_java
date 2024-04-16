package academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime(){
        System.out.println("--- Seminário ---");
        System.out.println("Título: " + titulo);
        if (this.alunos == null) return;
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i]);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

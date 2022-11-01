public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;

    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidadeElevador) {
            pessoasPresentes++;
            System.out.println("Entrou uma pessoa no elevador.");
        } else {
            System.out.println("Elevador cheio.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Saiu uma pessoa do elevador.");
        } else {
            System.out.println("Não existem pessoas no elevador.");
        }
    }

    public void sobe() {
        if (andarAtual == totalAndares) {
            System.out.println("O elevador está no último andar, portanto, não pode subir.");
        } else {
            andarAtual++;
            System.out.println("O elevador subiu um andar.");
        }
    }

    public void desce() {
        if (andarAtual == 0) {
            System.out.println("O elevador está no andar térreo, portanto, não pode descer.");
        } else {
            andarAtual--;
            System.out.println("O elevador desceu um andar.");
        }
    }


    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}

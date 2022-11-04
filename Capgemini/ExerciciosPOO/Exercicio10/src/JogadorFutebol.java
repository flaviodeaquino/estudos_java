import java.util.Calendar;

public class JogadorFutebol {

    private String nome, posicao, nacionalidade;
    private String dataNascimento;
    private float altura, peso;

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public int calcularIdade() {
        // vamos obter o ano da data de hoje
        Calendar calendario = Calendar.getInstance();
        int anoDataAtual = calendario.get(Calendar.YEAR);
        int mesDataAtual = calendario.get(Calendar.MONTH)+1;
        int diaDataAtual = calendario.get(Calendar.DAY_OF_MONTH);

        // agora vamos obter o ano de nascimento da pessoa
        int dian = Integer.valueOf(dataNascimento.substring(0,2));
        int mesn = Integer.valueOf(dataNascimento.substring(3,5));
        int anon = Integer.valueOf(dataNascimento.substring(6,10));

        // Idade.
        int idade;

        if (mesn < mesDataAtual || (mesn == mesDataAtual && dian <= diaDataAtual))
            idade = anoDataAtual - anon;
        else
            idade = (anoDataAtual - anon)-1;

        return (idade);
    }

    public void tempoAposentar() {
        int idade = calcularIdade();
        int anosAposentar = 0;
        if (posicao == "Defesa" || posicao == "defesa") {
            anosAposentar = 40 - idade;
        } else if (posicao == "Meio-Campo" || posicao == "meio-campo") {
            anosAposentar = 38 - idade;
        } else if (posicao == "Atacante" || posicao == "atacante") {
            anosAposentar = 35 - idade;
        }
        System.out.println("Faltam apenas " + anosAposentar + " para a aposentadoria do jogador " + nome + ".");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}

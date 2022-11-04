public class Main {
    public static void main(String[] args) {

        JogadorFutebol jogador = new JogadorFutebol();
        jogador.setNome("Flávio");
        jogador.setPosicao("Atacante");
        jogador.setDataNascimento("01/01/1990");
        jogador.setNacionalidade("Brasil");
        jogador.setAltura(1.70f);
        jogador.setPeso(63f);

        jogador.imprimirDados();
        jogador.calcularIdade();
        jogador.tempoAposentar();

    }
}
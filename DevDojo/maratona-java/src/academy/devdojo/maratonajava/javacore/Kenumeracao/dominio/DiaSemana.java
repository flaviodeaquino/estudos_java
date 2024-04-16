package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum DiaSemana {
        SEGUNDA("Segunda-feira", true),
        TERCA("Terça-feira", true),
        QUARTA("Quarta-feira", true),
        QUINTA("Quinta-feira", true),
        SEXTA("Sexta-feira", true),
        SABADO("Sábado", false),
        DOMINGO("Domingo", false);

        private final String nome;
        private final boolean util;

        DiaSemana(String nome, boolean util) {
            this.nome = nome;
            this.util = util;
        }

        public String getNome() {
            return nome;
        }

        public boolean isUtil() {
            return util;
        }
    }


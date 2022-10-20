public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        minhaInstrucaoDeImprimir();

        //TIPOS DE DADOS
        String login = "Olá!";   // Representação de Texto (ASCII)
        int number1 = 10;        // Representação de números inteiros
        double percent = 24.33;  // Representação de números fracionados
        boolean isDriver = false;// Representação booleana (verdadeiro | falso)

        System.out.println(login);
        System.out.println(number1);
        System.out.println(percent);
        System.out.println(isDriver);

        int number; // Declarando variável
        number = 55;
        System.out.println(number + 10);

        calc(10, 5); // argumentos

    }

    static void minhaInstrucaoDeImprimir() {
        System.out.println("Olá, mundo! Eu sou o primeiro programa do Flávio!");
    }

    static void calc(int x, int y) {
        // sum -> nome da função, geralmente usamos verbos
        // () -> parenteses usamos para definir o que chegará naquela função (parâmetros)
        // (tipo nomeDaVariavel)
        // {} -> bloco de código que será executado
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);
    }


}

// comentários // -> são úteis para indicar comentários/notas nos projetos;
// ponto de entrada - entry-point -> é o ponto onde todos os sistemas procuram no seu projeto para começar a iniciar o projeto
// métodos -> são instruções que você define para o programa executar. Exemplo:
    // instrução chamada System.out.println("")
// propriedades/variáveis -> será onde iremos armazenar dados para manipular no futuro.

// Variáveis são espaços de memória alocado (representado por tipos)
// variáveis -> tipo: Textos (String)
// variáveis -> tipo: Números (int)
// variáveis -> tipo: Números fracionados (double)
// variáveis -> tipo: booleanas (verdadeiro | falso)

// TIPOS DE DADOS
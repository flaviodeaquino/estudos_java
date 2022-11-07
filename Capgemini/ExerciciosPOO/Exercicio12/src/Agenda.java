public class Agenda {

    private Pessoa pessoas[];

    public Agenda(int quantidade) {
        pessoas = new Pessoa[quantidade];
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        // ainda temos posições disponíveis na agenda?
        boolean cadastrado = false;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                // encontramos uma posição
                Pessoa p = new Pessoa(nome, idade, altura);
                // guardamos ela no vetor
                pessoas[i] = p;
                // e avisamos que o cadastro foi efetuado com sucesso
                cadastrado = true;
                break; // sai do laço
            }
        }
        if(cadastrado){
            System.out.println("\nCadastro efetuado com sucesso");
        }
        else{
            System.out.println("\nNão foi possível cadastrar. Agenda cheia");
        }
    }

    public void removerPessoa(String nome) {
        // vamos verificar se a exclusão foi efetuada com sucesso
        boolean excluido = false;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                // esta é a pessoa que estamos procurando?
                if (pessoas[i].getNome().equals(nome)) {
                    pessoas[i] = null; // posição disponível novamente
                    excluido = true;
                    break; // sai do laço
                }
            }
        }

        if (excluido) {
            System.out.println("\nPessoa removida com sucesso");
        } else {
            System.out.println("\nNão foi possível excluir a pessoa. Nome não encontrado.");
        }
    }

    public void buscarPessoa(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                // esta é a pessoa que estamos procurando?
                if (pessoas[i].getNome().equals(nome)) {
                    System.out.println("Pessoa encontrada na posição " + i + " da agenda."); // posição encontrada
                    encontrado = true;
                    break; // sai do laço
                }
            }
        }

            if (encontrado == false) {
                System.out.println("Nome não encontrado.");
            }
    }

    public void imprimirAgenda() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.println("\nNome: " + pessoas[i].getNome());
                System.out.println("Idade: " + pessoas[i].getIdade());
                System.out.println("Altura: " + pessoas[i].getAltura());
            }
        }
    }

    public void imprimirPessoa(int index) {
        if (pessoas[index] != null) {
            System.out.println("\nNome: " + pessoas[index].getNome());
            System.out.println("Idade: " + pessoas[index].getIdade());
            System.out.println("Altura: " + pessoas[index].getAltura());
        } else {
            System.out.println("Não existe cadastro na agenda para essa posição.");
        }
    }


}

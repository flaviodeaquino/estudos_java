public class RegistroFuncionario {

    private Funcionario funcionarios[];
    private int codigoFuncionario = 0;

    public RegistroFuncionario(int quantidade) {
        funcionarios = new Funcionario[quantidade];
    }

    public void registrarFuncionario(String nome, String sobrenome, double salarioMensal) {
        boolean cadastrado = false;
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                Funcionario f = new Funcionario(nome, sobrenome, salarioMensal);
                funcionarios[i] = f;
                cadastrado = true;
                break;
            }
        }
        if (cadastrado) {
            System.out.println("Funcionário registrado com sucesso.");
            codigoFuncionario++;
        } else {
            System.out.println("Não foi possível cadastrar o funcinário. Agenda cheia");
        }
    }

    public void salarioAnual(String nome, String sobrenome, double salarioMensal) {
        boolean encontrado = false;
        double salarioAnual;
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                if (funcionarios[i].getNome().equals(nome) && funcionarios[i].getSobrenome().equals(sobrenome)){
                    System.out.println("Funcionário encontrado.");
                    salarioAnual = 13 * salarioMensal;
                    System.out.println("Salário anual: R$" + salarioAnual);
                    encontrado = true;
                    break;
                }
            }
        }
        if (encontrado == false) {
            System.out.println("Funcionário não encontrado.");
        }

    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

}

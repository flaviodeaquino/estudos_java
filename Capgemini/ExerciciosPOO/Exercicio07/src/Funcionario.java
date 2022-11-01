public class Funcionario {

    private String primeiroNome;
    private String sobrenome;
    private float salario;

    public Funcionario(String primeiroNome, String sobrenome, float salario) {
        this.setPrimeiroNome(primeiroNome);
        this.setSobrenome(sobrenome);
        this.setSalario(salario);
    }

    public void salarioAnual() {
        float salarioAno = (salario * 13);
        System.out.println("Salário anual: " + salarioAno);
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            salario = 0.0f;
        } else {
            this.salario = salario;
        }
    }
}

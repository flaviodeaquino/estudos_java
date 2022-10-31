import java.lang.Override;

public class ContaCorrente {

    private int numeroConta;
    private String nome;
    private double saldoConta;

    public ContaCorrente(int numeroConta, String nome, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    public ContaCorrente(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoConta = 0.0d;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(float valor) {
        this.saldoConta += valor;
    }

    public void saque(float valor) {
        if (this.saldoConta >= valor) {
            this.saldoConta -= valor;
        }
    }

    @Override
    public String toString() {
        return "Conta [numero = " + numeroConta + ", nome = " + nome + ", saldo = " + saldoConta + "]";
    }
}

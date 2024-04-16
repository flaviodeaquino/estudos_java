package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*
 Crie uma classe Funcionário com os seguintes atributos:

 nome
 idade
 salario // três salários devem ser guardados.

 Crie dois métodos:

 1. Para imprimir os dados
 2. Para tirar a média dos salários e imprimir o resultado
 */

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario;

    public void imprime() {
        System.out.println("--- Funcionário ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null) {
            for (int i = 0; i < salarios.length; i++) {
                System.out.println("Salário " + (i + 1) + ": " + salarios[i]);
            }
            imprimeMediaSalario(salarios);
        }
    }

    public void imprimeMediaSalario(double... salarios) {
        if (salarios != null) {
            double somaSalario = 0;
            for (double salario : salarios) {
                somaSalario += salario;
            }
            mediaSalario = somaSalario / salarios.length;
            System.out.println("Média dos Salários  : " + mediaSalario);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

}

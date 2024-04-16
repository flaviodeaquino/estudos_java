package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-222");
        Pessoa pessoa = new Pessoa("Toyota");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Eduardo");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------------");

        funcionario.imprime();
    }
}

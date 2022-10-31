public class Main {
    public static void main(String[] args) {

        // vamos criar uma nova pessoa
        Pessoa p = new Pessoa();
        p.setNomePessoa("Amanda Teixeira");
        p.setDataNascimento("01/01/1990");
        p.setAlturaPessoa(1.70f);

        p.imprimirDados();
        System.out.println("Idade: " + p.calcularIdade());
    }
}
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", "Cardoso", 1000f);
        Funcionario funcionario2 = new Funcionario("Edmar", "Pereira", 2000f);

        funcionario1.salarioAnual();
        funcionario2.salarioAnual();

        funcionario1.setSalario(funcionario1.getSalario()*1.1f);
        System.out.println(funcionario1.getSalario());
        funcionario2.setSalario(funcionario2.getSalario()*1.1f);
        System.out.println(funcionario2.getSalario());


    }
}
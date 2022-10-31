public class Main {
    public static void main(String[] args) {
        ContaCorrente j = new ContaCorrente(123, "Flávio", 100.0d);
        System.out.println(j.toString());
        j.setNome("Fiamma");
        j.deposito(100);
        System.out.println(j.toString());
        j.saque(100);
        System.out.println(j.toString());
    }
}
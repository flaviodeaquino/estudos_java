

public class Main {
    public static void main(String[] args) {

        Carro ferrari = new Carro(40, 0);
        Carro voyage = new Carro(0, 1000);

        ferrari.abastecer(20);
        voyage.abastecer(30);

        ferrari.moverCarro(200);
        voyage.moverCarro(500);

        ferrari.imprimirDadosCarro();
        voyage.imprimirDadosCarro();

        System.out.println("");

        ferrari.abastecer(20);
        voyage.abastecer(50);

        ferrari.moverCarro(1000);
        voyage.moverCarro(1000);

        ferrari.imprimirDadosCarro();
        voyage.imprimirDadosCarro();
    }
}
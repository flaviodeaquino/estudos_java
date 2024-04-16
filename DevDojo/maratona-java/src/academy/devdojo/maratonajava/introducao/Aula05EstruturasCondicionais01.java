package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado à comprar bebida alcoólica.");
        } else {
            System.out.println("Não autorizado à comprar bebida alcoólica.");
        }

        // ! (sinal de negação)

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado à comprar bebida alcoólica.");
        }
    }
}

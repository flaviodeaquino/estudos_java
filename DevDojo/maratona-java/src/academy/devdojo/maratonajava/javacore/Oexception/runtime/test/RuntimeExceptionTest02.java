package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado.");

    }

    /**
     *
     * @param a
     * @param b não pode ser 0 (zero)
     * @return
     * @throws IllegalArgumentException caso b seja 0 (zero)
     */

    private static int divisao(int a, int b) {
        if (b==0) {
            throw new IllegalArgumentException(("Argumento inválido. Não é possível realizar um divisão por 0 (zero)."));
        }

        return a/b;
    }
}

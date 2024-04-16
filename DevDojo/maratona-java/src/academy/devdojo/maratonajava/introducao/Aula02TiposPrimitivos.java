package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = (long) 10000000000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println("char" + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome +"!");
    }
}

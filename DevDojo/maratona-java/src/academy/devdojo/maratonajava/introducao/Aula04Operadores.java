package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        /*

        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);


        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);


         */

        // && (AND)  || (OR)  ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlayStation = 5000;

        boolean isPlayStationCincoCompravel = valorTotalCorrente >= valorPlayStation || valorTotalPoupanca >= valorPlayStation;

        System.out.println(isPlayStationCincoCompravel);

        //= += -= *= /= %=
        double bonus = 1800; // 1800
        //bonus = bonus + 1000;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

        contador2 = 0;
        System.out.println(++contador2);
    }

}
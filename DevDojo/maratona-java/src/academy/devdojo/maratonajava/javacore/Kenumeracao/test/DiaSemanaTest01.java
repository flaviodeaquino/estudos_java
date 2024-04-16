package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.DiaSemana;

public class DiaSemanaTest01 {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEGUNDA;

        if (dia.equals(DiaSemana.SABADO) || dia.equals(DiaSemana.DOMINGO)) {

            System.out.println("É fim de semana!");

        } else {
            System.out.println("Dia útil! Méee");
        }

        System.out.println(dia.getNome()); // Saída: "Segunda-feira"

        System.out.println(dia.isUtil()); // Saída: true


    }


}

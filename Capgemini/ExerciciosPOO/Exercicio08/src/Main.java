public class Main {
    public static void main(String[] args) {

        Data d = new Data();
        d.setDia(01);
        d.setMes(06);
        d.setAno(2001);

        System.out.println(d.Compara());

        System.out.println(d.getDia());
        System.out.println(d.getMes());
        System.out.println(d.getMesExtenso());
        System.out.println(d.getAno());
        System.out.println(d.isBissexto());



    }
}
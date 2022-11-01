public class Main {
    public static void main(String[] args) {

        Elevador e = new Elevador();
        e.setPessoasPresentes(0);

        e.inicializa(8, 10);
        e.entra();
        e.sai();
        e.sobe();
        e.desce();

    }
}
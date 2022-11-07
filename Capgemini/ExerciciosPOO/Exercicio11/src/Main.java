public class Main {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso();
        ingresso.setValorIngresso(20f);

        IngressoVip ingressoVip = new IngressoVip();
        ingressoVip.setValorAdicional(10f);

        ingresso.imprimirValor();
        ingressoVip.imprimirValorVip(ingresso.getValorIngresso());

    }
}
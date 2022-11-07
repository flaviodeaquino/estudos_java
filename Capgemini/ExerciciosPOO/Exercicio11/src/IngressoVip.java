public class IngressoVip extends Ingresso{

    private float valorAdicional;

    public IngressoVip() {
        super();
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float valorIngressoVip() {
        float ingressoVip = getValorIngresso() + (this.valorAdicional);
        return ingressoVip;
    }

    public void imprimirValorVip() {
        System.out.println("O preço do ingresso vip é R$" + valorIngressoVip());
    }

}

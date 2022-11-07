public class Ingresso {

    private float valorIngresso;

    public Ingresso(){

    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void imprimirValor() {
        System.out.println("O preço do ingresso é R$" + valorIngresso);
    }

}

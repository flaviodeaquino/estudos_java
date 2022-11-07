public class Fatura {

    private String numero;
    private String descricao;
    private int qtdCompradaItem;
    private double precoItem;

    public Fatura(String numero, String descricao, int qtdCompradaItem, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        if (qtdCompradaItem < 0) {
            qtdCompradaItem = 0;
        } else {
            this.qtdCompradaItem = qtdCompradaItem;
        }
        if (precoItem < 0) {
            precoItem = 0.0d;
        } else {
            this.precoItem = precoItem;
        }

    }

    public double getTotalFatura() {
        double totalFatura = qtdCompradaItem * precoItem;
        return totalFatura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdCompradaItem() {
        return qtdCompradaItem;
    }

    public void setQtdCompradaItem(int qtdCompradaItem) {
        this.qtdCompradaItem = qtdCompradaItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}

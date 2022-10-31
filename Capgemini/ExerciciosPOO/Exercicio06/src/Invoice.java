

public class Invoice {
    private String descricaoItem;
    private int numeroItem;
    private int qtdItem;
    private float precoItem;

    public Invoice(String descricaoItem, int numeroItem, int qtdItem, float precoItem) {
        this.setDescricaoItem(descricaoItem);
        this.setNumeroItem(numeroItem);
        this.setQtdItem(qtdItem);
        this.setPrecoItem(precoItem);
    }

    public double getInvoiceAmount() {
        return qtdItem * precoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        if (qtdItem < 0) {
            qtdItem = 0;
        } else {
            this.qtdItem = qtdItem;
        }
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        if (precoItem < 0) {
            precoItem = 0;
        } else {
            this.precoItem = precoItem;
        }
    }
}

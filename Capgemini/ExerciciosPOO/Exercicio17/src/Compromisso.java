public class Compromisso {

    private String tipo, data, nomeParticipante, telefone;

    public Compromisso(String tipo, String data, String nomeParticipante, String telefone) {
        this.tipo = tipo;
        this.data = data;
        this.nomeParticipante = nomeParticipante;
        this.telefone = telefone;
    }

    public Compromisso() {

    }

    public void imprimirCompromisso() {
        System.out.println("----- Compromisso -----");
        System.out.println("Tipo: " + tipo);
        System.out.println("Data: " + data);
        System.out.println("Nome do participante: " + nomeParticipante);
        System.out.println("Telefone do participante: " + telefone);
        System.out.println("_________________________");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

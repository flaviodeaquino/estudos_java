import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Pessoa {

    private String nomePessoa;
    private String dataNascimento;
    private float alturaPessoa;

    public void imprimirDados() {
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + alturaPessoa);
    }

    public int calcularIdade() {
        // vamos obter o ano da data de hoje
        Calendar calendario = Calendar.getInstance();
        int anoDataAtual = calendario.get(Calendar.YEAR);
        int mesDataAtual = calendario.get(Calendar.MONTH)+1;
        int diaDataAtual = calendario.get(Calendar.DAY_OF_MONTH);

        // agora vamos obter o ano de nascimento da pessoa
        int dian = Integer.valueOf(dataNascimento.substring(0,2));
        int mesn = Integer.valueOf(dataNascimento.substring(3,5));
        int anon = Integer.valueOf(dataNascimento.substring(6,10));

        // Idade.
        int idade;

        if (mesn < mesDataAtual || (mesn == mesDataAtual && dian <= diaDataAtual))
            idade = anoDataAtual - anon;
        else
            idade = (anoDataAtual - anon)-1;

        return (idade);
    }


    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAlturaPessoa() {
        return alturaPessoa;
    }

    public void setAlturaPessoa(float alturaPessoa) {
        this.alturaPessoa = alturaPessoa;
    }
}

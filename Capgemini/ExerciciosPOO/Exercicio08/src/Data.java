import java.util.Calendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.preencheData(dia, mes, ano);
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }
        int ultimoDiaDoMes = 31; // por padrao são 31 dias

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }
        return true;
    }

    void preencheData(int dia, int mes, int ano) {
        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " não existe!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public int Compara() {
        Calendar c = Calendar.getInstance();

        if (dia == c.get(Calendar.DAY_OF_MONTH) && mes == c.get(Calendar.MONTH) && ano == c.get(Calendar.YEAR)) {
            return 0;
        } else if (ano < c.get(Calendar.YEAR)) {
            return 1;
        } else if (ano == c.get(Calendar.YEAR) && mes < c.get(Calendar.MONTH)) {
            return 1;
        } else if (ano == c.get(Calendar.YEAR) && mes == c.get(Calendar.MONTH) && dia < c.get(Calendar.DAY_OF_MONTH)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMesExtenso() {
        if (mes == 01) {
            return "Janeiro";
        } else if (mes == 02) {
            return "Fevereiro";
        } else if (mes == 03) {;
            return "Março";
        } else if (mes == 04) {
            return "Abril";
        } else if (mes == 05) {
            return "Maio";
        } else if (mes == 06) {
            return "Junho";
        } else if (mes == 07) {
            return "Julho";
        } else if (mes == 8) {
            return "Agosto";
        } else if (mes == 9) {
            return "Setembro";
        } else if (mes == 10) {
            return "Outubro";
        } else if (mes == 11) {
            return "Novembro";
        } else if (mes == 12) {
            return "Dezembro";
        }
        return null;
    }

    public boolean isBissexto() {
        if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public class clone {
        Data cloneData;

        {
            cloneData = new Data();
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}

import java.util.Calendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido. O dia será igual a 01.");
            this.dia = 01;
        }

        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. O mês será igual a 01.");
            this.mes = 01;
        }

        if (ano >= 1) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. O ano será igual a 0001");
            this.ano = 0001;
        }

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

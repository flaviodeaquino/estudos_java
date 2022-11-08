import java.util.Scanner;

public class Agenda {

    private Compromisso compromissos[];
    Scanner scan = new Scanner(System.in);

    public Agenda(int quantidade) {
        compromissos = new Compromisso[quantidade];
    }

    public void agendarCompromisso(String tipo, String data, String nomeParticipante, String telefone) {
        boolean agendado = false;

        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] == null) {
                Compromisso c = new Compromisso(tipo, data, nomeParticipante, telefone);
                compromissos[i] = c;
                agendado = true;
                break;
            }
        }
        if (agendado) {
            System.out.println("\nCompromisso agendado com sucesso.");
        } else {
            System.out.println("\nCompromisso não agendado. Agenda cheia.");
        }
    }

    public void removerCompromisso(String tipo, String data, String nomeParticipante) {
        boolean removido = false;

        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] != null) {
                if (compromissos[i].getTipo().equals(tipo) && compromissos[i].getData().equals(data)
                && compromissos[i].getNomeParticipante().equals(nomeParticipante)) {
                    compromissos[i] = null;
                    removido = true;
                    break;
                }
            }
        }
        if (removido) {
            System.out.println("Compromisso removido da agenda.");
        } else {
            System.out.println("Não foi possível remover compromisso. Compromisso não encontrado.");
        }
    }

    public void encontrarCompromisso(String tipo, String data, String nomeParticipante) {
        boolean encontrado = false;

        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] != null) {
                if (compromissos[i].getTipo().equals(tipo) && compromissos[i].getData().equals(data)
                        && compromissos[i].getNomeParticipante().equals(nomeParticipante)) {
                    compromissos[i].imprimirCompromisso();
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado) {

        } else {
            System.out.println("Compromisso não encontrado.");
        }

    }

//    public void alterarCompromisso(String tipo, String data, String nomeParticipante, String telefone) {
//        boolean alterado = false;
//
//        for (int i = 0; i < compromissos.length; i++) {
//            if (compromissos[i] != null) {
//                if (compromissos[i].getTipo().equals(tipo) && compromissos[i].getData().equals(data)
//                        && compromissos[i].getNomeParticipante().equals(nomeParticipante)) {
//                    System.out.println("\nDigite o tipo: ");
//
//
//                    alterado = true;
//                    break;
//                }
//            }
//        }
//
//        if (alterado) {
//            System.out.println("Compromisso alterado com sucesso.");
//        } else {
//            System.out.println("Compromisso não encontrado.");
//        }
//
//    }

    public void exibirCompromissosParticipante(String nomeParticipante) {
        int cont = 0;
        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] != null) {
                if (compromissos[i].getNomeParticipante().equals(nomeParticipante)) {
                    compromissos[i].imprimirCompromisso();
                    cont++;
                }
            }
        }

        if (cont > 0) {

        } else {
            System.out.println("Compromisso não encontrado.");
        }
    }

    public void exibirCompromissoData(String data) {
        int cont = 0;
        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] != null) {
                if (compromissos[i].getData().equals(data)) {
                    compromissos[i].imprimirCompromisso();
                    cont++;
                }
            }
        }

        if (cont > 0) {

        } else {
            System.out.println("Compromisso não encontrado.");
        }
    }


}

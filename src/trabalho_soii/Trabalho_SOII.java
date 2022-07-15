/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_soii;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author eric_
 */
public class Trabalho_SOII {
    //static LinkedList<Segmento> Programas=new LinkedList<>();

    /**
     * @param args the command line arguments
     */
    static int tam_memoria = 255;//tamanho da memória
    static Programa memoria[];//Declarando a memória do PC
    static Lista_Encadeada lista = new Lista_Encadeada();//Declarando lista encadeada usada para ver áreas livres
    static LinkedList<Programa> programas = new LinkedList<>();
    static Estrategias_alocacao estrategia;
    static LinkedList<Integer> tamanhoFalse = new LinkedList<>();
    
    static void load() {
        programas.add(new Programa(5, "A", false));
        programas.add(new Programa(6, "B", false));
        programas.add(new Programa(4, "C", false));
        programas.add(new Programa(6, "D", false));
        programas.add(new Programa(3, "E", false));
    }

    static void desalocar(String nome) {//Desalocar um programa da memória
        for (int i = 0; i < tam_memoria; i++) {
            if (memoria[i] != null) {
                if (memoria[i].getNome().equals(nome)) {
                    memoria[i] = null;
                    //System.out.println(memoria[i]);
                }
            }
        }
        AtualizarSegmentos();
        Estrategias_alocacao.PA.setText("Total PA: "+Trabalho_SOII.lista.TotalProgramasAlocados());
        Estrategias_alocacao.inf.setText("Quantidade EL: "+Trabalho_SOII.lista.QuantidadeEspaçosVazios());
        Estrategias_alocacao.tam.setText("Tamanho EL: "+Trabalho_SOII.lista.TamanhoEspaçosVazios());
        Estrategias_alocacao.total.setText("Total EL: "+Trabalho_SOII.lista.TotalTamanhoEspaçosVazios());
    }
    
    static void desalocarTudo() {//Desalocar todos os programas da memória
        for (int i = 0; i < tam_memoria; i++) {
            if (memoria[i] != null) {
                  memoria[i] = null;
            }
        }
        AtualizarSegmentos();
        Estrategias_alocacao.PA.setText("Total PA: "+Trabalho_SOII.lista.TotalProgramasAlocados());
        Estrategias_alocacao.inf.setText("Quantidade EL: "+Trabalho_SOII.lista.QuantidadeEspaçosVazios());
        Estrategias_alocacao.tam.setText("Tamanho EL: "+Trabalho_SOII.lista.TamanhoEspaçosVazios());
        Estrategias_alocacao.total.setText("Total EL: "+Trabalho_SOII.lista.TotalTamanhoEspaçosVazios());
    }

    static void first_fit(Programa progama) {
        
        AtualizarSegmentos();
        int posicao = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.getSegmento(i).getAlocado_Nao_alocado() == false) {
                if (lista.getSegmento(i).getTamanho() >= progama.getTamanho()) {
                    posicao = lista.getSegmento(i).getInicio_endereco();
                    for (int j = posicao; j < posicao + progama.getTamanho(); j++) {
                        memoria[j] = progama;
                    }
                    lista.getSegmento(i).setAlocado_Nao_alocado(true);
                    break;
                } else {
                    System.out.println("Não a espaço para alocar!");
                }
            }
        }
        
        AtualizarSegmentos();

    }

    static void best_fit(Programa programa) {
        AtualizarSegmentos();
        lista.sortBest();
        int posicao = 0;
        boolean flag = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.getSegmento(i).getAlocado_Nao_alocado() == false) {
                if (lista.getSegmento(i).getTamanho() >= programa.getTamanho()) {
                    posicao = lista.getSegmento(i).getInicio_endereco();
                    for (int j = posicao; j < posicao + programa.getTamanho(); j++) {
                        memoria[j] = programa;
                    }
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {//se nao houver espaco em nenhum segmento de blocos
            System.out.println("Não a espaço para alocar!");
            return;
        }

        AtualizarSegmentos();

        lista.Imprime();

    }

    static void ImprimirMemoria() {
        System.out.println("Imprimindo Memoria");
        for (int i = 0; i < tam_memoria; i++) {
            if (memoria[i] != null) {
                System.out.print(memoria[i].getNome() + " " + memoria[i].getTamanho() + "  posicao:" + i + "\n");
            } else {
                System.out.println(memoria[i] + "  posicao:" + i);
            }
        }
    }

    static void AtualizarSegmentos() {
        lista.limpar();
        for (int i = 0; i < tam_memoria; i++) {
            try {
                Segmento segmento;

                if (!(memoria[i] == null)) {
                    segmento = new Segmento(memoria[i].getAlocado(), i, memoria[i].getTamanho());
                    i += memoria[i].getTamanho() - 1;
                } else {
                    int count = 0;
                    int j = i;
                    while (memoria[i] == null) {
                        count++;
                        i++;
                        if (i == tam_memoria) {
                            break;
                        }
                    }

                    i--;
                    segmento = new Segmento(false, j, count);
                }

                lista.add(segmento);
            } catch (Exception e) {
            }
        }
    }

    static void worst_fit(Programa programa) {
        AtualizarSegmentos();
        lista.sortWorst();
        int posicao = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.getSegmento(i).getAlocado_Nao_alocado() == false) {
                if (lista.getSegmento(i).getTamanho() >= programa.getTamanho()) {
                    posicao = lista.getSegmento(i).getInicio_endereco();
                    for (int j = posicao; j < posicao + programa.getTamanho(); j++) {
                        memoria[j] = programa;
                    }
                    break;
                } else {
                    System.out.println("Não há espaço para alocar!");
                }
            }
        }
        //lista.limpar();
        AtualizarSegmentos();

        //lista.Imprime();
    }
    static void Atualizar(){
        estrategia.Setar(memoria);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        tam_memoria=Integer.parseInt(JOptionPane.showInputDialog("Informe O tamanho da Memoria Acima de 0 < 288","288"));
        memoria=new Programa[tam_memoria];
        estrategia = new Estrategias_alocacao();
        estrategia.setVisible(true);
        
        AtualizarSegmentos();
        Estrategias_alocacao.PA.setText("Total PA: "+Trabalho_SOII.lista.TotalProgramasAlocados());
        Estrategias_alocacao.inf.setText("Quantidade EL: "+Trabalho_SOII.lista.QuantidadeEspaçosVazios());
        Estrategias_alocacao.tam.setText("Tamanho EL: "+Trabalho_SOII.lista.TamanhoEspaçosVazios());
        Estrategias_alocacao.total.setText("Total EL: "+Trabalho_SOII.lista.TotalTamanhoEspaçosVazios());
    }

}

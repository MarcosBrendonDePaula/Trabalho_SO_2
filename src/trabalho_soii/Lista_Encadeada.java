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
 * @author MarcosB
 */
public class Lista_Encadeada {

    private LinkedList<Segmento> lista_encadeada;

    Lista_Encadeada() {
        lista_encadeada = new LinkedList<>();
    }

    public void add(Segmento Atual) {
        lista_encadeada.add(Atual);
    }

    public int size() {
        return lista_encadeada.size();
    }

    public Segmento getSegmento(int i) {
        return lista_encadeada.get(i);
    }

    public void limpar() {
        lista_encadeada.clear();
    }

    public void sortWorst() {
        Segmento aux;
        for (int fim = lista_encadeada.size() - 1; fim > 0; fim--) {
            for (int i = 0; i < lista_encadeada.size(); i++) {
                if ((i + 1) == lista_encadeada.size()) {
                    break;
                }
                if (lista_encadeada.get(i).getTamanho() < lista_encadeada.get(i + 1).getTamanho()) {
                    aux = new Segmento(lista_encadeada.get(i).getAlocado_Nao_alocado(), lista_encadeada.get(i).getInicio_endereco(), lista_encadeada.get(i).getTamanho());

                    lista_encadeada.get(i).setAlocado_Nao_alocado(lista_encadeada.get(i + 1).getAlocado_Nao_alocado());
                    lista_encadeada.get(i).setInicio_endereco(lista_encadeada.get(i + 1).getInicio_endereco());
                    lista_encadeada.get(i).setTamanho(lista_encadeada.get(i + 1).getTamanho());

                    lista_encadeada.get(i + 1).setAlocado_Nao_alocado(aux.getAlocado_Nao_alocado());
                    lista_encadeada.get(i + 1).setInicio_endereco(aux.getInicio_endereco());
                    lista_encadeada.get(i + 1).setTamanho(aux.getTamanho());
                }

            }
        }
    }

    public void sortBest() {
        Segmento aux;
        for (int i = 0; i < lista_encadeada.size(); i++) {
            for (int j = 0; j < lista_encadeada.size() - 1; j++) {
                if (lista_encadeada.get(j).getTamanho() > lista_encadeada.get(j + 1).getTamanho()) {
                    aux = new Segmento(lista_encadeada.get(j).getAlocado_Nao_alocado(), lista_encadeada.get(j).getInicio_endereco(), lista_encadeada.get(j).getTamanho());
                    lista_encadeada.get(j).setAlocado_Nao_alocado(lista_encadeada.get(j + 1).getAlocado_Nao_alocado());
                    lista_encadeada.get(j).setInicio_endereco(lista_encadeada.get(j + 1).getInicio_endereco());
                    lista_encadeada.get(j).setTamanho(lista_encadeada.get(j + 1).getTamanho());

                    lista_encadeada.get(j + 1).setAlocado_Nao_alocado(aux.getAlocado_Nao_alocado());
                    lista_encadeada.get(j + 1).setInicio_endereco(aux.getInicio_endereco());
                    lista_encadeada.get(j + 1).setTamanho(aux.getTamanho());
                }
            }
        }
    }

    public void Imprime() {
        System.out.println("\nLista encadeada:");
        for (int i = 0; i < lista_encadeada.size(); i++) {
            try {
                if (i == lista_encadeada.size() - 1) {
                    System.out.print(lista_encadeada.get(i).getAlocado_Nao_alocado() + " " + lista_encadeada.get(i).getInicio_endereco() + " " + lista_encadeada.get(i).getTamanho() + " -> X");
                } else {
                    System.out.print(lista_encadeada.get(i).getAlocado_Nao_alocado() + " " + lista_encadeada.get(i).getInicio_endereco() + " " + lista_encadeada.get(i).getTamanho() + " -> ");
                }
            } catch (Exception e) {

            }
        }
        System.out.print("\n");
    }
    
    public void ImprimeIterface() {
        String Lista = "";
        for (int i = 0; i < lista_encadeada.size(); i++) {
            try {
                if (i == lista_encadeada.size() - 1) {
                    Lista = Lista + lista_encadeada.get(i).getAlocado_Nao_alocado() + "/ " + lista_encadeada.get(i).getInicio_endereco() + "/ " + lista_encadeada.get(i).getTamanho() + " -> X";
                    
                } else {
                    if((i+1) % 10 == 0)
                        Lista = Lista + lista_encadeada.get(i).getAlocado_Nao_alocado() + "/ " + lista_encadeada.get(i).getInicio_endereco() + "/ " + lista_encadeada.get(i).getTamanho() + " -> \n";
                    else
                        Lista = Lista + lista_encadeada.get(i).getAlocado_Nao_alocado() + "/ " + lista_encadeada.get(i).getInicio_endereco() + "/ " + lista_encadeada.get(i).getTamanho() + " -> ";
                }
            } catch (Exception e) {

            }
        }
        JOptionPane.showMessageDialog(null, Lista);
        System.out.print("\n");
    }
    
    public int QuantidadeEspaçosVazios(){
        int quantidadeFalse = 0;
        for(int i =0; i < lista_encadeada.size(); i++)
            if(lista_encadeada.get(i).getAlocado_Nao_alocado() == false)
                quantidadeFalse++;
        
        return quantidadeFalse;
    }
    
    public int TotalTamanhoEspaçosVazios(){
        int quantidadeTotal = 0;
        for(int i =0; i < lista_encadeada.size(); i++)
            if(lista_encadeada.get(i).getAlocado_Nao_alocado() == false)
                quantidadeTotal += lista_encadeada.get(i).getTamanho();
        
        return quantidadeTotal;
    }
    
    public int TotalProgramasAlocados(){
        int quantidadeTotal = 0;
        for(int i =0; i < lista_encadeada.size(); i++)
            if(lista_encadeada.get(i).getAlocado_Nao_alocado() == true)
                quantidadeTotal ++;
        
        return quantidadeTotal;
    }
    
    public String TamanhoEspaçosVazios(){
        Trabalho_SOII.tamanhoFalse.clear();
        String concatenar = "";
        for(int i =0; i < lista_encadeada.size(); i++)
            if(lista_encadeada.get(i).getAlocado_Nao_alocado() == false)
                Trabalho_SOII.tamanhoFalse.add(lista_encadeada.get(i).getTamanho());
        
         for(int i =0; i < Trabalho_SOII.tamanhoFalse.size(); i++){
             if(i == Trabalho_SOII.tamanhoFalse.size()-1)
                 concatenar = concatenar + Trabalho_SOII.tamanhoFalse.get(i) + "  ";
             else
                concatenar = concatenar + Trabalho_SOII.tamanhoFalse.get(i) + " / ";
         }
        
        System.out.println(concatenar);
        return concatenar;
        
    }

}

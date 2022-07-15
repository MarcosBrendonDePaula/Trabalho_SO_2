/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_soii;

/**
 *
 * @author eric_
 */
public class Segmento {
    private boolean Alocado_Nao_alocado;
    private int inicio_endereco;
    private int Tamanho;

    public Segmento(boolean Alocado_Nao_alocado, int inicio_endereco, int Tamanho) {
        this.Alocado_Nao_alocado = Alocado_Nao_alocado;
        this.inicio_endereco = inicio_endereco;
        this.Tamanho = Tamanho;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }

    public boolean getAlocado_Nao_alocado() {
        return Alocado_Nao_alocado;
    }

    public void setAlocado_Nao_alocado(boolean Alocado_Nao_alocado) {
        this.Alocado_Nao_alocado = Alocado_Nao_alocado;
    }

    public int getInicio_endereco() {
        return inicio_endereco;
    }

    public void setInicio_endereco(int inicio_endereco) {
        this.inicio_endereco = inicio_endereco;
    }

}

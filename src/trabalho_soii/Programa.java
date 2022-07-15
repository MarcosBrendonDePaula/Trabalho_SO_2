/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_soii;

/**
 *
 * @author MarcosB
 */
public class Programa {
    private int tamanho;
    private String nome;
    private boolean alocado;

    public int getTamanho() {
        return tamanho;
    }

    public Programa(int tamanho, String nome, boolean alocado) {
        this.tamanho = tamanho;
        this.nome = nome;
        this.alocado = alocado;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getAlocado() {
        return alocado;
    }

    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_soii;

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author eric_
 */
public class Exemplos {
    static LinkedList<Programa> exemplos = new LinkedList<>();
    static int PA_First = 0;
    static int PA_Best = 0;
    static int PA_Worst = 0;
    
    static void Exemplos1() {
        exemplos.clear();
        exemplos.add(new Programa(5, "A", true));
        exemplos.add(new Programa(3, "B", true));
        exemplos.add(new Programa(7, "C", true));
        exemplos.add(new Programa(6, "D", true));
        exemplos.add(new Programa(2, "E", true));
        exemplos.add(new Programa(8, "F", true));
        exemplos.add(new Programa(5, "G", true));
        exemplos.add(new Programa(1, "H", true));
        exemplos.add(new Programa(7, "I", true));
        exemplos.add(new Programa(9, "J", true));
        exemplos.add(new Programa(11, "K", true));
        exemplos.add(new Programa(3, "L", true));
        exemplos.add(new Programa(4, "M", true));
        exemplos.add(new Programa(15, "N", true));
        exemplos.add(new Programa(3, "O", true));
        exemplos.add(new Programa(5, "P", true));
        exemplos.add(new Programa(8, "Q", true));
        exemplos.add(new Programa(9, "R", true));
        exemplos.add(new Programa(7, "S", true));
        exemplos.add(new Programa(2, "T", true));
        exemplos.add(new Programa(1, "U", true));
        exemplos.add(new Programa(16, "V", true));
        exemplos.add(new Programa(3, "X", true));
        exemplos.add(new Programa(5, "W", true));
        exemplos.add(new Programa(6, "Y", true));
        exemplos.add(new Programa(12, "Z", true));
    }
    
    static void Exemplos2() {
        exemplos.clear();
        exemplos.add(new Programa(12, "A", true));
        exemplos.add(new Programa(5, "B", true));
        exemplos.add(new Programa(12, "C", true));
        exemplos.add(new Programa(14, "D", true));
        exemplos.add(new Programa(16, "E", true));
        exemplos.add(new Programa(4, "F", true));
        exemplos.add(new Programa(6, "G", true));
        exemplos.add(new Programa(8, "H", true));
        exemplos.add(new Programa(9, "I", true));
        exemplos.add(new Programa(14, "J", true));
        exemplos.add(new Programa(15, "K", true));
        exemplos.add(new Programa(17, "L", true));
        exemplos.add(new Programa(7, "M", true));
        exemplos.add(new Programa(6, "N", true));
        exemplos.add(new Programa(5, "O", true));
        exemplos.add(new Programa(5, "P", true));
        exemplos.add(new Programa(12, "Q", true));
        exemplos.add(new Programa(13, "R", true));
        exemplos.add(new Programa(6, "S", true));
        exemplos.add(new Programa(3, "T", true));
        exemplos.add(new Programa(4, "U", true));
        exemplos.add(new Programa(1, "V", true));
        exemplos.add(new Programa(16, "X", true));
        exemplos.add(new Programa(17, "W", true));
        exemplos.add(new Programa(12, "Y", true));
        exemplos.add(new Programa(10, "Z", true));
    }
    
    static void Exemplos3() {
        exemplos.clear();
        exemplos.add(new Programa(24, "A", true));
        exemplos.add(new Programa(12, "B", true));
        exemplos.add(new Programa(12, "C", true));
        exemplos.add(new Programa(12, "D", true));
        exemplos.add(new Programa(12, "E", true));
        exemplos.add(new Programa(12, "F", true));
        exemplos.add(new Programa(24, "G", true));
        exemplos.add(new Programa(12, "H", true));
        exemplos.add(new Programa(12, "I", true));
        exemplos.add(new Programa(12, "J", true));
        exemplos.add(new Programa(24, "K", true));
        exemplos.add(new Programa(12, "L", true));
        exemplos.add(new Programa(12, "M", true));
        exemplos.add(new Programa(12, "N", true));
        exemplos.add(new Programa(12, "O", true));
        exemplos.add(new Programa(24, "P", true));
        exemplos.add(new Programa(12, "Q", true));
        exemplos.add(new Programa(12, "R", true));
        exemplos.add(new Programa(12, "S", true));
        exemplos.add(new Programa(12, "T", true));
        exemplos.add(new Programa(24, "U", true));
        exemplos.add(new Programa(12, "V", true));
        exemplos.add(new Programa(12, "X", true));
        exemplos.add(new Programa(12, "W", true));
        exemplos.add(new Programa(12, "Y", true));
        exemplos.add(new Programa(12, "Z", true));
    }
    
    static void Exemplos4() {
        exemplos.clear();
        exemplos.add(new Programa(26, "A", true));
        exemplos.add(new Programa(27, "B", true));
        exemplos.add(new Programa(25, "C", true));
        exemplos.add(new Programa(24, "D", true));
        exemplos.add(new Programa(23, "E", true));
        exemplos.add(new Programa(22, "F", true));
        exemplos.add(new Programa(21, "G", true));
        exemplos.add(new Programa(8, "H", true));
        exemplos.add(new Programa(9, "I", true));
        exemplos.add(new Programa(20, "J", true));
        exemplos.add(new Programa(19, "K", true));
        exemplos.add(new Programa(18, "L", true));
        exemplos.add(new Programa(15, "M", true));
        exemplos.add(new Programa(14, "N", true));
        exemplos.add(new Programa(12, "O", true));
        exemplos.add(new Programa(10, "P", true));
        exemplos.add(new Programa(5, "Q", true));
        exemplos.add(new Programa(4, "R", true));
        exemplos.add(new Programa(21, "S", true));
        exemplos.add(new Programa(7, "T", true));
        exemplos.add(new Programa(10, "U", true));
        exemplos.add(new Programa(12, "V", true));
        exemplos.add(new Programa(14, "X", true));
        exemplos.add(new Programa(5, "W", true));
        exemplos.add(new Programa(6, "Y", true));
        exemplos.add(new Programa(2, "Z", true));
    }
    
    static void Exemplos5() {
        exemplos.clear();
        exemplos.add(new Programa(5, "A", true));
        exemplos.add(new Programa(6, "B", true));
        exemplos.add(new Programa(14, "C", true));
        exemplos.add(new Programa(13, "D", true));
        exemplos.add(new Programa(19, "E", true));
        exemplos.add(new Programa(12, "F", true));
        exemplos.add(new Programa(14, "G", true));
        exemplos.add(new Programa(4, "H", true));
        exemplos.add(new Programa(3, "I", true));
        exemplos.add(new Programa(6, "J", true));
        exemplos.add(new Programa(6, "K", true));
        exemplos.add(new Programa(8, "L", true));
        exemplos.add(new Programa(9, "M", true));
        exemplos.add(new Programa(14, "N", true));
        exemplos.add(new Programa(17, "O", true));
        exemplos.add(new Programa(2, "P", true));
        exemplos.add(new Programa(2, "Q", true));
        exemplos.add(new Programa(4, "R", true));
        exemplos.add(new Programa(7, "S", true));
        exemplos.add(new Programa(5, "T", true));
        exemplos.add(new Programa(9, "U", true));
        exemplos.add(new Programa(7, "V", true));
        exemplos.add(new Programa(1, "X", true));
        exemplos.add(new Programa(16, "W", true));
        exemplos.add(new Programa(14, "Y", true));
        exemplos.add(new Programa(5, "Z", true));
    }
    
    static void Exemplos6() {
        exemplos.clear();
        exemplos.add(new Programa(3, "A", true));
        exemplos.add(new Programa(2, "B", true));
        exemplos.add(new Programa(2, "C", true));
        exemplos.add(new Programa(3, "D", true));
        exemplos.add(new Programa(5, "E", true));
        exemplos.add(new Programa(6, "F", true));
        exemplos.add(new Programa(7, "G", true));
        exemplos.add(new Programa(6, "H", true));
        exemplos.add(new Programa(4, "I", true));
        exemplos.add(new Programa(15, "J", true));
        exemplos.add(new Programa(12, "K", true));
        exemplos.add(new Programa(15, "L", true));
        exemplos.add(new Programa(5, "M", true));
        exemplos.add(new Programa(9, "N", true));
        exemplos.add(new Programa(8, "O", true));
        exemplos.add(new Programa(1, "P", true));
        exemplos.add(new Programa(16, "Q", true));
        exemplos.add(new Programa(12, "R", true));
        exemplos.add(new Programa(10, "S", true));
        exemplos.add(new Programa(6, "T", true));
        exemplos.add(new Programa(9, "U", true));
        exemplos.add(new Programa(2, "V", true));
        exemplos.add(new Programa(5, "X", true));
        exemplos.add(new Programa(10, "W", true));
        exemplos.add(new Programa(11, "Y", true));
        exemplos.add(new Programa(5, "Z", true));
    }
    
    static void Exemplos7() {
        exemplos.clear();
        exemplos.add(new Programa(4, "A", true));
        exemplos.add(new Programa(16, "B", true));
        exemplos.add(new Programa(10, "C", true));
        exemplos.add(new Programa(6, "D", true));
        exemplos.add(new Programa(13, "E", true));
        exemplos.add(new Programa(12, "F", true));
        exemplos.add(new Programa(13, "G", true));
        exemplos.add(new Programa(6, "H", true));
        exemplos.add(new Programa(12, "I", true));
        exemplos.add(new Programa(9, "J", true));
        exemplos.add(new Programa(12, "K", true));
        exemplos.add(new Programa(12, "L", true));
        exemplos.add(new Programa(14, "M", true));
        exemplos.add(new Programa(7, "N", true));
        exemplos.add(new Programa(5, "O", true));
        exemplos.add(new Programa(13, "P", true));
        exemplos.add(new Programa(5, "Q", true));
        exemplos.add(new Programa(3, "R", true));
        exemplos.add(new Programa(9, "S", true));
        exemplos.add(new Programa(12, "T", true));
        exemplos.add(new Programa(13, "U", true));
        exemplos.add(new Programa(14, "V", true));
        exemplos.add(new Programa(5, "X", true));
        exemplos.add(new Programa(2, "W", true));
        exemplos.add(new Programa(3, "Y", true));
        exemplos.add(new Programa(1, "Z", true));
    }
    
    static void Exemplos8() {
        exemplos.clear();
        exemplos.add(new Programa(13, "A", true));
        exemplos.add(new Programa(6, "B", true));
        exemplos.add(new Programa(9, "C", true));
        exemplos.add(new Programa(5, "D", true));
        exemplos.add(new Programa(3, "E", true));
    }
    
    static void Exemplos9() {
        exemplos.clear();
        exemplos.add(new Programa(15, "A", true));
        exemplos.add(new Programa(12, "B", true));
        exemplos.add(new Programa(13, "C", true));
        exemplos.add(new Programa(14, "D", true));
        exemplos.add(new Programa(12, "E", true));
        exemplos.add(new Programa(10, "F", true));
        exemplos.add(new Programa(9, "G", true));
        exemplos.add(new Programa(5, "H", true));
        exemplos.add(new Programa(7, "I", true));
        exemplos.add(new Programa(2, "J", true));
        exemplos.add(new Programa(14, "K", true));
        exemplos.add(new Programa(13, "L", true));
        exemplos.add(new Programa(10, "M", true));
        exemplos.add(new Programa(11, "N", true));
        exemplos.add(new Programa(15, "O", true));
        exemplos.add(new Programa(5, "P", true));
        exemplos.add(new Programa(5, "Q", true));
        exemplos.add(new Programa(7, "R", true));
        exemplos.add(new Programa(9, "S", true));
        exemplos.add(new Programa(10, "T", true));
        exemplos.add(new Programa(11, "U", true));
        exemplos.add(new Programa(14, "V", true));
        exemplos.add(new Programa(15, "X", true));
        exemplos.add(new Programa(17, "W", true));
        exemplos.add(new Programa(6, "Y", true));
        exemplos.add(new Programa(8, "Z", true));
    }
    
    static void Exemplos10() {
        exemplos.clear();
        Random gerador = new Random();
        exemplos.add(new Programa((gerador.nextInt(15)+1), "A", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "B", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "C", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "D", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "E", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "F", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "G", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "H", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "I", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "J", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "K", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "L", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "M", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "N", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "O", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "P", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "Q", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "R", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "S", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "T", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "U", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "V", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "X", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "W", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "Y", true));
        exemplos.add(new Programa((gerador.nextInt(15)+1), "Z", true));
    }
    
    static void Teste(){
        Random gerador = new Random();
        LinkedList<Integer> salva = new LinkedList<>();
        int a;
        PA_First = 0;
        PA_Best = 0;
        PA_Worst = 0;
        for(int roda = 0; roda < 100; roda++){
            Exemplos10();
            Trabalho_SOII.desalocarTudo();
            salva.clear();
            for (int i = 0; i < exemplos.size(); i++) {
                  a = gerador.nextInt(exemplos.size());
                  while(salva.contains(a) == true){
                        a = gerador.nextInt(exemplos.size());
                  }
                  salva.add(a);
                  Trabalho_SOII.first_fit(exemplos.get(a));
                  a = gerador.nextInt(exemplos.size());
                  Trabalho_SOII.desalocar(exemplos.get(a).getNome());
            }
            Trabalho_SOII.Atualizar();
            PA_First+=Trabalho_SOII.lista.TotalProgramasAlocados();
        }
        
        for(int roda = 0; roda < 100; roda++){
            Exemplos10();
            Trabalho_SOII.desalocarTudo();
            salva.clear();
            for (int i = 0; i < exemplos.size(); i++) {
                  a = gerador.nextInt(exemplos.size());
                  while(salva.contains(a) == true){
                        a = gerador.nextInt(exemplos.size());
                  }
                  salva.add(a);
                  Trabalho_SOII.best_fit(exemplos.get(a));
                  a = gerador.nextInt(exemplos.size());
                  Trabalho_SOII.desalocar(exemplos.get(a).getNome());
            }
            Trabalho_SOII.Atualizar();
            PA_Best+=Trabalho_SOII.lista.TotalProgramasAlocados();
        }
        
        for(int roda = 0; roda < 100; roda++){
            Exemplos10();
            Trabalho_SOII.desalocarTudo();
            salva.clear();
            for (int i = 0; i < exemplos.size(); i++) {
                  a = gerador.nextInt(exemplos.size());
                  while(salva.contains(a) == true){
                        a = gerador.nextInt(exemplos.size());
                  }
                  salva.add(a);
                  Trabalho_SOII.worst_fit(exemplos.get(a));
                  a = gerador.nextInt(exemplos.size());
                  Trabalho_SOII.desalocar(exemplos.get(a).getNome());
            }
            Trabalho_SOII.Atualizar();
            PA_Worst+=Trabalho_SOII.lista.TotalProgramasAlocados();
        }
        Trabalho_SOII.desalocarTudo();
        Trabalho_SOII.Atualizar();
        JOptionPane.showMessageDialog(null, "Total de programas alocados \n" +"First-fit: "+PA_First + "\n" + "Best-fit: "+PA_Best + "\n" + "Worst-fit: "+PA_Worst);
    }
    
}

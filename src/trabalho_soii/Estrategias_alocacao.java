/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_soii;

import java.awt.Color;
import javafx.scene.control.RadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author eric_
 */
public class Estrategias_alocacao extends javax.swing.JFrame {
    static private JTextField[] Blocos;
    static private JLabel[] posicoes;
    static public Programa pp=null;
    static JLabel inf=new JLabel();
    static JLabel tam=new JLabel();
    static JLabel total=new JLabel();
    JLabel legendas=new JLabel();
    JLabel leg1=new JLabel();
    JLabel leg2=new JLabel();
    static JLabel PA=new JLabel();
    static public Thread aloc;
    /**
     * Creates new form Estrategias_alocacao
     */
    Runnable b1=new Runnable() {
        @Override
        public void run() {
            
        }
    };
    
    public Estrategias_alocacao() {
        //getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
        aloc=new Thread(b1);
        Blocos=new JTextField[800];
        posicoes=new JLabel[800];
        for(int i=0;i<Trabalho_SOII.tam_memoria;i++){
            Blocos[i]=new JTextField();
        }
        //setando colunas
        int count=0;
        for(int i=150;i<500;i+=20){
            posicoes[count]=new JLabel();
            posicoes[count].setLocation(i, 60);
            posicoes[count].setText(" "+count+"");
            posicoes[count].setSize(20, 20);
            add(posicoes[count]);
            count++;
        }
        //setando linhas
        for(int A=80;A<400;A+=20){
            posicoes[count]=new JLabel();
            posicoes[count].setLocation(125, A);
            posicoes[count].setText(" "+((count-18)*18)+"");
            posicoes[count].setSize(40, 20);
            add(posicoes[count]);
            count++;
        }
        
        
        count=0;
        for(int A=80;A<400;A+=20)
            for(int i=150;i<500;i+=20){
                if(count<Trabalho_SOII.tam_memoria){
                Blocos[count].setLocation(i,A);
                Blocos[count].setText("");
                Blocos[count].setSize(20, 20);
                count++;
                }else
                    break;
            }
        
        legendas.setText("Legendas: ");
        legendas.setLocation(515,340);
        legendas.setSize(300, 20);
        this.add(legendas);
        leg1.setText("EL: espaços livres");
        leg1.setLocation(515,360);
        leg1.setSize(300, 20);
        this.add(leg1);
        leg2.setText("PA: programas alocados");
        leg2.setLocation(515,380);
        leg2.setSize(300, 20);
        this.add(leg2);
        
        PA.setText("Total PA: "+"ATUALIZE");
        PA.setLocation(515,80);
        PA.setSize(300, 20);
        this.add(PA);
        inf.setText("Quantidade EL: "+"ATUALIZE");
        inf.setLocation(515,100);
        inf.setSize(300, 20);
        this.add(inf);
        tam.setText("Tamanho EL: "+"ATUALIZE");
        tam.setLocation(515, 120);
        tam.setSize(300, 20);
        this.add(tam);
        total.setText("Total EL: "+"ATUALIZE");
        total.setLocation(515, 140);
        total.setSize(300, 20);
        this.add(total);
        
        for(int i=0;i<Trabalho_SOII.tam_memoria;i++){
            this.add(Blocos[i]);
        }
        
        repaint();
    }
    public void Setar(Programa memoria[]){
        String ant="";
        int cor=0;
        for(int i=0;i<memoria.length;i++){
            if(memoria[i]==null){
                Blocos[i].setText("");
                Blocos[i].setBackground(Color.WHITE);
            }else{
                Blocos[i].setText(memoria[i].getNome());
                if(!memoria[i].getNome().equalsIgnoreCase(ant)){
                    cor+=30;
                }
                Blocos[i].setBackground(Color.getHSBColor(cor*5,cor*5,cor*5));
                ant=memoria[i].getNome();
            }
        }
        repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memória");
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_Add_File_26px.png"))); // NOI18N
        jButton1.setText("ALOCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_Choice_28px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_Registry_Editor_26px.png"))); // NOI18N
        jButton3.setText("DESALOCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_Registry_Editor_26px.png"))); // NOI18N
        jButton4.setText("DESALOCAR TUDO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_Text_Box_25px.png"))); // NOI18N
        jButton5.setText("Lista Encadeada");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Alocar().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PA.setText("Total PA: "+Trabalho_SOII.lista.TotalProgramasAlocados());
        inf.setText("Quantidade EL: "+Trabalho_SOII.lista.QuantidadeEspaçosVazios());
        tam.setText("Tamanho EL: "+Trabalho_SOII.lista.TamanhoEspaçosVazios());
        total.setText("Total EL: "+Trabalho_SOII.lista.TotalTamanhoEspaçosVazios());
        Exemplos.Teste();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Trabalho_SOII.desalocar(JOptionPane.showInputDialog("Informe a Sigla do Programa a ser desalocado"));
        Trabalho_SOII.Atualizar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Trabalho_SOII.desalocarTudo();
        Trabalho_SOII.Atualizar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Trabalho_SOII.lista.ImprimeIterface();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estrategias_alocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estrategias_alocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estrategias_alocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estrategias_alocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estrategias_alocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}

package view;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import model.*;

/**
* Esta classe representa a tela de visualização do extrato de um usuário
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class ListarExtratoUi extends javax.swing.JDialog {

    private Transacao copiaTransacao;
    
    /**
    * O construtor inicializa os componentes gráficos
    */
    public ListarExtratoUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
    * Método responsável por listar todo o extrato de um usuário
    * Obs: feito com um pouco de gambiarra para conseguir deixar o texto de maneira alinhada
    */
    public void listarExtrato(Transacao transacao){
        
        copiaTransacao = transacao;
        
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        taListagemExtrato.append("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        double saldoMomentaneo = 0;
        
        List <Transacao> listaPorData = transacao.getExtrato();
        
        if(rbCrescente.isSelected())
            Collections.sort(listaPorData, new OrdenacaoPorData());
        else{
            Collections.sort(listaPorData, new OrdenacaoPorDataDecrescente());
            saldoMomentaneo = transacao.getSaldo();
        }
        
        for(Transacao t : listaPorData){
            
            if(t instanceof Despesa){
                
                if(rbCrescente.isSelected())
                    saldoMomentaneo -= t.getValorTransacao();
                
                taListagemExtrato.append("DESPESA\tValor: " + df.format(t.getValorTransacao()));
            
                if(t.getValorTransacao() >= 100)
                    taListagemExtrato.append("\tTipo: ");
                else
                    taListagemExtrato.append("\t\tTipo: ");
                
                if(((Despesa)t).getTipoDespesa() == TipoDespesa.Outras || ((Despesa)t).getTipoDespesa() == TipoDespesa.Saúde || 
                   ((Despesa)t).getTipoDespesa() == TipoDespesa.Educação)
                        taListagemExtrato.append(((Despesa)t).getTipoDespesa() + "\t");
                else
                    taListagemExtrato.append(((Despesa)t).getTipoDespesa() + "");
                
                taListagemExtrato.append("\tData: " + t.getDataTransacao().format(dtf) +
                                         "\tSaldo: " + df.format(saldoMomentaneo));
                
                if(rbDecrescente.isSelected())
                    saldoMomentaneo += t.getValorTransacao();
            }
            
            else if(t instanceof Receita){
                
                if(rbCrescente.isSelected())
                    saldoMomentaneo += t.getValorTransacao();
                
                taListagemExtrato.append("RECEITA\tValor: " + df.format(t.getValorTransacao()));
            
                if(t.getValorTransacao() >= 100)
                    taListagemExtrato.append("\tTipo: ");
                else
                    taListagemExtrato.append("\t\tTipo: ");

                if(((Receita)t).getTipoReceita() == TipoReceita.Décimo_Terceiro)
                    taListagemExtrato.append("Décimo Terceiro");
                else
                    taListagemExtrato.append(((Receita)t).getTipoReceita() + "\t");
                
                taListagemExtrato.append("\tData: " + t.getDataTransacao().format(dtf) +
                                         "\tSaldo: " + df.format(saldoMomentaneo));
                
                if(rbDecrescente.isSelected())
                    saldoMomentaneo -= t.getValorTransacao();
            }
            taListagemExtrato.append("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOrdenacao = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListagemExtrato = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        rbCrescente = new javax.swing.JRadioButton();
        rbDecrescente = new javax.swing.JRadioButton();
        btAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taListagemExtrato.setEditable(false);
        taListagemExtrato.setColumns(20);
        taListagemExtrato.setRows(5);
        jScrollPane1.setViewportView(taListagemExtrato);

        jLabel1.setText("EXTRATO");

        bgOrdenacao.add(rbCrescente);
        rbCrescente.setSelected(true);
        rbCrescente.setText("Ordenação Crescente");

        bgOrdenacao.add(rbDecrescente);
        rbDecrescente.setText("Ordenação Decrescente");

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(346, 346, 346))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rbCrescente)
                                .addGap(18, 18, 18)
                                .addComponent(rbDecrescente)
                                .addGap(40, 40, 40)
                                .addComponent(btAtualizar)
                                .addGap(96, 96, 96))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDecrescente)
                    .addComponent(rbCrescente)
                    .addComponent(btAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Método responsável atualizar a ordenação do texto
    */
    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        taListagemExtrato.setText("");
        listarExtrato(copiaTransacao);
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarExtratoUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarExtratoUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarExtratoUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarExtratoUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarExtratoUi dialog = new ListarExtratoUi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOrdenacao;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCrescente;
    private javax.swing.JRadioButton rbDecrescente;
    private javax.swing.JTextArea taListagemExtrato;
    // End of variables declaration//GEN-END:variables
}

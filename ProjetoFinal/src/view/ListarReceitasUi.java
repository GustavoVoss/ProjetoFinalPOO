package view;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import model.*;

/**
* Esta classe representa a tela de visualização das receitas de um usuário
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class ListarReceitasUi extends javax.swing.JDialog {

    private Transacao copiaTransacao;
    
    /**
    * O construtor inicializa os componentes gráficos
    */
    public ListarReceitasUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
    * Método responsável por listar todas as receitas de um usuário
    * Obs: feito com um pouco de gambiarra para conseguir deixar o texto de maneira alinhada
    */
    public void listarReceitas(Transacao transacao){
        
        copiaTransacao = transacao;
        
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        taListagemReceitas.append("-----------------------------------------------------------------------------------------------------------------\n");
        
        List <Receita> listaPorData = transacao.getReceitas();
        
        if(rbCrescente.isSelected())
            Collections.sort(listaPorData, new OrdenacaoPorData());
        else
            Collections.sort(listaPorData, new OrdenacaoPorDataDecrescente());
        
        for(Receita receita : transacao.getReceitas()){
            
            taListagemReceitas.append("Valor: " + df.format(receita.getValorTransacao()));
            
            
            if(receita.getValorTransacao() >= 100)
                taListagemReceitas.append("\tData: " + receita.getDataTransacao().format(dtf) + "\tTipo: ");
            else
                taListagemReceitas.append("\t\tData: " + receita.getDataTransacao().format(dtf) + "\tTipo: ");
            
            
            if(receita.getTipoReceita() == TipoReceita.Décimo_Terceiro)
                taListagemReceitas.append("Décimo Terceiro");
            else
                taListagemReceitas.append(receita.getTipoReceita() + "");
            
            taListagemReceitas.append("\n-----------------------------------------------------------------------------------------------------------------\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOrdenacao = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListagemReceitas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        rbCrescente = new javax.swing.JRadioButton();
        rbDecrescente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taListagemReceitas.setEditable(false);
        taListagemReceitas.setColumns(20);
        taListagemReceitas.setRows(5);
        jScrollPane1.setViewportView(taListagemReceitas);

        jLabel1.setText("LISTA RECEITAS");

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        bgOrdenacao.add(rbCrescente);
        rbCrescente.setSelected(true);
        rbCrescente.setText("Ordenação Crescente");

        bgOrdenacao.add(rbDecrescente);
        rbDecrescente.setText("Ordenação Decrescente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rbCrescente)
                .addGap(18, 18, 18)
                .addComponent(rbDecrescente)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDecrescente)
                    .addComponent(rbCrescente)
                    .addComponent(btAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Método responsável atualizar a ordenação do texto
    */
    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        taListagemReceitas.setText("");
        listarReceitas(copiaTransacao);
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarReceitasUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarReceitasUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarReceitasUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarReceitasUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarReceitasUi dialog = new ListarReceitasUi(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea taListagemReceitas;
    // End of variables declaration//GEN-END:variables
}

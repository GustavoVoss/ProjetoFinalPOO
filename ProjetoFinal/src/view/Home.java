package view;

import java.text.DecimalFormat;
import model.Transacao;

/**
* Esta classe representa a página inicial do controle de receitas e despesas
* de uma pessoa, com acesso à todas as funcionalidades do projeto
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class Home extends javax.swing.JFrame {

    Transacao transacao = new Transacao();
    
    /**
    * O construtor inicializa os componentes gráficos e 
    * instancia os métodos processarArquivo e atualizarSaldo
    */
    public Home(){
        initComponents();
        transacao.processarArquivo();
        atualizarSaldo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIncluirReceita = new javax.swing.JButton();
        btIncluirDespesa = new javax.swing.JButton();
        btConsultarSaldoEspecifico = new javax.swing.JButton();
        btListarReceitas = new javax.swing.JButton();
        btListarDespesas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        btConsultarExtrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        btIncluirReceita.setText("Incluir receita");
        btIncluirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirReceitaActionPerformed(evt);
            }
        });

        btIncluirDespesa.setText("Incluir despesa");
        btIncluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirDespesaActionPerformed(evt);
            }
        });

        btConsultarSaldoEspecifico.setText("Consultar saldo específico");
        btConsultarSaldoEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarSaldoEspecificoActionPerformed(evt);
            }
        });

        btListarReceitas.setText("Listar todas as receitas");
        btListarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarReceitasActionPerformed(evt);
            }
        });

        btListarDespesas.setText("Listar todas as despesas");
        btListarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarDespesasActionPerformed(evt);
            }
        });

        jLabel3.setText("Bem Vindo!");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setIconTextGap(5);

        lbSaldo.setText("Seu saldo: ");

        btConsultarExtrato.setText("Consultar extrato");
        btConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConsultarSaldoEspecifico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btListarReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btIncluirReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btListarDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btIncluirDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbSaldo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirReceita)
                    .addComponent(btIncluirDespesa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarReceitas)
                    .addComponent(btListarDespesas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultarExtrato)
                    .addComponent(btConsultarSaldoEspecifico))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Método responsável por atualizar a mensagem de qual é o saldo atual do usuário
    */
    public void atualizarSaldo(){
        
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        
        lbSaldo.setText("Seu saldo: " + df.format(transacao.getSaldo()));
    }
    
    /**
    * Método responsável por chamar a interface gráfica para o usuário digitar as informações de uma receita;
    * Caso ele clique em cancelar ou fechar a tela, a receita não é adicionada pois está nula;
    * No final ele atualiza a mensagem do saldo atual do usuário.
    */
    private void btIncluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirReceitaActionPerformed
        
        IncluirReceitaUi telaReceita = new IncluirReceitaUi(this, true);
        telaReceita.setVisible(true);
        
        if(telaReceita.getReceita() != null){
            transacao.incluirReceita(telaReceita.getReceita());
            atualizarSaldo();
        }
    }//GEN-LAST:event_btIncluirReceitaActionPerformed

    /**
    * Método responsável por chamar a interface gráfica para o usuário digitar as informações de uma despesa;
    * Caso ele clique em cancelar ou fechar a tela, a despesa não é adicionada pois está nula;
    * No final ele atualiza a mensagem do saldo atual do usuário.
    */
    private void btIncluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirDespesaActionPerformed
        
        IncluirDespesaUi telaDespesa = new IncluirDespesaUi(this, true);
        telaDespesa.setVisible(true);
        
        if(telaDespesa.getDespesa() != null){
            transacao.incluirDespesa(telaDespesa.getDespesa());
            atualizarSaldo();
        }
    }//GEN-LAST:event_btIncluirDespesaActionPerformed

    /**
    * Método responsável por chamar a interface gráfica que lista todas as receitas de um usuário
    */
    private void btListarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarReceitasActionPerformed
        
        ListarReceitasUi telaListagemReceitas = new ListarReceitasUi(this, true);
        
        telaListagemReceitas.listarReceitas(transacao);
        
        telaListagemReceitas.setVisible(true);
    }//GEN-LAST:event_btListarReceitasActionPerformed

    /**
    * Método responsável por chamar a interface gráfica que lista todas as despesas de um usuário
    */
    private void btListarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarDespesasActionPerformed
        
        ListarDespesasUi telaListagemDespesas = new ListarDespesasUi(this, true);
        
        telaListagemDespesas.listarDespesas(transacao);
        
        telaListagemDespesas.setVisible(true);
    }//GEN-LAST:event_btListarDespesasActionPerformed

    /**
    * Método responsável por chamar a interface gráfica que lista o extrato(receitas e despesas) de um usuário
    */
    private void btConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarExtratoActionPerformed
        
        ListarExtratoUi telaListagemExtrato = new ListarExtratoUi(this, true);
        
        telaListagemExtrato.listarExtrato(transacao);
        
        telaListagemExtrato.setVisible(true);
    }//GEN-LAST:event_btConsultarExtratoActionPerformed

    /**
    * Método responsável por chamar a interface gráfica que consulta o saldo de um usuário na data específica que ele informar
    */
    private void btConsultarSaldoEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarSaldoEspecificoActionPerformed
        
        ConsultarSaldoDataEspecificaUi telaSaldoEspecifico = new ConsultarSaldoDataEspecificaUi(this, true);
        
        telaSaldoEspecifico.setTransacao(transacao);
        
        telaSaldoEspecifico.setVisible(true);
    }//GEN-LAST:event_btConsultarSaldoEspecificoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarExtrato;
    private javax.swing.JButton btConsultarSaldoEspecifico;
    private javax.swing.JButton btIncluirDespesa;
    private javax.swing.JButton btIncluirReceita;
    private javax.swing.JButton btListarDespesas;
    private javax.swing.JButton btListarReceitas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbSaldo;
    // End of variables declaration//GEN-END:variables
}

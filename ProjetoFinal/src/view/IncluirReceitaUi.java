package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import model.Receita;
import model.TipoReceita;

/**
* Esta classe representa a tela a adição de uma receita de um usuário
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class IncluirReceitaUi extends javax.swing.JDialog {

    private Receita receita;

    public Receita getReceita() {
        return receita;
    }
    
    /**
    * O construtor inicializa os componentes gráficos
    */
    public IncluirReceitaUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValorReceita = new javax.swing.JLabel();
        tfValorReceita = new javax.swing.JTextField();
        lbDataReceita = new javax.swing.JLabel();
        lbReceita = new javax.swing.JLabel();
        tfDataReceita = new javax.swing.JTextField();
        cbTipoReceita = new javax.swing.JComboBox<>();
        btAdicionarReceita = new javax.swing.JButton();
        btCancelarReceita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbValorReceita.setText("Valor:");

        tfValorReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorReceitaActionPerformed(evt);
            }
        });

        lbDataReceita.setText("Data:");

        lbReceita.setText("RECEITA");

        cbTipoReceita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo", "Salário", "Décimo Terceiro", "Férias", "Outras receitas" }));

        btAdicionarReceita.setText("Adicionar");
        btAdicionarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarReceitaActionPerformed(evt);
            }
        });

        btCancelarReceita.setText("Cancelar");
        btCancelarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarReceitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbReceita))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btAdicionarReceita)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelarReceita))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTipoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbValorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfValorReceita)
                                    .addComponent(tfDataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbReceita)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorReceita)
                    .addComponent(tfValorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataReceita)
                    .addComponent(tfDataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(cbTipoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarReceita)
                    .addComponent(btCancelarReceita))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorReceitaActionPerformed

    /**
    * Método responsável por fechar a tela de inclusão de receita
    */
    private void btCancelarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarReceitaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelarReceitaActionPerformed

    /**
    * Método responsável por adicionar uma receita
    */
    private void btAdicionarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarReceitaActionPerformed

        boolean informacoesPreenchidas = true;
        
        //Valor da receita
        double valorReceita = 0;
        
        try{
            valorReceita = Double.parseDouble(tfValorReceita.getText());
        
            if(valorReceita <= 0)
                informacoesPreenchidas = false;
        }
        catch(NumberFormatException e){
            informacoesPreenchidas = false;
        }
            
        //Data da receita
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = null;
        
        try{
            dataFormatada = LocalDate.parse(tfDataReceita.getText(), dtf);
            if(dataFormatada.getYear() < 2000 || dataFormatada.getYear() > 2050)
                throw new DateTimeParseException("Ano inferior a 2000 ou maior que 2050 não é permitido", tfDataReceita.getText(), 0);
        }
        catch(DateTimeParseException e){
            informacoesPreenchidas = false;
        }
        
        //Tipo da receita
        TipoReceita tipoReceita = TipoReceita.Outras;
        
        if(cbTipoReceita.getSelectedItem().equals("Selecione o tipo"))
            informacoesPreenchidas = false;
        
        else if(cbTipoReceita.getSelectedItem().equals("Salário"))
            tipoReceita = TipoReceita.Salário;
        
        else if(cbTipoReceita.getSelectedItem().equals("Décimo Terceiro"))
            tipoReceita = TipoReceita.Décimo_Terceiro;
        
        else if(cbTipoReceita.getSelectedItem().equals("Férias"))
            tipoReceita = TipoReceita.Férias;
        
        //Verificando se está tudo preenchido corretamente para chamar o construtor
        if(informacoesPreenchidas == true){
            receita = new Receita(valorReceita, dataFormatada, tipoReceita);
            JOptionPane.showMessageDialog(null, "Receita adicionada com sucesso.", "Receita adicionada",  JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Informações faltando",  JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btAdicionarReceitaActionPerformed

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
            java.util.logging.Logger.getLogger(IncluirReceitaUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirReceitaUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirReceitaUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirReceitaUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IncluirReceitaUi dialog = new IncluirReceitaUi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAdicionarReceita;
    private javax.swing.JButton btCancelarReceita;
    private javax.swing.JComboBox<String> cbTipoReceita;
    private javax.swing.JLabel lbDataReceita;
    private javax.swing.JLabel lbReceita;
    private javax.swing.JLabel lbValorReceita;
    private javax.swing.JTextField tfDataReceita;
    private javax.swing.JTextField tfValorReceita;
    // End of variables declaration//GEN-END:variables
}

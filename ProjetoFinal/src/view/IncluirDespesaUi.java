package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import model.Despesa;
import model.TipoDespesa;

/**
* Esta classe representa a tela a adição de uma despesa de um usuário
* @authors Gustavo Arthur Haerthel, Gustavo Richard Voss, Filipe Augusto Peixer
*/
public class IncluirDespesaUi extends javax.swing.JDialog {

    private Despesa despesa;

    public Despesa getDespesa() {
        return despesa;
    }
    
    /**
    * O construtor inicializa os componentes gráficos
    */
    public IncluirDespesaUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValorDespesa = new javax.swing.JLabel();
        tfValorDespesa = new javax.swing.JTextField();
        lbDataDespesa = new javax.swing.JLabel();
        lbDespesa = new javax.swing.JLabel();
        tfDataDespesa = new javax.swing.JTextField();
        cbTipoDespesa = new javax.swing.JComboBox<>();
        btAdicionarDespesa = new javax.swing.JButton();
        btCancelarDespesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbValorDespesa.setText("Valor:");

        tfValorDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorDespesaActionPerformed(evt);
            }
        });

        lbDataDespesa.setText("Data:");

        lbDespesa.setText("DESPESA");

        cbTipoDespesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo", "Alimentação", "Transporte", "Residência", "Saúde", "Educação", "Entretenimento", "Outras despesas" }));

        btAdicionarDespesa.setText("Adicionar");
        btAdicionarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarDespesaActionPerformed(evt);
            }
        });

        btCancelarDespesa.setText("Cancelar");
        btCancelarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbDespesa))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btAdicionarDespesa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelarDespesa))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfValorDespesa)
                                    .addComponent(tfDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbDespesa)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorDespesa)
                    .addComponent(tfValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataDespesa)
                    .addComponent(tfDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(cbTipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarDespesa)
                    .addComponent(btCancelarDespesa))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorDespesaActionPerformed
        
    }//GEN-LAST:event_tfValorDespesaActionPerformed

    /**
    * Método responsável por fechar a tela de inclusão de despesa
    */
    private void btCancelarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarDespesaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelarDespesaActionPerformed

    /**
    * Método responsável por adicionar uma despesa
    */
    private void btAdicionarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarDespesaActionPerformed

        boolean informacoesPreenchidas = true;
        
        //Valor da despesa
        double valorDespesa = 0;
        
        try{
            valorDespesa = Double.parseDouble(tfValorDespesa.getText());
        
            if(valorDespesa <= 0)
                informacoesPreenchidas = false;
        }
        catch(NumberFormatException e){
            informacoesPreenchidas = false;
        }
            
        //Data da despesa
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = null;
        
        try{
            dataFormatada = LocalDate.parse(tfDataDespesa.getText(), dtf);
            if(dataFormatada.getYear() < 2000 || dataFormatada.getYear() > 2050)
                throw new DateTimeParseException("Ano inferior a 2000 ou maior que 2050 não é permitido", tfDataDespesa.getText(), 0);
        }
        catch(DateTimeParseException e){
            informacoesPreenchidas = false;
        }
        
        //Tipo da despesa
        TipoDespesa tipoDespesa = TipoDespesa.Outras;
        
        if(cbTipoDespesa.getSelectedItem().equals("Selecione o tipo"))
            informacoesPreenchidas = false;
        
        else if(cbTipoDespesa.getSelectedItem().equals("Alimentação"))
            tipoDespesa = TipoDespesa.Alimentação;
        
        else if(cbTipoDespesa.getSelectedItem().equals("Transporte"))
            tipoDespesa = TipoDespesa.Transporte;
        
        else if(cbTipoDespesa.getSelectedItem().equals("Residência"))
            tipoDespesa = TipoDespesa.Residência;
        
        else if(cbTipoDespesa.getSelectedItem().equals("Saúde"))
            tipoDespesa = TipoDespesa.Saúde;
        
        else if(cbTipoDespesa.getSelectedItem().equals("Educação"))
            tipoDespesa = TipoDespesa.Educação;
        
        else if(cbTipoDespesa.getSelectedItem().equals("Entretenimento"))
            tipoDespesa = TipoDespesa.Entretenimento;
        
        //Verificando se está tudo preenchido corretamente para chamar o construtor
        if(informacoesPreenchidas == true){
            despesa = new Despesa(valorDespesa, dataFormatada, tipoDespesa);
            JOptionPane.showMessageDialog(null, "Despesa adicionada com sucesso.", "Despesa adicionada",  JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Informações faltando",  JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btAdicionarDespesaActionPerformed

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
    private javax.swing.JButton btAdicionarDespesa;
    private javax.swing.JButton btCancelarDespesa;
    private javax.swing.JComboBox<String> cbTipoDespesa;
    private javax.swing.JLabel lbDataDespesa;
    private javax.swing.JLabel lbDespesa;
    private javax.swing.JLabel lbValorDespesa;
    private javax.swing.JTextField tfDataDespesa;
    private javax.swing.JTextField tfValorDespesa;
    // End of variables declaration//GEN-END:variables
}

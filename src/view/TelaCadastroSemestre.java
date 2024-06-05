/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.SemestreLetivo;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class TelaCadastroSemestre extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroSemestre
     */
    //setando o index e um semestre caso vier da tabela
    private int index = -1;
    private final DateTimeFormatter formatter;

    public void setIndex(int index) {
        this.index = index;
        if (index >= 0) {
            SemestreLetivo s = Main.listaS.get(index);
            txtAno.setText(Integer.toString(s.getAno()));
            jComboBox1.setSelectedIndex(s.getSemestre());
            txtDataIni.setText(s.getDataInicio().format(formatter));
            txtDataFim.setText(s.getDataFim().format(formatter));
        }
    }

    public TelaCadastroSemestre() {
        this.formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        initComponents();
    }

    //limpar os campos do cadastro
    public void limparCampos() {
        txtAno.setText("");
        txtDataIni.setText("");
        txtDataFim.setText("");
        jComboBox1.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAno = new javax.swing.JFormattedTextField();
        txtDataIni = new javax.swing.JFormattedTextField();
        txtDataFim = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Semestre");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ano:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Data inicial:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data final:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/disquete.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/fechar (2).png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Primeiro", "Segundo" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Semestre:");

        txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0000"))));
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        txtDataIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/yyyy"))));
        txtDataIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataIniActionPerformed(evt);
            }
        });

        txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/yyyy"))));
        txtDataFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimActionPerformed(evt);
            }
        });

        jLabel5.setText("Data em formato: MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAno, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox1, 0, 170, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDataFim, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDataIni)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //BOTAO DE SALVAR SEMESTRES

        //validar se o ano é um inteiro
        int ano = 0;
        try {
            ano = Integer.parseInt(txtAno.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo ano com um número válido!");
            txtAno.requestFocus();
            return;
        }

        //validar o formulário em branco
        if (txtAno.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo ano!");
            txtAno.requestFocus();
        } else if (jComboBox1.getSelectedIndex()
                == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um semestre!");
            jComboBox1.requestFocus();
        } else if (txtDataIni.getText()
                .equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo Data Inicial!");
            txtDataIni.requestFocus();
        } else if (txtDataFim.getText()
                .equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo Data Final!");
            txtDataFim.requestFocus();
        } else {
            if (ano >= 2050 && ano <= 0) {
                JOptionPane.showConfirmDialog(rootPane, "Digite uma data válida");
            } else if (!validaData(txtDataIni.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Preencha uma data inicial Válida");
            } else if (!validaData(txtDataFim.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Digite uma data final válida!");
            } else {
                SemestreLetivo s;
                s = new SemestreLetivo(ano, jComboBox1.getSelectedIndex(), YearMonth.parse(txtDataIni.getText(), formatter), YearMonth.parse(txtDataFim.getText(), formatter));
                System.out.println("Semestre criado" + s);
                if (index == -1) {
                    int teste = JOptionPane.showConfirmDialog(rootPane, "<html>Você quer adicionar este período?<br><br>Ano:  " + s.getAno()
                            + "<br><br>Semestre:  " + s.getSemestre()
                            + "<br><br>Início:  " + s.getDataInicio().format(formatter)
                            + "<br><br>Fim:  " + s.getDataFim().format(formatter) + "<br><br></html>", "Confirmação de novo semestre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (teste != JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(rootPane, "Semestre NÃO criado!!");
                        limparCampos();
                    }
                    Main.listaS.addSemestreLista(s);
                    limparCampos();
                } else {
                    int teste = JOptionPane.showConfirmDialog(rootPane, "<html>Você quer alterar este período para?<br><br>Ano:  " + s.getAno()
                            + "<br><br>Semestre:  " + s.getSemestre()
                            + "<br><br>Início:  " + s.getDataInicio().format(formatter)
                            + "<br><br>Fim:  " + s.getDataFim().format(formatter) + "<br><br></html>", "Confirmação de novo semestre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (teste != JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(rootPane, "Semestre NÃO alterado!!");
                        limparCampos();
                    }
                    Main.listaS.alterarLista(s, index);
                }
                System.out.println(Main.listaS.toString());
                dispose();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    public boolean validaData(String data) {
        try {
            // Tenta analisar a string usando o método parse de YearMonth com o formatter
            YearMonth.parse(data, formatter);
            System.out.println("data válida: " + YearMonth.parse(data, formatter));
            return true; // Se não lançar exceção, é válido
        } catch (DateTimeParseException e) {
            System.out.println("data inválida: " + YearMonth.parse(data, formatter));
            return false; // Se lançar exceção, é inválido
        }
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtDataIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataIniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataIni;
    // End of variables declaration//GEN-END:variables
}

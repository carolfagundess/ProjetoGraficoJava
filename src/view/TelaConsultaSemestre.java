/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import view.util.SemestreTableModel;

/**
 *
 * @author carol
 */
public class TelaConsultaSemestre extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form TelaConsultaSemestre
     */
    public TelaConsultaSemestre() {
        initComponents();
        atualizaTabela();
    }

    private void atualizaTabela() {
        SemestreTableModel dtm = new SemestreTableModel();
        System.out.println("ATUALIZOU A TABELA");
        jTableSemestres.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSemestres = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Semestres");

        jTableSemestres.setAutoCreateRowSorter(true);
        jTableSemestres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableSemestres.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableSemestres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableSemestres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSemestresMouseClicked(evt);
            }
        });
        jTableSemestres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableSemestresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableSemestresKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSemestres);

        btnAdicionar.setText("Adicionar item");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover item");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Pressione F7 para abrir as disciplinas do semestre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableSemestresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSemestresMouseClicked
        if (evt.getClickCount() == 2) {
            TelaCadastroSemestre cadastroSemestre = new TelaCadastroSemestre();
            cadastroSemestre.setIndex(jTableSemestres.getSelectedRow());
            cadastroSemestre.setModal(true);
            cadastroSemestre.setVisible(true);
            atualizaTabela();
        }
    }//GEN-LAST:event_jTableSemestresMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        TelaCadastroSemestre telaCadastroSemestre = new TelaCadastroSemestre();
        telaCadastroSemestre.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                atualizaTabela();
            }
        });
        telaCadastroSemestre.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (jTableSemestres.getSelectedRow() >= 0) {
            int teste = JOptionPane.showConfirmDialog(this, "Tem certeza?", "Confirmação de remoção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (teste == JOptionPane.YES_OPTION) {
                Main.listaS.removeSemestreLista(jTableSemestres.getSelectedRow());
                atualizaTabela();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um semestre para remover! ");
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jTableSemestresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableSemestresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F7 && jTableSemestres.getSelectedRow() != -1) {
            TelaDisciplinasSemestre telaDisciplinas = new TelaDisciplinasSemestre();
            telaDisciplinas.setIndice(jTableSemestres.getSelectedRow());
            telaDisciplinas.setVisible(true);

            telaDisciplinas.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    atualizaTabela();
                }
            });

        } else {
            JOptionPane.showMessageDialog(rootPane, "<html>Selecione um semestre e <br>Pressione o botão F7 para abrir as disciplinas!</html>");
        }
    }//GEN-LAST:event_jTableSemestresKeyPressed

    private void jTableSemestresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableSemestresKeyTyped

    }//GEN-LAST:event_jTableSemestresKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSemestres;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.LoteDAO;
import dao.ProdutoDAO;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Lote;
import modelo.Produto;

/**
 *
 * @author Cliente
 */
public class EstoquistaEstoqueGUI extends javax.swing.JFrame {

    /**
     * Creates new form Estoque
     */
    public EstoquistaEstoqueGUI() {
        initComponents();
        setIcon();
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> listaSabor = dao.recuperaProdutosDisponiveis();

        DefaultTableModel tbm = (DefaultTableModel) jTableDisponivel.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        int i = 0;
        for (Produto us : listaSabor) {
            tbm.addRow(new String[1]);
            jTableDisponivel.setValueAt(us.getTipoProduto(), i, 0);
            jTableDisponivel.setValueAt(us.getEspecificacao(), i, 1);
            jTableDisponivel.setValueAt(us.getQtdDisponivel(), i, 2);
            i++;
        }

        LoteDAO daolote = new LoteDAO();
        List<Lote> listaLote = daolote.recuperaLotes();

        DefaultTableModel tbmlotes = (DefaultTableModel) jTableLotes.getModel();
        for (int i2 = tbmlotes.getRowCount() - 1; i2 >= 0; i2--) {
            tbmlotes.removeRow(i2);
        }
        int i2 = 0;
        for (Lote us : listaLote) {
            tbmlotes.addRow(new String[1]);
            jTableLotes.setValueAt(us.getIdLote(), i2, 0);
            jTableLotes.setValueAt(us.getTipoProdutoLote(), i2, 1);
            jTableLotes.setValueAt(us.getEspecificacao(), i2, 2);
            jTableLotes.setValueAt(us.getQtdUnitaria(), i2, 3);
            jTableLotes.setValueAt(us.getFornecedor(), i2, 4);
            jTableLotes.setValueAt(us.getDataEntrada(), i2, 5);
            jTableLotes.setValueAt(us.getHoraEntrada(), i2, 6);
            jTableLotes.setValueAt(us.getValidade(), i2, 7);
            i2++;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEntrada = new javax.swing.JButton();
        jButtonSaida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLotes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDisponivel = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/closed box.png"))); // NOI18N
        jButtonEntrada.setText("Entrada de lote");
        jButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntradaActionPerformed(evt);
            }
        });

        jButtonSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/opened box.png"))); // NOI18N
        jButtonSaida.setText("Saída de lote para disponibilzação");
        jButtonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaidaActionPerformed(evt);
            }
        });

        jTableLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Lote", "Produto", "Especificação", "QtdUnitaria", "Fornecedor", "DataEntrada", "HoraEntrada", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLotes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableLotes);
        if (jTableLotes.getColumnModel().getColumnCount() > 0) {
            jTableLotes.getColumnModel().getColumn(0).setResizable(false);
            jTableLotes.getColumnModel().getColumn(1).setResizable(false);
            jTableLotes.getColumnModel().getColumn(2).setResizable(false);
            jTableLotes.getColumnModel().getColumn(3).setResizable(false);
            jTableLotes.getColumnModel().getColumn(4).setResizable(false);
            jTableLotes.getColumnModel().getColumn(5).setResizable(false);
            jTableLotes.getColumnModel().getColumn(6).setResizable(false);
            jTableLotes.getColumnModel().getColumn(7).setResizable(false);
        }

        jTableDisponivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Tipo", "Especificação", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDisponivel.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableDisponivel);
        if (jTableDisponivel.getColumnModel().getColumnCount() > 0) {
            jTableDisponivel.getColumnModel().getColumn(0).setResizable(false);
            jTableDisponivel.getColumnModel().getColumn(1).setResizable(false);
            jTableDisponivel.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/back.png"))); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Produtos disponíveis");

        jLabel2.setText("Lotes guardados no estoque");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/list.png"))); // NOI18N
        jButton1.setText("Histórico de lotes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/logout.png"))); // NOI18N
        jMenuItem1.setText("Desconectar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSaida))
                            .addComponent(jButton2))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntradaActionPerformed
        EstoquistaEstqEntrada j = new EstoquistaEstqEntrada();
        j.show();
        this.dispose();
    }//GEN-LAST:event_jButtonEntradaActionPerformed

    private void jButtonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaidaActionPerformed
        EstoquistaEstqSaida j = new EstoquistaEstqSaida();
        j.show();
        this.dispose();
    }//GEN-LAST:event_jButtonSaidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EstoquistaHistoricoLotesGUI j = new EstoquistaHistoricoLotesGUI();
        j.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EstoquistaGUI j = new EstoquistaGUI();
        j.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        LoginGUI janLogin = new LoginGUI();
        janLogin.setLocationRelativeTo(null);
        janLogin.setVisible(true);
        janLogin.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LoginGUI janLogin = new LoginGUI();
        janLogin.setLocationRelativeTo(null);
        janLogin.setVisible(true);
        janLogin.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(EstoquistaEstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoquistaEstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoquistaEstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoquistaEstoqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoquistaEstoqueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEntrada;
    private javax.swing.JButton jButtonSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDisponivel;
    private javax.swing.JTable jTableLotes;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("suco.png")));
    }
}

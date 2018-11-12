/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ItemVendidoDAO;
import dao.VendaDAO;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ItemVendido;
import modelo.Venda;

/**
 *
 * @author Cliente
 */
public class ControleDeVendas extends javax.swing.JFrame {

    /**
     * Creates new form Cl
     */
    public ControleDeVendas() {
        initComponents();
        setIcon();
        VendaDAO daolote = new VendaDAO();
        List<Venda> listaLote = daolote.recuperaLotes();

        DefaultTableModel tbmlotes = (DefaultTableModel) jTableVendas.getModel();
        for (int i2 = tbmlotes.getRowCount() - 1; i2 >= 0; i2--) {
            tbmlotes.removeRow(i2);
        }
        int i2 = 0;
        for (Venda us : listaLote) {
            tbmlotes.addRow(new String[1]);
            jTableVendas.setValueAt(us.getIdVenda(), i2, 0);
            jTableVendas.setValueAt(us.getQtdSuco250(), i2, 1);
            jTableVendas.setValueAt(us.getQtdSuco500(), i2, 2);
            jTableVendas.setValueAt(us.getQtdSuco750(), i2, 3);
            jTableVendas.setValueAt(us.getQtdBiscoito(), i2, 4);
            jTableVendas.setValueAt(us.getQtdBatata(), i2, 5);
            jTableVendas.setValueAt(us.getDesconto(), i2, 6);
            jTableVendas.setValueAt(us.getValorTotal(), i2, 7);
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

        jButton1 = new javax.swing.JButton();
        jTextFieldIdVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItemVendido = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Venda:");

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venda", "Sucos 250ml", "Sucos 500ml", "Sucos 750ml", "Qtd. Biscoitos", "Qtd. Batatas", "Desconto", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVendas);

        jTableItemVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venda", "ID Item", "Especificacao", "Tamanho", "Sabor 1", "Sabor 2", "Sabor 3", "Qtd. Item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableItemVendido);
        if (jTableItemVendido.getColumnModel().getColumnCount() > 0) {
            jTableItemVendido.getColumnModel().getColumn(0).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(1).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(2).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(3).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(4).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(5).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(6).setResizable(false);
            jTableItemVendido.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/save.png"))); // NOI18N
        jButton2.setText("Salvar alterações");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/back.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Listagem de todas as vendas já efetuadas");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/cancel.png"))); // NOI18N
        jButton4.setText("Remover venda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu4.setText("Arquivo");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/logout.png"))); // NOI18N
        jMenuItem4.setText("Desconectar");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar4.add(jMenu4);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jButton3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextFieldIdVenda.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "O campo ID Venda não pode ficar vazio.");
        } else {
            ItemVendidoDAO dao = new ItemVendidoDAO();
            List<ItemVendido> listaItemVendido = dao.recuperaItens(jTextFieldIdVenda.getText().trim());
            if (listaItemVendido.size() > 0) {
                DefaultTableModel tbm = (DefaultTableModel) jTableItemVendido.getModel();
                for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
                    tbm.removeRow(i);
                }
                int i = 0;
                for (ItemVendido us : listaItemVendido) {
                    tbm.addRow(new String[1]);
                    jTableItemVendido.setValueAt(us.getIdVenda(), i, 0);
                    jTableItemVendido.setValueAt(us.getIdItem(), i, 1);
                    jTableItemVendido.setValueAt(us.getEspecificacao(), i, 2);
                    jTableItemVendido.setValueAt(us.getTamanhoItem(), i, 3);
                    jTableItemVendido.setValueAt(us.getSabor1(), i, 4);
                    jTableItemVendido.setValueAt(us.getSabor2(), i, 5);
                    jTableItemVendido.setValueAt(us.getSabor3(), i, 6);
                    jTableItemVendido.setValueAt(us.getQtdItem(), i, 7);
                    i++;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Não há uma venda com o ID: " + jTextFieldIdVenda.getText().trim());
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jTextFieldIdVenda.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar informações.\nNão foram encontrados dados na tabela.");
        } else {
            int idVenda = Integer.parseInt(jTextFieldIdVenda.getText());
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja ATUALIZAR as informações da venda: " + idVenda + "?"
                    + "", "Atenção", JOptionPane.OK_CANCEL_OPTION);
            if (op == JOptionPane.OK_OPTION) {
                ItemVendidoDAO dao = new ItemVendidoDAO();
                ItemVendido item = new ItemVendido();
                DefaultTableModel tbm = (DefaultTableModel) jTableItemVendido.getModel();

                int totitem = tbm.getRowCount() - 1;
                for (int k = 0; k <= totitem; k++) {
                    int IdItem = k + 1;
                    String Especificacao = (String) jTableItemVendido.getModel().getValueAt(k, 2);
                    String TamanhoItem = (String) jTableItemVendido.getModel().getValueAt(k, 3);
                    String Sabor1 = (String) jTableItemVendido.getModel().getValueAt(k, 4);
                    String Sabor2 = (String) jTableItemVendido.getModel().getValueAt(k, 5);
                    String Sabor3 = (String) jTableItemVendido.getModel().getValueAt(k, 6);
                    String QtdItem = (String) jTableItemVendido.getModel().getValueAt(k, 7);

                    item.setIdVenda(idVenda);
                    item.setIdItem(IdItem);
                    item.setEspecificacao(Especificacao);
                    item.setTamanhoItem(TamanhoItem);
                    item.setSabor1(Sabor1);
                    item.setSabor2(Sabor2);
                    item.setSabor3(Sabor3);
                    item.setQtdItem(QtdItem);
                    dao.atualizaItem(item);
                }
                JOptionPane.showMessageDialog(null, "Informações atualizadas com sucesso!");

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GerenteGUI j = new GerenteGUI();
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        j.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked

    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        LoginGUI janLogin = new LoginGUI();
        janLogin.setLocationRelativeTo(null);
        janLogin.setVisible(true);
        janLogin.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTextFieldIdVenda.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar informações.\nNão foram encontrados dados na tabela.");
        } else {
            int idVenda = Integer.parseInt(jTextFieldIdVenda.getText());
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja REMOVER a venda: " + idVenda + "?"
                    + "", "Atenção", JOptionPane.OK_CANCEL_OPTION);
            if (op == JOptionPane.OK_OPTION) {
                VendaDAO dao = new VendaDAO();
                Venda venda = new Venda();
                String idVendaParaRemover = jTextFieldIdVenda.getText();
                venda.setIdVenda(idVendaParaRemover);
                if (dao.removerVenda(venda)) {
                    JOptionPane.showMessageDialog(null, "Venda removida com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao remover a venda.");
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ControleDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleDeVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableItemVendido;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldIdVenda;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("suco.png")));
    }
}
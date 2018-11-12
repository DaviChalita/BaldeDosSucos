package gui;

import dao.FuncionarioDAO;
import gui.LoginGUI;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class EstoquistaGUI extends javax.swing.JFrame {

    public String nome;

    public EstoquistaGUI() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        Sairbtn = new javax.swing.JLabel();
        jButtomCaixa = new javax.swing.JLabel();
        jButtomEstoque = new javax.swing.JLabel();
        jButtomEstat = new javax.swing.JLabel();
        jButtomVendas = new javax.swing.JLabel();
        jButtomFunc = new javax.swing.JLabel();
        jButtomSabores = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(236, 240, 241));
        jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMouseClicked(evt);
            }
        });

        Sairbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnSair.png"))); // NOI18N
        Sairbtn.setToolTipText("");
        Sairbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sairbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SairbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SairbtnMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairbtnMouseClicked(evt);
            }
        });

        jButtomCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/caixa.png"))); // NOI18N
        jButtomCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtomCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtomCaixaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtomCaixaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtomCaixaMouseClicked(evt);
            }
        });

        jButtomEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/estoque.png"))); // NOI18N
        jButtomEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtomEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtomEstoqueMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtomEstoqueMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtomEstoqueMouseClicked(evt);
            }
        });

        jButtomEstat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/estat.png"))); // NOI18N
        jButtomEstat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtomEstat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtomEstatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtomEstatMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtomEstatMouseClicked(evt);
            }
        });

        jButtomVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/vendas.png"))); // NOI18N
        jButtomVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtomVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtomVendasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtomVendasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtomVendasMouseReleased(evt);
            }
        });

        jButtomFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/func.png"))); // NOI18N
        jButtomFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtomFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtomFuncMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtomFuncMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtomFuncMouseReleased(evt);
            }
        });

        jButtomSabores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/sabores.png"))); // NOI18N
        jButtomSabores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtomSabores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtomSaboresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtomSaboresMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtomSaboresMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeUsuario))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtomCaixa)
                            .addComponent(jButtomEstoque)
                            .addComponent(jButtomEstat)
                            .addComponent(Sairbtn))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtomSabores)
                            .addComponent(jButtomFunc)
                            .addComponent(jButtomVendas))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeUsuario)
                .addGap(46, 46, 46)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtomSabores)
                    .addComponent(jButtomCaixa))
                .addGap(33, 33, 33)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jButtomEstoque)
                        .addGap(33, 33, 33)
                        .addComponent(jButtomEstat))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jButtomFunc)
                        .addGap(35, 35, 35)
                        .addComponent(jButtomVendas)))
                .addGap(40, 40, 40)
                .addComponent(Sairbtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairbtnMousePressed
        Sairbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnSairPressed.png")));
    }//GEN-LAST:event_SairbtnMousePressed

    private void SairbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairbtnMouseReleased
        Sairbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnSair.png")));
    }//GEN-LAST:event_SairbtnMouseReleased

    private void SairbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairbtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairbtnMouseClicked

    private void jButtomCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomCaixaMousePressed
        jButtomCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/caixa_pressed.png")));
    }//GEN-LAST:event_jButtomCaixaMousePressed

    private void jButtomCaixaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomCaixaMouseReleased
        jButtomCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/caixa.png")));
    }//GEN-LAST:event_jButtomCaixaMouseReleased

    private void jButtomEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomEstoqueMousePressed
        jButtomEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/estoque_pressed.png")));
    }//GEN-LAST:event_jButtomEstoqueMousePressed

    private void jButtomEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomEstoqueMouseReleased
        jButtomEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/estoque.png")));
    }//GEN-LAST:event_jButtomEstoqueMouseReleased

    private void jButtomEstatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomEstatMousePressed
        jButtomEstat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/estat_pressed.png")));
    }//GEN-LAST:event_jButtomEstatMousePressed

    private void jButtomEstatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomEstatMouseReleased
        jButtomEstat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/estat.png")));
    }//GEN-LAST:event_jButtomEstatMouseReleased

    private void jButtomVendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomVendasMousePressed
        jButtomVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/vendas_pressed.png")));
    }//GEN-LAST:event_jButtomVendasMousePressed

    private void jButtomVendasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomVendasMouseReleased
        jButtomVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/vendas.png")));
    }//GEN-LAST:event_jButtomVendasMouseReleased

    private void jButtomFuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomFuncMousePressed
        jButtomFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/func_pressed.png")));
    }//GEN-LAST:event_jButtomFuncMousePressed

    private void jButtomFuncMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomFuncMouseReleased
        jButtomFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/func.png")));
    }//GEN-LAST:event_jButtomFuncMouseReleased

    private void jButtomSaboresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomSaboresMousePressed
        jButtomSabores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/sabores_pressed.png")));
    }//GEN-LAST:event_jButtomSaboresMousePressed

    private void jButtomSaboresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomSaboresMouseReleased
        jButtomSabores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/sabores.png")));
    }//GEN-LAST:event_jButtomSaboresMouseReleased

    private void jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseClicked
        jPanel.grabFocus();
    }//GEN-LAST:event_jPanelMouseClicked

    private void jButtomEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomEstoqueMouseClicked
        EstoquistaEstoqueGUI janEstq = new EstoquistaEstoqueGUI();
        janEstq.setLocationRelativeTo(null);
        janEstq.setVisible(true);
        janEstq.setResizable(false);
        this.dispose();

    }//GEN-LAST:event_jButtomEstoqueMouseClicked

    private void jButtomFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomFuncMouseClicked
        JOptionPane.showMessageDialog(null, "Você não tem acesso", "Nope", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtomFuncMouseClicked

    private void jButtomCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomCaixaMouseClicked
        JOptionPane.showMessageDialog(null, "Você não tem acesso", "Nope", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtomCaixaMouseClicked

    private void jButtomEstatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomEstatMouseClicked
        JOptionPane.showMessageDialog(null, "Você não tem acesso", "Nope", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtomEstatMouseClicked

    private void jButtomSaboresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomSaboresMouseClicked
        JOptionPane.showMessageDialog(null, "Você não tem acesso", "Nope", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtomSaboresMouseClicked

    private void jButtomVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtomVendasMouseClicked
        JOptionPane.showMessageDialog(null, "Você não tem acesso", "Nope", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtomVendasMouseClicked

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
            java.util.logging.Logger.getLogger(EstoquistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoquistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoquistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoquistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoquistaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sairbtn;
    private javax.swing.JLabel jButtomCaixa;
    private javax.swing.JLabel jButtomEstat;
    private javax.swing.JLabel jButtomEstoque;
    private javax.swing.JLabel jButtomFunc;
    private javax.swing.JLabel jButtomSabores;
    private javax.swing.JLabel jButtomVendas;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("suco.png")));
    }
}

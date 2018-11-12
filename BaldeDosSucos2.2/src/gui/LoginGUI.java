package gui;

import dao.FuncionarioDAO;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import modelo.Login;

public final class LoginGUI extends javax.swing.JFrame {

    int i = 0;

    public LoginGUI() {
        initComponents();
        setIcon();
        Entrarbtn.grabFocus();
        this.tratarEventos();
        setIcon();

    }

    void Conecta() {

        String login = LoginTextField.getText();
        String Senha = PasswordTextField.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_bds", "root", "");
            com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement) conn.createStatement();
            String query = "select * from Funcionario where Login = '" + login + "' and Senha = '" + Senha + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {

                String cargo = rs.getString("Cargo");

                if (cargo.equals("Gerente")) {

                    JOptionPane.showMessageDialog(null, "Bem vindo, " + login);
                    GerenteGUI janGerente = new GerenteGUI();
                    janGerente.setLocationRelativeTo(null);
                    janGerente.setVisible(true);
                    janGerente.setResizable(false);
                    this.dispose();

                } else if (cargo.equals("Caixa")) {

                    JOptionPane.showMessageDialog(null, "Bem vindo, " + login);
                    CaixaGUI janCaixa = new CaixaGUI();
                    janCaixa.setLocationRelativeTo(null);
                    janCaixa.setVisible(true);
                    janCaixa.setResizable(false);
                    this.dispose();

                } else if (cargo.equals("Estoquista")) {

                    JOptionPane.showMessageDialog(null, "Bem vindo, " + login);
                    EstoquistaGUI janCaixa = new EstoquistaGUI();
                    janCaixa.setLocationRelativeTo(null);
                    janCaixa.setVisible(true);
                    janCaixa.setResizable(false);
                    this.dispose();

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos.");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException s) {
            System.out.println(s.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void setaLogin() {
        if (LoginTextField.getText().equals("")) {
            LoginTextField.setText("Login");
        }
    }

    void limpaLogin() {
        if (LoginTextField.getText().equals("Login")) {
            LoginTextField.setText("");
        }
    }

    void setaSenha() {
        if (PasswordTextField.getText().isEmpty()) {
            PasswordTextField.setText("Senha");
            i = 0;
        }
    }

    void limpaSenha() {
        if (i == 0) {
            PasswordTextField.setText("");
            i = 1;
        }
    }

    public void tratarEventos() {
        Entrarbtn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Conecta();
                }
            }
        });

        LoginTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Conecta();
                }
            }
        });

        PasswordTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Conecta();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswordIco = new javax.swing.JLabel();
        LoginIco = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JPasswordField();
        LoginTextField = new javax.swing.JTextField();
        Sairbtn = new javax.swing.JLabel();
        Entrarbtn = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PsdLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        LgLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Balde dos Sucos");
        setMinimumSize(new java.awt.Dimension(800, 350));
        setPreferredSize(new java.awt.Dimension(800, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PasswordIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/SenhaIco.png"))); // NOI18N
        PasswordIco.setText("jLabel1");
        getContentPane().add(PasswordIco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 202, 46, 46));

        LoginIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/LoginIco.png"))); // NOI18N
        LoginIco.setText("jLabel1");
        getContentPane().add(LoginIco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 132, 46, 46));

        PasswordTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PasswordTextField.setForeground(new java.awt.Color(163, 163, 163));
        PasswordTextField.setText("senha");
        PasswordTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(13, 20, 1, 1)));
        PasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 360, 50));

        LoginTextField.setBackground(new java.awt.Color(251, 251, 251));
        LoginTextField.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        LoginTextField.setForeground(new java.awt.Color(163, 163, 163));
        LoginTextField.setText("Login");
        LoginTextField.setToolTipText("");
        LoginTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1)));
        LoginTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoginTextField.setMinimumSize(new java.awt.Dimension(16, 32));
        LoginTextField.setPreferredSize(new java.awt.Dimension(107, 50));
        LoginTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(LoginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 360, 50));

        Sairbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnSair.png"))); // NOI18N
        Sairbtn.setToolTipText("");
        Sairbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sairbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SairbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SairbtnMouseReleased(evt);
            }
        });
        getContentPane().add(Sairbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        Entrarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnLogin.png"))); // NOI18N
        Entrarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntrarbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EntrarbtnMouseReleased(evt);
            }
        });
        getContentPane().add(Entrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        PasswordLabel.setFont(new java.awt.Font("Sketch Block", 0, 32)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Senha");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 50));

        PsdLabel.setFont(new java.awt.Font("Calibri Light", 0, 32)); // NOI18N
        PsdLabel.setForeground(new java.awt.Color(255, 255, 255));
        PsdLabel.setText(":");
        getContentPane().add(PsdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 50));

        Title.setFont(new java.awt.Font("Sketch Block", 0, 38)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Balde dos Sucos");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 340, 50));

        LgLabel.setFont(new java.awt.Font("Calibri Light", 0, 32)); // NOI18N
        LgLabel.setForeground(new java.awt.Color(255, 255, 255));
        LgLabel.setText(":");
        getContentPane().add(LgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 50));

        LoginLabel.setFont(new java.awt.Font("Sketch Block", 0, 32)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setText("Login");
        getContentPane().add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/LoginBackground.png"))); // NOI18N
        Background.setText("jLabel8");
        Background.setMaximumSize(new java.awt.Dimension(800, 350));
        Background.setMinimumSize(new java.awt.Dimension(800, 350));
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginTextFieldFocusLost
        setaLogin();
    }//GEN-LAST:event_LoginTextFieldFocusLost


    private void PasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTextFieldFocusLost
        setaSenha();
    }//GEN-LAST:event_PasswordTextFieldFocusLost

    private void SairbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairbtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairbtnMouseClicked

    private void SairbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairbtnMousePressed
        Sairbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnSairPressed.png")));
    }//GEN-LAST:event_SairbtnMousePressed

    private void SairbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairbtnMouseReleased
        Sairbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnSair.png")));
    }//GEN-LAST:event_SairbtnMouseReleased

    private void BackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseClicked
        Entrarbtn.grabFocus();
    }//GEN-LAST:event_BackgroundMouseClicked

    private void EntrarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnMouseClicked
        Conecta();
    }//GEN-LAST:event_EntrarbtnMouseClicked

    private void EntrarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnMousePressed
        Entrarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnLoginPressed.png")));
    }//GEN-LAST:event_EntrarbtnMousePressed

    private void EntrarbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnMouseReleased
        Entrarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/btnLogin.png")));
    }//GEN-LAST:event_EntrarbtnMouseReleased

    private void LoginTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginTextFieldFocusGained
        limpaLogin();
    }//GEN-LAST:event_LoginTextFieldFocusGained

    private void PasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTextFieldFocusGained
        limpaSenha();
    }//GEN-LAST:event_PasswordTextFieldFocusGained

    public static void main(String args[]) {
        LoginGUI tela = new LoginGUI();
        tela.tratarEventos();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Entrarbtn;
    private javax.swing.JLabel LgLabel;
    private javax.swing.JLabel LoginIco;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField LoginTextField;
    private javax.swing.JLabel PasswordIco;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel PsdLabel;
    private javax.swing.JLabel Sairbtn;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("suco.png")));
    }
}

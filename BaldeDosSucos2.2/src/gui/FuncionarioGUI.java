package gui;

import modelo.Funcionario;
import dao.FuncionarioDAO;
import java.awt.Toolkit;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FuncionarioGUI extends javax.swing.JFrame {

    private boolean CpfOk;
    private boolean RgOk;
    private boolean LoginOk;
    private boolean EmailOk;
    private boolean DataOk;
    private boolean HoraOk;

    public FuncionarioGUI() {
        initComponents();
        setIcon();
        FuncionarioDAO func = new FuncionarioDAO();
        jTextFieldMatricula.setText(String.valueOf(func.pegaMatricula()));
    }

    public void limpaCpf() {
        jFormattedTextFieldCPF.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFuncionario = new javax.swing.JPanel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jButtonRecuperar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox();
        jFormattedTextFieldDataInicio = new javax.swing.JFormattedTextField();
        jLabelDataInicio = new javax.swing.JLabel();
        jLabelDataTermino = new javax.swing.JLabel();
        jFormattedTextFieldDataTermino = new javax.swing.JFormattedTextField();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelSalario = new javax.swing.JLabel();
        jLabelAuxilio = new javax.swing.JLabel();
        jLabelHorarioTrab = new javax.swing.JLabel();
        jFormattedTextFieldTrabCom = new javax.swing.JFormattedTextField();
        jLabelHTrab = new javax.swing.JLabel();
        jFormattedTextFieldTrabFim = new javax.swing.JFormattedTextField();
        jFormattedTextFieldIntervFim = new javax.swing.JFormattedTextField();
        jLabelInterv = new javax.swing.JLabel();
        jFormattedTextFieldIntervCom = new javax.swing.JFormattedTextField();
        jLabelIntervalo = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabelDataNasc = new javax.swing.JLabel();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jComboBoxEstadoCivil = new javax.swing.JComboBox();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldAuxilio = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculaKeyTyped(evt);
            }
        });

        jLabelMatricula.setText("Matrícula:");

        jButtonRecuperar.setText("Recuperar");
        jButtonRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecuperarActionPerformed(evt);
            }
        });

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldCPFFocusLost(evt);
            }
        });

        jLabelEmail.setText("E-mail:");

        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });

        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCelular.setText("Celular (opc.):");

        jLabelCargo.setText("Cargo:");

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Caixa", "Gerente", "Estoquista", "Suqueiro" }));
        jComboBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataInicioFocusLost(evt);
            }
        });

        jLabelDataInicio.setText("Data início:");

        jLabelDataTermino.setText("Data término:");

        try {
            jFormattedTextFieldDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataTermino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataTerminoFocusLost(evt);
            }
        });

        jLabelLogin.setText("Login:");

        jTextFieldLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLoginFocusLost(evt);
            }
        });

        jLabelSenha.setText("Senha:");

        jLabelSalario.setText("Salário:");

        jLabelAuxilio.setText("Auxílio:");

        jLabelHorarioTrab.setText("Horário de trabalho:");

        try {
            jFormattedTextFieldTrabCom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTrabCom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTrabCom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldTrabComFocusLost(evt);
            }
        });

        jLabelHTrab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHTrab.setText("-");

        try {
            jFormattedTextFieldTrabFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTrabFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTrabFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldTrabFimFocusLost(evt);
            }
        });

        try {
            jFormattedTextFieldIntervFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIntervFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldIntervFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldIntervFimFocusLost(evt);
            }
        });

        jLabelInterv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInterv.setText("-");

        try {
            jFormattedTextFieldIntervCom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIntervCom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldIntervCom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldIntervComFocusLost(evt);
            }
        });

        jLabelIntervalo.setText("Intervalo:");

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/cancel.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir funcionário");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelTelefone.setText("Telefone:");

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDataNasc.setText("Data de Nasc.:");

        try {
            jFormattedTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataNascFocusLost(evt);
            }
        });

        jLabelEstadoCivil.setText("Estado civil:");

        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Separado(a)", "Viúvo(a)" }));

        jLabelRG.setText("RG:");

        jTextFieldRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldRGFocusLost(evt);
            }
        });
        jTextFieldRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRGKeyTyped(evt);
            }
        });

        jLabelSexo.setText("Sexo:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outros" }));

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/blank.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/add.png"))); // NOI18N
        jButtonCadastrar.setMnemonic('c');
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/save.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Salvar alterações");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFuncionarioLayout = new javax.swing.GroupLayout(jPanelFuncionario);
        jPanelFuncionario.setLayout(jPanelFuncionarioLayout);
        jPanelFuncionarioLayout.setHorizontalGroup(
            jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                        .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addComponent(jLabelCargo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addComponent(jLabelDataTermino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextFieldDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabelDataInicio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addComponent(jLabelSalario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(48, 48, 48)
                                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addComponent(jLabelAuxilio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldAuxilio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelSenha)
                                                    .addComponent(jLabelLogin))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFuncionarioLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                                        .addComponent(jLabelHorarioTrab)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jFormattedTextFieldTrabCom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                                            .addComponent(jLabelIntervalo)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jFormattedTextFieldIntervCom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabelInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jFormattedTextFieldIntervFim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFuncionarioLayout.createSequentialGroup()
                                                            .addGap(150, 150, 150)
                                                            .addComponent(jLabelHTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jFormattedTextFieldTrabFim, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelDataNasc)
                                        .addComponent(jLabelTelefone)
                                        .addComponent(jLabelCPF)
                                        .addComponent(jLabelNome)
                                        .addComponent(jLabelMatricula))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelCelular)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabelRG))
                                                .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButtonRecuperar))
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabelSexo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                            .addGap(231, 231, 231)
                                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionarioLayout.createSequentialGroup()
                                            .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                                                    .addGap(207, 207, 207)
                                                    .addComponent(jLabelEstadoCivil)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFuncionarioLayout.setVerticalGroup(
            jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatricula)
                    .addComponent(jButtonRecuperar))
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCPF)
                        .addComponent(jLabelRG))
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNasc)
                    .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstadoCivil)
                    .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCargo)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                        .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataInicio)
                            .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataTermino)
                            .addComponent(jFormattedTextFieldDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFuncionarioLayout.createSequentialGroup()
                        .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHorarioTrab)
                            .addComponent(jFormattedTextFieldTrabCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHTrab)
                            .addComponent(jFormattedTextFieldTrabFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIntervalo)
                            .addComponent(jLabelInterv)
                            .addComponent(jFormattedTextFieldIntervCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldIntervFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSalario)
                        .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAuxilio)
                        .addComponent(jTextFieldAuxilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonLimpar)))
                .addContainerGap())
        );

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/back.png"))); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/funcbook.png"))); // NOI18N
        jButton1.setText("Lista de funcionários cadastrados");
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(157, 157, 157)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaFuncionarios j = new ListaFuncionarios();
        j.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        GerenteGUI j = new GerenteGUI();
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        j.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar: " + jTextFieldNome.getText() + " ?", "Atenção", JOptionPane.OK_CANCEL_OPTION);
        if (op == JOptionPane.OK_OPTION) {
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(jTextFieldNome.getText());
            funcionario.setCpf(jFormattedTextFieldCPF.getText());
            funcionario.setRg(jTextFieldRG.getText());
            funcionario.setData_Nasc(jFormattedTextFieldDataNasc.getText());
            funcionario.setEstado_Civil((String) jComboBoxEstadoCivil.getSelectedItem());
            funcionario.setSexo((String) jComboBoxSexo.getSelectedItem());
            funcionario.setEmail(jTextFieldEmail.getText());
            funcionario.setTelefone(jFormattedTextFieldTelefone.getText());
            funcionario.setCelular(jFormattedTextFieldCelular.getText());
            funcionario.setCargo((String) jComboBoxCargo.getSelectedItem());
            funcionario.setData_Inicio(jFormattedTextFieldDataInicio.getText());
            funcionario.setData_Termino(jFormattedTextFieldDataTermino.getText());
            funcionario.setLogin(jTextFieldLogin.getText());
            funcionario.setSenha(jPasswordFieldSenha.getText());
            funcionario.setSalario(Float.parseFloat(jTextFieldSalario.getText()));
            funcionario.setAuxilio(Float.parseFloat(jTextFieldAuxilio.getText()));
            funcionario.setHorario_Trab_Com(jFormattedTextFieldTrabCom.getText());
            funcionario.setHorario_Trab_Fim(jFormattedTextFieldTrabFim.getText());
            funcionario.setInterv_Com(jFormattedTextFieldIntervCom.getText());
            funcionario.setInterv_Fim(jFormattedTextFieldIntervFim.getText());
            funcionario.setMatricula(Long.parseLong(jTextFieldMatricula.getText()));
            if (dao.altera(funcionario)) {
                JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar \nERRO:" + JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        FuncionarioDAO dao = new FuncionarioDAO();

        // Dados não podem retornar vazios - Validação de dados
        if ((jTextFieldMatricula.getText().isEmpty()) || (jTextFieldNome.getText().isEmpty())
                || (jFormattedTextFieldCPF.getText().isEmpty()) || (jTextFieldRG.getText().isEmpty())
                || (jFormattedTextFieldDataNasc.getText().isEmpty())
                || (jTextFieldEmail.getText().isEmpty()) || (jFormattedTextFieldTelefone.getText().isEmpty())
                || (jFormattedTextFieldDataInicio.getText().isEmpty())
                || (jFormattedTextFieldDataTermino.getText().isEmpty()) || (jTextFieldSalario.getText().isEmpty())
                || (jTextFieldAuxilio.getText().isEmpty()) || (jFormattedTextFieldTrabCom.getText().isEmpty())
                || (jFormattedTextFieldTrabFim.getText().isEmpty())
                || (jFormattedTextFieldIntervCom.getText().isEmpty()) || (jFormattedTextFieldIntervFim.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(jTextFieldNome.getText());
            funcionario.setCpf(jFormattedTextFieldCPF.getText());
            funcionario.setRg(jTextFieldRG.getText());
            funcionario.setData_Nasc(jFormattedTextFieldDataNasc.getText());
            funcionario.setEstado_Civil((String) jComboBoxEstadoCivil.getSelectedItem());
            funcionario.setSexo((String) jComboBoxSexo.getSelectedItem());
            funcionario.setEmail(jTextFieldEmail.getText());
            funcionario.setTelefone(jFormattedTextFieldTelefone.getText());
            funcionario.setCelular(jFormattedTextFieldCelular.getText());
            funcionario.setCargo((String) jComboBoxCargo.getSelectedItem());
            funcionario.setData_Inicio(jFormattedTextFieldDataInicio.getText());
            funcionario.setData_Termino(jFormattedTextFieldDataTermino.getText());
            funcionario.setLogin(jTextFieldLogin.getText());
            funcionario.setSenha(jPasswordFieldSenha.getText());
            funcionario.setSalario(Float.parseFloat(jTextFieldSalario.getText()));
            funcionario.setAuxilio(Float.parseFloat(jTextFieldAuxilio.getText()));
            funcionario.setHorario_Trab_Com(jFormattedTextFieldTrabCom.getText());
            funcionario.setHorario_Trab_Fim(jFormattedTextFieldTrabFim.getText());
            funcionario.setInterv_Com(jFormattedTextFieldIntervCom.getText());
            funcionario.setInterv_Fim(jFormattedTextFieldIntervFim.getText());

            try {
                dao.setCpf(jFormattedTextFieldCPF.getText());
                CpfOk = dao.verifCpf();
            } catch (Exception ex) {
                ex.getMessage();
            }
            try {
                dao.setCpf(jFormattedTextFieldCPF.getText());
                CpfOk = dao.verifCpfBd();
            } catch (Exception ex) {
                ex.getMessage();
            }
            try {
                dao.setRg(jTextFieldRG.getText());
                RgOk = dao.verifRgBd();
            } catch (Exception ex) {
                ex.getMessage();
            }
            try {
                dao.setLogin(jTextFieldLogin.getText());
                LoginOk = dao.verifLoginBd();
            } catch (Exception ex) {
                ex.getMessage();
            }
            try {
                dao.setEmail(jTextFieldEmail.getText());
                EmailOk = dao.verifEmailBd();
            } catch (Exception ex) {
                ex.getMessage();
            }

            if (CpfOk == true && RgOk == true && LoginOk == true && EmailOk == true) {
                if (dao.adiciona(funcionario)) {
                    JOptionPane.showMessageDialog(null, "Usuário " + jTextFieldNome.getText() + " inserido com sucesso! ");

                    //Apaga dados
                    jTextFieldNome.setText("");
                    jFormattedTextFieldCPF.setText("");
                    jTextFieldRG.setText("");
                    jFormattedTextFieldDataNasc.setText("");
                    jComboBoxEstadoCivil.setSelectedIndex(0);
                    jComboBoxSexo.setSelectedIndex(0);
                    jTextFieldEmail.setText("");
                    jFormattedTextFieldTelefone.setText("");
                    jFormattedTextFieldCelular.setText("");
                    jComboBoxCargo.setSelectedIndex(0);
                    jFormattedTextFieldDataInicio.setText("");
                    jFormattedTextFieldDataTermino.setText("");
                    jTextFieldLogin.setText("");
                    jPasswordFieldSenha.setText("");
                    jTextFieldSalario.setText("");
                    jTextFieldAuxilio.setText("");
                    jFormattedTextFieldTrabCom.setText("");
                    jFormattedTextFieldTrabFim.setText("");
                    jFormattedTextFieldIntervCom.setText("");
                    jFormattedTextFieldIntervFim.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no cadastro");
                }
            }
        }

        FuncionarioDAO func = new FuncionarioDAO();
        jTextFieldMatricula.setText(String.valueOf(func.pegaMatricula()));
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jFormattedTextFieldCPF.setText("");
        jTextFieldRG.setText("");
        jFormattedTextFieldDataNasc.setText("");
        jComboBoxEstadoCivil.setSelectedIndex(0);
        jComboBoxSexo.setSelectedIndex(0);
        jTextFieldEmail.setText("");
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldCelular.setText("");
        jComboBoxCargo.setSelectedIndex(0);
        jFormattedTextFieldDataInicio.setText("");
        jFormattedTextFieldDataTermino.setText("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jTextFieldSalario.setText("");
        jTextFieldAuxilio.setText("");
        jFormattedTextFieldTrabCom.setText("");
        jFormattedTextFieldTrabFim.setText("");
        jFormattedTextFieldIntervCom.setText("");
        jFormattedTextFieldIntervFim.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRGKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGKeyTyped

    private void jTextFieldRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRGFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            dao.setRg(jTextFieldRG.getText());
            dao.verifRgBd();
        } catch (Exception ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_jTextFieldRGFocusLost

    private void jFormattedTextFieldDataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascFocusLost

        String dados[] = jFormattedTextFieldDataNasc.getText().split("/");

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            DataOk = dao.verifDataNasc(dados);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (DataOk == false) {
            jFormattedTextFieldDataNasc.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldDataNascFocusLost

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir: "
                + jTextFieldNome.getText() + " ?", "Atenção", JOptionPane.OK_CANCEL_OPTION);
        if (op == JOptionPane.OK_OPTION) {
            FuncionarioDAO dao = new FuncionarioDAO();
            if (dao.exclui(Long.parseLong(jTextFieldMatricula.getText()))) {
                JOptionPane.showMessageDialog(null, "Excluído com sucesso");
                jTextFieldMatricula.setText("");
                jTextFieldNome.setText("");
                jFormattedTextFieldCPF.setText("");
                jTextFieldRG.setText("");
                jFormattedTextFieldDataNasc.setText("");
                jComboBoxEstadoCivil.setSelectedIndex(0);
                jComboBoxSexo.setSelectedIndex(0);
                jTextFieldEmail.setText("");
                jFormattedTextFieldTelefone.setText("");
                jFormattedTextFieldCelular.setText("");
                jComboBoxCargo.setSelectedIndex(0);
                jFormattedTextFieldDataInicio.setText("");
                jFormattedTextFieldDataTermino.setText("");
                jTextFieldLogin.setText("");
                jPasswordFieldSenha.setText("");
                jTextFieldSalario.setText("");
                jTextFieldAuxilio.setText("");
                jFormattedTextFieldTrabCom.setText("");
                jFormattedTextFieldTrabFim.setText("");
                jFormattedTextFieldIntervCom.setText("");
                jFormattedTextFieldIntervFim.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir \nERRO:" + JOptionPane.ERROR_MESSAGE);
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jFormattedTextFieldIntervComFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIntervComFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        String pega = jFormattedTextFieldIntervCom.getText();

        try {
            HoraOk = dao.verifHora(pega);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (HoraOk == false) {
            jFormattedTextFieldIntervCom.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldIntervComFocusLost

    private void jFormattedTextFieldIntervFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIntervFimFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        String pega = jFormattedTextFieldIntervFim.getText();

        try {
            HoraOk = dao.verifHora(pega);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (HoraOk == false) {
            jFormattedTextFieldIntervFim.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldIntervFimFocusLost

    private void jFormattedTextFieldTrabFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTrabFimFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        String pega = jFormattedTextFieldTrabFim.getText();

        try {
            HoraOk = dao.verifHora(pega);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (HoraOk == false) {
            jFormattedTextFieldTrabFim.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldTrabFimFocusLost

    private void jFormattedTextFieldTrabComFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTrabComFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        String pega = jFormattedTextFieldTrabCom.getText();

        try {
            HoraOk = dao.verifHora(pega);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (HoraOk == false) {
            jFormattedTextFieldTrabCom.setText("");
        }

    }//GEN-LAST:event_jFormattedTextFieldTrabComFocusLost

    private void jTextFieldLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLoginFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            dao.setLogin(jTextFieldLogin.getText());
            dao.verifLoginBd();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_jTextFieldLoginFocusLost

    private void jFormattedTextFieldDataTerminoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataTerminoFocusLost

        String dados[] = jFormattedTextFieldDataTermino.getText().split("/");

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            DataOk = dao.verifData(dados);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (DataOk == false) {
            jFormattedTextFieldDataTermino.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldDataTerminoFocusLost

    private void jFormattedTextFieldDataInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataInicioFocusLost

        String dados[] = jFormattedTextFieldDataNasc.getText().split("/");

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            DataOk = dao.verifData(dados);
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (DataOk == false) {
            jFormattedTextFieldDataInicio.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldDataInicioFocusLost

    private void jComboBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoActionPerformed
        if (jComboBoxCargo.getSelectedItem() == "Suqueiro") {
            jTextFieldLogin.setText("");
            jTextFieldLogin.setEditable(false);
            jPasswordFieldSenha.setText("");
            jPasswordFieldSenha.setEditable(false);
        } else {
            jTextFieldLogin.setEditable(true);
            jPasswordFieldSenha.setEditable(true);
        }
    }//GEN-LAST:event_jComboBoxCargoActionPerformed

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            dao.setEmail(jTextFieldEmail.getText());
            dao.verifEmailBd();
        } catch (Exception ex) {
            ex.getMessage();
        }

        try {
            EmailOk = dao.verifEmail();
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (EmailOk != true) {
            jTextFieldEmail.setText("");
        }

    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jFormattedTextFieldCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFFocusLost

        FuncionarioDAO dao = new FuncionarioDAO();

        try {
            dao.setCpf(jFormattedTextFieldCPF.getText());
            CpfOk = dao.verifCpf();
            dao.verifCpfBd();
        } catch (Exception ex) {
            ex.getMessage();
        }

        if (CpfOk == false) {
            jFormattedTextFieldCPF.setText("");
        }
    }//GEN-LAST:event_jFormattedTextFieldCPFFocusLost

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        // código do evento:
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jButtonRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecuperarActionPerformed
        if (jTextFieldMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a matrícula para busca!");
        } else {
            Funcionario funcionario = new Funcionario();
            funcionario.setMatricula(Long.parseLong(jTextFieldMatricula.getText()));
            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            FuncionarioDAO dao = new FuncionarioDAO();
            funcionario = dao.recupera(funcionario);
            if (funcionario != null) {
                jTextFieldNome.setText(funcionario.getNome());
                jFormattedTextFieldCPF.setText(funcionario.getCpf());
                jTextFieldRG.setText(funcionario.getRg());
                jFormattedTextFieldDataNasc.setText(funcionario.getData_Nasc());
                jComboBoxEstadoCivil.setSelectedItem(String.valueOf(funcionario.getEstado_Civil()));
                jComboBoxSexo.setSelectedItem(String.valueOf(funcionario.getSexo()));
                jTextFieldEmail.setText(funcionario.getEmail());
                jFormattedTextFieldTelefone.setText(String.valueOf(funcionario.getTelefone()));
                jFormattedTextFieldCelular.setText(String.valueOf(funcionario.getCelular()));
                jComboBoxCargo.setSelectedItem(String.valueOf(funcionario.getCargo()));
                jFormattedTextFieldDataInicio.setText(String.valueOf(funcionario.getData_Inicio()));
                jFormattedTextFieldDataTermino.setText(String.valueOf(funcionario.getData_Termino()));
                jTextFieldLogin.setText(funcionario.getLogin());
                jPasswordFieldSenha.setText(funcionario.getSenha());
                jTextFieldSalario.setText(String.valueOf(funcionario.getSalario()));
                jTextFieldAuxilio.setText(String.valueOf(funcionario.getAuxilio()));
                jFormattedTextFieldTrabCom.setText(String.valueOf(funcionario.getHorario_Trab_Com()));
                jFormattedTextFieldTrabFim.setText(String.valueOf(funcionario.getHorario_Trab_Fim()));
                jFormattedTextFieldIntervCom.setText(String.valueOf(funcionario.getInterv_Com()));
                jFormattedTextFieldIntervFim.setText(String.valueOf(funcionario.getHorario_Trab_Fim()));
            } else {
                JOptionPane.showMessageDialog(null, "Não achei");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRecuperarActionPerformed

    private void jTextFieldMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRecuperar;
    private javax.swing.JComboBox jComboBoxCargo;
    private javax.swing.JComboBox jComboBoxEstadoCivil;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataTermino;
    private javax.swing.JFormattedTextField jFormattedTextFieldIntervCom;
    private javax.swing.JFormattedTextField jFormattedTextFieldIntervFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JFormattedTextField jFormattedTextFieldTrabCom;
    private javax.swing.JFormattedTextField jFormattedTextFieldTrabFim;
    private javax.swing.JLabel jLabelAuxilio;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelDataTermino;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelHTrab;
    private javax.swing.JLabel jLabelHorarioTrab;
    private javax.swing.JLabel jLabelInterv;
    private javax.swing.JLabel jLabelIntervalo;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelFuncionario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldAuxilio;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
  private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("suco.png")));
    }
}

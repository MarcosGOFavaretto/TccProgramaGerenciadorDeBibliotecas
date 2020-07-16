/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendamentoClass;
import Controller.EmprestimoClass;
import Controller.LoginClass;
import Model.ConsultarUsuario;
import Model.VerificarQuantidade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author T-Gamer
 */
public class TelaCadastrarEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarEmprestimo
     */
    private String email = "";
    private String senha = "";
    private TelaLogin telalogin_objeto = new TelaLogin();
    private LoginClass loginclass_objeto = new LoginClass();

    public TelaCadastrarEmprestimo() {
        email = JOptionPane.showInputDialog(null, "Insira o email do usuário abaixo:", "Email", 3);
        JPasswordField password = new JPasswordField(10);
        password.setEchoChar('*');
        JLabel rotulo = new JLabel("Insira a senha do usuário a seguir:");
        JPanel requisitoSenha = new JPanel();
        requisitoSenha.add(rotulo);
        requisitoSenha.add(password);
        JOptionPane.showMessageDialog(null, requisitoSenha, "Acesso restrito", 3);

        senha = password.getText();

        if (email.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vazios, acesso negado!");
            loginclass_objeto.setLogin(false);
            this.setVisible(false);
            telalogin_objeto.setVisible(true);
        } else {
            ConsultarUsuario consultarusuario_objeto = new ConsultarUsuario();
            loginclass_objeto.setEmail(this.email);
            loginclass_objeto.setSenha(this.senha);
            if (consultarusuario_objeto.ConsultarUsuario(loginclass_objeto.getEmail(), loginclass_objeto.getSenha())) {
                JOptionPane.showMessageDialog(null, "Usuário reconhecido!");
                loginclass_objeto.setLogin(true);
                initComponents();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não reconhecido, acesso negado!");
                loginclass_objeto.setLogin(false);
                this.setVisible(false);
                telalogin_objeto.setVisible(true);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jMais = new javax.swing.JLabel();
        jLbNovoAgendamento = new javax.swing.JLabel();
        jMais1 = new javax.swing.JLabel();
        jLbNovoAluno = new javax.swing.JLabel();
        jMais2 = new javax.swing.JLabel();
        jLbNovoEmprestimo = new javax.swing.JLabel();
        jMais3 = new javax.swing.JLabel();
        jLbNovoLivro = new javax.swing.JLabel();
        jMais4 = new javax.swing.JLabel();
        jLbNovoUsuario = new javax.swing.JLabel();
        jLupa = new javax.swing.JLabel();
        jLbVisualizarAgendamentos = new javax.swing.JLabel();
        jLupa1 = new javax.swing.JLabel();
        jLbVisualizarAlunos = new javax.swing.JLabel();
        jLupa2 = new javax.swing.JLabel();
        jLbVisualizarAtrasos = new javax.swing.JLabel();
        jLupa3 = new javax.swing.JLabel();
        jLbVisualizarEmprestimos = new javax.swing.JLabel();
        jLupa4 = new javax.swing.JLabel();
        jLbVisualizarHistorico = new javax.swing.JLabel();
        jLupa5 = new javax.swing.JLabel();
        jLbVisualizarLivros = new javax.swing.JLabel();
        jSair = new javax.swing.JLabel();
        jLbSair = new javax.swing.JLabel();
        jHamburguinho2 = new javax.swing.JLabel();
        jFundoMenu = new javax.swing.JLabel();
        jHamburguinho1 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jTxtQuantidade = new javax.swing.JFormattedTextField();
        jTxtRm = new javax.swing.JFormattedTextField();
        jTxtDataDevolucao = new javax.swing.JFormattedTextField();
        jTxtCodigoLivro = new javax.swing.JFormattedTextField();
        jNovoEmprestimo = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Mais.png"))); // NOI18N
        jPanel1.add(jMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLbNovoAgendamento.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbNovoAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        jLbNovoAgendamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbNovoAgendamento.setText("Novo Agendamento");
        jLbNovoAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbNovoAgendamentoMouseClicked(evt);
            }
        });
        jPanel1.add(jLbNovoAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 40));

        jMais1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Mais.png"))); // NOI18N
        jPanel1.add(jMais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jLbNovoAluno.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbNovoAluno.setForeground(new java.awt.Color(255, 255, 255));
        jLbNovoAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbNovoAluno.setText("Novo Aluno");
        jLbNovoAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbNovoAlunoMouseClicked(evt);
            }
        });
        jPanel1.add(jLbNovoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, 40));

        jMais2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Mais.png"))); // NOI18N
        jPanel1.add(jMais2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLbNovoEmprestimo.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbNovoEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        jLbNovoEmprestimo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbNovoEmprestimo.setText("Novo Empréstimo");
        jLbNovoEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbNovoEmprestimoMouseClicked(evt);
            }
        });
        jPanel1.add(jLbNovoEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 170, 40));

        jMais3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Mais.png"))); // NOI18N
        jPanel1.add(jMais3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLbNovoLivro.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbNovoLivro.setForeground(new java.awt.Color(255, 255, 255));
        jLbNovoLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbNovoLivro.setText("Novo Livro");
        jLbNovoLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbNovoLivroMouseClicked(evt);
            }
        });
        jPanel1.add(jLbNovoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 40));

        jMais4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Mais.png"))); // NOI18N
        jPanel1.add(jMais4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jLbNovoUsuario.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLbNovoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbNovoUsuario.setText("Novo Usuário");
        jLbNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbNovoUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(jLbNovoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 40));

        jLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Olho.png"))); // NOI18N
        jPanel1.add(jLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 208, -1, 60));

        jLbVisualizarAgendamentos.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbVisualizarAgendamentos.setForeground(new java.awt.Color(255, 255, 255));
        jLbVisualizarAgendamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbVisualizarAgendamentos.setText("Agendamentos");
        jLbVisualizarAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbVisualizarAgendamentosMouseClicked(evt);
            }
        });
        jPanel1.add(jLbVisualizarAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 40));

        jLupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Olho.png"))); // NOI18N
        jPanel1.add(jLupa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jLbVisualizarAlunos.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbVisualizarAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jLbVisualizarAlunos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbVisualizarAlunos.setText("Alunos");
        jLbVisualizarAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbVisualizarAlunosMouseClicked(evt);
            }
        });
        jPanel1.add(jLbVisualizarAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 40));

        jLupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Olho.png"))); // NOI18N
        jPanel1.add(jLupa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jLbVisualizarAtrasos.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbVisualizarAtrasos.setForeground(new java.awt.Color(255, 255, 255));
        jLbVisualizarAtrasos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbVisualizarAtrasos.setText("Atrasos");
        jLbVisualizarAtrasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbVisualizarAtrasosMouseClicked(evt);
            }
        });
        jPanel1.add(jLbVisualizarAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 40));

        jLupa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Olho.png"))); // NOI18N
        jPanel1.add(jLupa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLbVisualizarEmprestimos.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbVisualizarEmprestimos.setForeground(new java.awt.Color(255, 255, 255));
        jLbVisualizarEmprestimos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbVisualizarEmprestimos.setText("Emprestimos");
        jLbVisualizarEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbVisualizarEmprestimosMouseClicked(evt);
            }
        });
        jPanel1.add(jLbVisualizarEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 170, 40));

        jLupa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Olho.png"))); // NOI18N
        jPanel1.add(jLupa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLbVisualizarHistorico.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbVisualizarHistorico.setForeground(new java.awt.Color(255, 255, 255));
        jLbVisualizarHistorico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbVisualizarHistorico.setText("Histórico");
        jLbVisualizarHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbVisualizarHistoricoMouseClicked(evt);
            }
        });
        jPanel1.add(jLbVisualizarHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 170, 40));

        jLupa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Olho.png"))); // NOI18N
        jPanel1.add(jLupa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jLbVisualizarLivros.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbVisualizarLivros.setForeground(new java.awt.Color(255, 255, 255));
        jLbVisualizarLivros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbVisualizarLivros.setText("Livros");
        jLbVisualizarLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbVisualizarLivrosMouseClicked(evt);
            }
        });
        jPanel1.add(jLbVisualizarLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 170, 40));

        jSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Sair.png"))); // NOI18N
        jPanel1.add(jSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jLbSair.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 20)); // NOI18N
        jLbSair.setForeground(new java.awt.Color(255, 255, 255));
        jLbSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbSair.setText("Sair");
        jLbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbSairMouseClicked(evt);
            }
        });
        jPanel1.add(jLbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 170, 40));

        jHamburguinho2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Hamburguinho2.png"))); // NOI18N
        jHamburguinho2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHamburguinho2MouseClicked(evt);
            }
        });
        jPanel1.add(jHamburguinho2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, -1));

        jFundoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Menu Lateral.png"))); // NOI18N
        jPanel1.add(jFundoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 770));

        jHamburguinho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Hamburguinho2.png"))); // NOI18N
        jHamburguinho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHamburguinho1MouseClicked(evt);
            }
        });
        getContentPane().add(jHamburguinho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, -1));

        jBtnCancelar.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 14)); // NOI18N
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 270, 70));

        jBtnSalvar.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 14)); // NOI18N
        jBtnSalvar.setText("SALVAR");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 270, 70));

        jTxtQuantidade.setBorder(null);
        try {
            jTxtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtQuantidade.setText("11");
        jTxtQuantidade.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtQuantidade.setOpaque(false);
        jTxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 70, 50));

        jTxtRm.setBorder(null);
        try {
            jTxtRm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtRm.setText("11111");
        jTxtRm.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtRm.setOpaque(false);
        jTxtRm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRmActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtRm, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, -1, -1));

        jTxtDataDevolucao.setBorder(null);
        try {
            jTxtDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtDataDevolucao.setText("11/11/1111");
        jTxtDataDevolucao.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtDataDevolucao.setOpaque(false);
        getContentPane().add(jTxtDataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 190, 60));

        jTxtCodigoLivro.setBorder(null);
        try {
            jTxtCodigoLivro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtCodigoLivro.setText("11111");
        jTxtCodigoLivro.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jTxtCodigoLivro.setOpaque(false);
        getContentPane().add(jTxtCodigoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 100, -1));

        jNovoEmprestimo.setFont(new java.awt.Font("Abadi MT Std Extra Light", 0, 36)); // NOI18N
        jNovoEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        jNovoEmprestimo.setText("NOVO EMPRÉSTIMO");
        getContentPane().add(jNovoEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 310, 50));

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/TelaCadastrarEmpréstimos.png"))); // NOI18N
        jFundo.setText("jLabel1");
        getContentPane().add(jFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1366, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // CÓDIGO DO BOTÃO "CANCELAR":
        limparCampos();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // CÓDIGO DO BOTÃO "SALVAR":
        String data_emprestimo = "xxxxxxxx";
        String data_devolucao = "xxxxxxxx";
        if (!jTxtCodigoLivro.getText().equals("") || jTxtRm.getText().equals("") || jTxtQuantidade.getText().equals("")) {
            VerificarQuantidade verificarquantidade_objeto = new VerificarQuantidade();
            int quantidade = Integer.parseInt(jTxtQuantidade.getText().replaceAll("[^0-9]", ""));
            if (verificarquantidade_objeto.verificarQuantidade(quantidade, jTxtCodigoLivro.getText().replaceAll("[^0-9]", ""))) {
                JOptionPane.showMessageDialog(null, "Livro disponível!");
                EmprestimoClass emprestimoclass_objeto = new EmprestimoClass();
                if (emprestimoclass_objeto.cadastrarEmprestimo(jTxtCodigoLivro.getText(), jTxtRm.getText(), data_emprestimo, data_devolucao, jTxtQuantidade.getText())) {
                    JOptionPane.showMessageDialog(this, "Empréstimo cadastrado com sucesso!");
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Empréstimo NÃO foi cadastrado, tente novamente!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Livro indisponível");
                limparCampos();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        }
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jTxtRmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRmActionPerformed

    private void jTxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantidadeActionPerformed

    private void jHamburguinho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHamburguinho1MouseClicked
        // CÓDIGO DO LABEL "HAMBURGUINHO":
        if (x == 0) {
            jPanel1.show();
            jPanel1.setSize(x, 770);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(1);
                            jPanel1.setSize(i + 1, 770);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, "ERRO: " + e);
                    }
                }
            };
            th.start();
            x = 230;
        }
    }//GEN-LAST:event_jHamburguinho1MouseClicked

    private void jLbNovoAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbNovoAgendamentoMouseClicked
        // CÓDIGO DO LABEL "NOVO AGENDAMENTO":
        TelaCadastrarAgendamento telacadastraragendamento_objeto = new TelaCadastrarAgendamento();
        telacadastraragendamento_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbNovoAgendamentoMouseClicked

    private void jLbNovoAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbNovoAlunoMouseClicked
        // CÓDIGO DO LABEL "NOVO ALUNO":
        TelaCadastrarAluno telacadastraraluno_objeto = new TelaCadastrarAluno();
        telacadastraraluno_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbNovoAlunoMouseClicked

    private void jLbNovoEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbNovoEmprestimoMouseClicked
        // CÓDIGO DO LABEL "NOVO EMPRÉSTIMO":
        TelaCadastrarEmprestimo telacadastraremprestimo_objeto = new TelaCadastrarEmprestimo();
        telacadastraremprestimo_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbNovoEmprestimoMouseClicked

    private void jLbNovoLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbNovoLivroMouseClicked
        // CÓDIGO DO LABEL "NOVO LIVRO":
        TelaCadastrarLivro telacadastrarlivro_objeto = new TelaCadastrarLivro();
        telacadastrarlivro_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbNovoLivroMouseClicked

    private void jLbNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbNovoUsuarioMouseClicked
        // CÓDIGO DO LABEL "NOVO USUÁRIO":
        TelaCadastrarUsuario telacadastrarusuario_objeto = new TelaCadastrarUsuario();
        telacadastrarusuario_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbNovoUsuarioMouseClicked
    int x = 0;
    private void jLbVisualizarAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbVisualizarAgendamentosMouseClicked
        // CÓDIGO DO LABEL "VISUALIZAR AGENDAMENTOS":
        TelaVisualizarAgendamento telavisualizaragendamentos_objeto = null;
        try {
            telavisualizaragendamentos_objeto = new TelaVisualizarAgendamento();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVisualizarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        telavisualizaragendamentos_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbVisualizarAgendamentosMouseClicked

    private void jLbVisualizarAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbVisualizarAlunosMouseClicked
        // CÓDIGO DO LABEL "VISUALIZAR ALUNOS":
        TelaVisualizarAlunos telavisualizaralunos_objeto = null;
        try {
            telavisualizaralunos_objeto = new TelaVisualizarAlunos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVisualizarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        telavisualizaralunos_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbVisualizarAlunosMouseClicked

    private void jLbVisualizarAtrasosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbVisualizarAtrasosMouseClicked
        // CÓDIGO DO LABEL "VISUALIZAR ATRASOS":
        TelaVisualizarAtrasos telavisualizaratrasos_objeto = null;
        try {
            telavisualizaratrasos_objeto = new TelaVisualizarAtrasos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVisualizarAtrasos.class.getName()).log(Level.SEVERE, null, ex);
        }
        telavisualizaratrasos_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbVisualizarAtrasosMouseClicked

    private void jLbVisualizarEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbVisualizarEmprestimosMouseClicked
        // CÓDIGO DO LABEL "VISUALIZAR EMPRÉSTIMOS":
        TelaVisualizarEmprestimos telavisualizaremprestimos_objeto = null;
        try {
            telavisualizaremprestimos_objeto = new TelaVisualizarEmprestimos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVisualizarEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        telavisualizaremprestimos_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbVisualizarEmprestimosMouseClicked

    private void jLbVisualizarHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbVisualizarHistoricoMouseClicked
        // CÓDIGO DO LABEL "VISUALIZAR HISTÓRICO":
        TelaVisualizarHistorico telavisualizarhistorico_objeto = null;
        try {
            telavisualizarhistorico_objeto = new TelaVisualizarHistorico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVisualizarHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
        telavisualizarhistorico_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbVisualizarHistoricoMouseClicked

    private void jLbVisualizarLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbVisualizarLivrosMouseClicked
        // CÓDIGO DO LABEL "VISUALIZAR HISTÓRICO":
        TelaVisualizarLivros telavisualizarlivros_objeto = null;
        try {
            telavisualizarlivros_objeto = new TelaVisualizarLivros();
        } catch (SQLException ex) {
            Logger.getLogger(TelaVisualizarLivros.class.getName()).log(Level.SEVERE, null, ex);
        }
        telavisualizarlivros_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbVisualizarLivrosMouseClicked

    private void jLbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSairMouseClicked
        // CÓDIGO DO LABEL "SAIR":
        LoginClass loginclass_objeto = new LoginClass();
        loginclass_objeto.setEmail("");
        loginclass_objeto.setSenha("");
        loginclass_objeto.setLogin(false);
        TelaLogin telalogin_objeto = new TelaLogin();
        telalogin_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLbSairMouseClicked

    private void jHamburguinho2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHamburguinho2MouseClicked
        // TODO add your handling code here:
        if (x == 230) {
            jPanel1.setSize(0, 770);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 230; i >= 0; i--) {
                            Thread.sleep(1);
                            jPanel1.setSize(i + 1, 770);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, "PROBLEMA: " + e);
                    }
                }
            };
            th.start();
            x = 0;
        }
    }//GEN-LAST:event_jHamburguinho2MouseClicked

    private void limparCampos() {
        jTxtCodigoLivro.setText("");
        jTxtRm.setText("");
        jTxtDataDevolucao.setText("");
        jTxtQuantidade.setText("");
    }

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
            java.util.logging.Logger.getLogger(TelaCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jFundoMenu;
    private javax.swing.JLabel jHamburguinho1;
    private javax.swing.JLabel jHamburguinho2;
    private javax.swing.JLabel jLbNovoAgendamento;
    private javax.swing.JLabel jLbNovoAluno;
    private javax.swing.JLabel jLbNovoEmprestimo;
    private javax.swing.JLabel jLbNovoLivro;
    private javax.swing.JLabel jLbNovoUsuario;
    private javax.swing.JLabel jLbSair;
    private javax.swing.JLabel jLbVisualizarAgendamentos;
    private javax.swing.JLabel jLbVisualizarAlunos;
    private javax.swing.JLabel jLbVisualizarAtrasos;
    private javax.swing.JLabel jLbVisualizarEmprestimos;
    private javax.swing.JLabel jLbVisualizarHistorico;
    private javax.swing.JLabel jLbVisualizarLivros;
    private javax.swing.JLabel jLupa;
    private javax.swing.JLabel jLupa1;
    private javax.swing.JLabel jLupa2;
    private javax.swing.JLabel jLupa3;
    private javax.swing.JLabel jLupa4;
    private javax.swing.JLabel jLupa5;
    private javax.swing.JLabel jMais;
    private javax.swing.JLabel jMais1;
    private javax.swing.JLabel jMais2;
    private javax.swing.JLabel jMais3;
    private javax.swing.JLabel jMais4;
    private javax.swing.JLabel jNovoEmprestimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jSair;
    private javax.swing.JFormattedTextField jTxtCodigoLivro;
    private javax.swing.JFormattedTextField jTxtDataDevolucao;
    private javax.swing.JFormattedTextField jTxtQuantidade;
    private javax.swing.JFormattedTextField jTxtRm;
    // End of variables declaration//GEN-END:variables
}

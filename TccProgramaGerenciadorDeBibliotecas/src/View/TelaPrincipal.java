/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginClass;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-Gamer
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnCadastrarEmprestimo = new javax.swing.JButton();
        jBtnCadastrarLivro = new javax.swing.JButton();
        jBtnCadastrarUsuario = new javax.swing.JButton();
        jBtnVisualizarAlunos = new javax.swing.JButton();
        jBtnVisualizarAtrasos = new javax.swing.JButton();
        jBtnVisualizarEmprestimos = new javax.swing.JButton();
        jBtnVisualizarLivros = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastrarEmprestimo = new javax.swing.JMenuItem();
        jMenuCadastrarLivro = new javax.swing.JMenuItem();
        jMenuCadastrarUsuario = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        setUndecorated(true);

        jBtnCadastrarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Cadatrar Empréstimo.png"))); // NOI18N
        jBtnCadastrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarEmprestimoActionPerformed(evt);
            }
        });

        jBtnCadastrarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Cadatrar Livro.png"))); // NOI18N
        jBtnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarLivroActionPerformed(evt);
            }
        });

        jBtnCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Cadatrar Usário.png"))); // NOI18N
        jBtnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarUsuarioActionPerformed(evt);
            }
        });

        jBtnVisualizarAlunos.setText("VISUALIZAR ALUNOS");
        jBtnVisualizarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVisualizarAlunosActionPerformed(evt);
            }
        });

        jBtnVisualizarAtrasos.setText("VISUALIZAR ATRASOS");
        jBtnVisualizarAtrasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVisualizarAtrasosActionPerformed(evt);
            }
        });

        jBtnVisualizarEmprestimos.setText("VISUALIZAR EMPRÉSTIMOS");
        jBtnVisualizarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVisualizarEmprestimosActionPerformed(evt);
            }
        });

        jBtnVisualizarLivros.setText("VISUALIZAR LIVROS");
        jBtnVisualizarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVisualizarLivrosActionPerformed(evt);
            }
        });

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Sair.png"))); // NOI18N
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jMenu1.setText("Funções");

        jMenuCadastrarEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCadastrarEmprestimo.setText("Cadastrar novo EMPRÉSTIMO");
        jMenuCadastrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarEmprestimoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrarEmprestimo);

        jMenuCadastrarLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCadastrarLivro.setText("Cadastrar novo LIVRO");
        jMenuCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarLivroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrarLivro);

        jMenuCadastrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCadastrarUsuario.setText("Cadastrar novo USUÁRIO");
        jMenuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrarUsuario);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Visualizar Alunos");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Visualizar Atrasos");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Visualizar Empréstimos");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Visualizar Livros");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnCadastrarEmprestimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCadastrarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCadastrarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnVisualizarAlunos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVisualizarAtrasos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVisualizarEmprestimos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVisualizarLivros)))
                .addContainerGap(728, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVisualizarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnVisualizarAtrasos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnVisualizarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnVisualizarEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(380, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chamarTelaVisualizarAlunos() throws SQLException {
        TelaVisualizarAlunos telavisualizaralunos_objeto = new TelaVisualizarAlunos();
        telavisualizaralunos_objeto.setVisible(true);
        this.setVisible(false);
    }

    private void chamarTelaVisualizarAtrasos() throws SQLException {
        TelaVisualizarAtrasos telavisualizaratrasos_objeto = new TelaVisualizarAtrasos();
        telavisualizaratrasos_objeto.setVisible(true);
        this.setVisible(false);
    }

    private void chamarTelaVisualizarLivros() throws SQLException {
        TelaVisualizarLivros telavisualizaralivos_objeto = new TelaVisualizarLivros();
        telavisualizaralivos_objeto.setVisible(true);
        this.setVisible(false);
    }

    private void chamarTelaCadastrarEmprestimo() {
        TelaCadastrarEmprestimo telacadastraremprestimo_objeto = new TelaCadastrarEmprestimo();
        telacadastraremprestimo_objeto.setVisible(true);
        this.setVisible(false);
    }

    private void chamarTelaCadastrarLivro() {
        TelaCadastrarLivro telacadastrarlivro_objeto = new TelaCadastrarLivro();
        telacadastrarlivro_objeto.setVisible(true);
        this.setVisible(false);
    }

    private void chamarTelaCadastrarUsuario() {
        TelaCadastrarUsuario telacadastrarusuario_objeto = new TelaCadastrarUsuario();
        telacadastrarusuario_objeto.setVisible(true);
        this.setVisible(false);
    }

    private void chamarTelaVisualizarEmprestimo() throws SQLException {
        TelaVisualizarEmprestimos telavisualizaremprestimo_objeto = new TelaVisualizarEmprestimos();
        telavisualizaremprestimo_objeto.setVisible(true);
        this.setVisible(false);
    }
    private void jBtnCadastrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarEmprestimoActionPerformed
        // CÓDIGO DO BOTÃO "CADASTRAR EMPRÉSTIMO":
        chamarTelaCadastrarEmprestimo();
    }//GEN-LAST:event_jBtnCadastrarEmprestimoActionPerformed

    private void jBtnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarLivroActionPerformed
        // CÓDIGO DO BOTÃO "CADASTRAR LIVRO":
        chamarTelaCadastrarLivro();
    }//GEN-LAST:event_jBtnCadastrarLivroActionPerformed

    private void jBtnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarUsuarioActionPerformed
        // CÓDIGO DO BOTÃO "CADASTRAR USUÁRIO":
        chamarTelaCadastrarUsuario();
    }//GEN-LAST:event_jBtnCadastrarUsuarioActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // CÓDIGO DO BOTÃO "SAIR":
        LoginClass loginclass_objeto = new LoginClass();
        loginclass_objeto.setUsuario("");
        loginclass_objeto.setSenha("");
        loginclass_objeto.setLogin(false);
        TelaLogin telalogin_objeto = new TelaLogin();
        telalogin_objeto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jMenuCadastrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarEmprestimoActionPerformed
        // CÓDIGO DO MENU "CADASTRAR EMPRÉSTIMO":
        chamarTelaCadastrarEmprestimo();
    }//GEN-LAST:event_jMenuCadastrarEmprestimoActionPerformed

    private void jMenuCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarLivroActionPerformed
        // CÓDIGO DO MENU "CADASTRAR LIVRO":
        chamarTelaCadastrarLivro();
    }//GEN-LAST:event_jMenuCadastrarLivroActionPerformed

    private void jMenuCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarUsuarioActionPerformed
        // CÓDIGO DO MENU "CADASTRAR USUARIO":
        chamarTelaCadastrarUsuario();
    }//GEN-LAST:event_jMenuCadastrarUsuarioActionPerformed

    private void jBtnVisualizarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVisualizarEmprestimosActionPerformed
        try {
            // TODO add your handling code here:
            chamarTelaVisualizarEmprestimo();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnVisualizarEmprestimosActionPerformed

    private void jBtnVisualizarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVisualizarLivrosActionPerformed
        try {
            // CÓDIGO DO BOTÃO "TELA VISUALIZAR LIVROS":
            chamarTelaVisualizarLivros();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnVisualizarLivrosActionPerformed

    private void jBtnVisualizarAtrasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVisualizarAtrasosActionPerformed
        try {
            // CÓDIGO DO BOTÃO "VISUALIZAR ATRASOS":
            chamarTelaVisualizarAtrasos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnVisualizarAtrasosActionPerformed

    private void jBtnVisualizarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVisualizarAlunosActionPerformed
        try {
            // CÓDIGO DO BOTÃO "VISUALIZAR ALUNOS":
            chamarTelaVisualizarAlunos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnVisualizarAlunosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrarEmprestimo;
    private javax.swing.JButton jBtnCadastrarLivro;
    private javax.swing.JButton jBtnCadastrarUsuario;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnVisualizarAlunos;
    private javax.swing.JButton jBtnVisualizarAtrasos;
    private javax.swing.JButton jBtnVisualizarEmprestimos;
    private javax.swing.JButton jBtnVisualizarLivros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrarEmprestimo;
    private javax.swing.JMenuItem jMenuCadastrarLivro;
    private javax.swing.JMenuItem jMenuCadastrarUsuario;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}

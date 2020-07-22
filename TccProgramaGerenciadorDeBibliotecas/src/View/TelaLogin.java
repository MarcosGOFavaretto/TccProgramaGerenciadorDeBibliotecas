/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginClass;
import Model.ConsultarUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jBtnFechar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnEntrar = new javax.swing.JButton();
        jTxtSenha = new javax.swing.JPasswordField();
        jSenha = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jUsuario = new javax.swing.JLabel();
        jLogo = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnFechar.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        jBtnFechar.setText("FECHAR");
        jBtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 250, 30));

        jBtnCancelar.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 250, 30));

        jBtnEntrar.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        jBtnEntrar.setText("ENTRAR");
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 250, 30));
        getContentPane().add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 270, 30));

        jSenha.setFont(new java.awt.Font("Artifakt Element", 1, 24)); // NOI18N
        jSenha.setForeground(new java.awt.Color(255, 255, 255));
        jSenha.setText("SENHA");
        getContentPane().add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jTxtEmail.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        getContentPane().add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 280, 30));

        jUsuario.setFont(new java.awt.Font("Artifakt Element", 1, 24)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jUsuario.setText("USUÁRIO");
        getContentPane().add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ICON - Logo.png"))); // NOI18N
        jLogo.setText("jLabel1");
        getContentPane().add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, -200, -1, -1));

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/TelaLogin.png"))); // NOI18N
        getContentPane().add(jFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -120, 1600, 900));

        setSize(new java.awt.Dimension(1072, 703));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        jTxtEmail.setText("");
        jTxtSenha.setText("");
    }
    private void jBtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFecharActionPerformed
        // CÓDIGO DO BOTÃO "FECHAR":
        System.exit(0);
    }//GEN-LAST:event_jBtnFecharActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // CÓDIGO DO BOTÃO "CANCELAR":
        limparCampos();
    }//GEN-LAST:event_jBtnCancelarActionPerformed
    public static boolean validarEmail(String email) {
        if (email != null && email.length() > 0) {
            String mascara = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(mascara, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEntrarActionPerformed
        // CÓDIGO DO BOTÃO "ENTRAR":
        if (!jTxtEmail.getText().equals("") || jTxtSenha.getText().equals("")) {
            if (validarEmail(jTxtEmail.getText())) {
                ConsultarUsuario consultarusuario_objeto = new ConsultarUsuario();
                LoginClass loginclass_objeto = new LoginClass();
                loginclass_objeto.setEmail(this.jTxtEmail.getText());
                loginclass_objeto.setSenha(this.jTxtSenha.getText());
                if (consultarusuario_objeto.ConsultarUsuario(loginclass_objeto.getEmail(), loginclass_objeto.getSenha())) {
                    JOptionPane.showMessageDialog(this, "Usuário reconhecido!");
                    limparCampos();
                    TelaVisualizarEmprestimos telavisualizaremprestimos_objeto = null;
                    try {
                        telavisualizaremprestimos_objeto = new TelaVisualizarEmprestimos();
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.setVisible(false);
                    telavisualizaremprestimos_objeto.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário NÃO reconhecido, tente novamente!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Email inválido!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        }
    }//GEN-LAST:event_jBtnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEntrar;
    private javax.swing.JButton jBtnFechar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jLogo;
    private javax.swing.JLabel jSenha;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JLabel jUsuario;
    // End of variables declaration//GEN-END:variables
}

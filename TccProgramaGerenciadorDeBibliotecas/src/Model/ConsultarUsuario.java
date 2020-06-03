/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author T-Gamer
 */
public class ConsultarUsuario {

    private Conexao conexao_objeto = new Conexao();

    private String sql_consultarusuario;
    private PreparedStatement statement_consultarusuario;
    private ResultSet resultset_consultarusuario;

    public boolean ConsultarUsuario(String usuario, String senha) {
        try {
            sql_consultarusuario = "SELECT * FROM tabela_usuarios WHERE nome=? and senha=?";
            conexao_objeto.AbrirConexao();
            statement_consultarusuario = conexao_objeto.conexao.prepareStatement(sql_consultarusuario);
            statement_consultarusuario.setString(1, usuario);
            statement_consultarusuario.setString(2, senha);
            resultset_consultarusuario = statement_consultarusuario.executeQuery();
            if ((resultset_consultarusuario.getString("nome").equals(usuario)) && (resultset_consultarusuario.getString("senha").equals(senha))) {
                System.out.println("Usuário reconhecido!");
                return true;
            } else {
                System.out.println("Usuário NÃO reconhecido!");
                return false;
            }
        } catch (SQLException erro_consultarusuario) {
            System.err.println("Problema ao tentar consultar o usuário, ERRO: " + erro_consultarusuario);
            return false;
        }
    }
}

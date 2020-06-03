/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author T-Gamer
 */
public class CadastrarUsuario {

    private Conexao conexao_objeto = new Conexao();
    private String sql_cadastrarusuario;
    private PreparedStatement statement_cadastrarusuario;

    public boolean cadastrarUsuario(String rm_usuario, String nome, String senha, String email, String telefone, String endereco) {
        try {
            sql_cadastrarusuario = "INSERT INTO tabela_usuarios(rm_usuario,nome,senha,email,telefone,endereco) VALUES(?,?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastrarusuario = conexao_objeto.conexao.prepareStatement(sql_cadastrarusuario);
            statement_cadastrarusuario.setString(1, rm_usuario);
            statement_cadastrarusuario.setString(2, nome);
            statement_cadastrarusuario.setString(3, senha);
            statement_cadastrarusuario.setString(4, email);
            statement_cadastrarusuario.setString(5, telefone);
            statement_cadastrarusuario.setString(6, endereco);
            if (!statement_cadastrarusuario.execute()) {
                System.out.println("Usuário cadastrado!");
                return true;
            } else {
                System.out.println("Usuário NÃO cadastrado!");
                return false;
            }
        } catch (SQLException erro_cadastrarusuario) {
            System.err.println("Problema ao tentar cadastrar o usuário, ERRO: " + erro_cadastrarusuario);
            return false;
        }
    }
}

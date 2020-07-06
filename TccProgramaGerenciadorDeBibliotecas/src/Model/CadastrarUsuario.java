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

    public boolean cadastrarUsuario(String nome, String email, String senha, String endereco, String telefone) {
        try {
            sql_cadastrarusuario = "INSERT INTO tabela_usuarios(nome,email,senha,endereco,telefone) VALUES(?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastrarusuario = conexao_objeto.conexao.prepareStatement(sql_cadastrarusuario);
            statement_cadastrarusuario.setString(1, nome);
            statement_cadastrarusuario.setString(2, email);
            statement_cadastrarusuario.setString(3, senha);
            statement_cadastrarusuario.setString(4, endereco);
            statement_cadastrarusuario.setString(5, telefone);
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

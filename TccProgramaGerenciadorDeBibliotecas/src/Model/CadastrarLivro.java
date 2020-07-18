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
public class CadastrarLivro {

    private Conexao conexao_objeto = new Conexao();
    private String sql_cadastrarlivro;
    private PreparedStatement statement_cadastrarlivro;

    public boolean cadastrarUsuario(String nome_livro, String autor, String editora, String ano, String quantidade) {
        try {
            sql_cadastrarlivro = "INSERT INTO tabela_livros(nome_livro,autor_livro,editora_livro,ano_lancamento_livro, quantidade_livro) VALUES(?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastrarlivro = conexao_objeto.conexao.prepareStatement(sql_cadastrarlivro);
            statement_cadastrarlivro.setString(1, nome_livro);
            statement_cadastrarlivro.setString(2, autor);
            statement_cadastrarlivro.setString(3, editora);
            statement_cadastrarlivro.setString(4, ano);
            statement_cadastrarlivro.setString(5, quantidade);
            if (!statement_cadastrarlivro.execute()) {
                System.out.println("Livro cadastrado!");
                return true;
            } else {
                System.out.println("Livro NÃO cadastrado!");
                return false;
            }
        } catch (SQLException erro_cadastrarlivro) {
            System.err.println("Problema ao tentar cadastrar livro, ERRO: " + erro_cadastrarlivro);
            return false;
        }
    }
}

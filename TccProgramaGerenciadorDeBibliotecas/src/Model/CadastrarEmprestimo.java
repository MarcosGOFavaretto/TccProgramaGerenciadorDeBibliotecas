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
public class CadastrarEmprestimo {

    private Conexao conexao_objeto = new Conexao();
    private String sql_cadastraremprestimo;
    private PreparedStatement statement_cadastraremprestimo;

    public boolean cadastrarUsuario(String nome_aluno, String rm_aluno, String nome_livro, String data, String sala) {
        try {
            sql_cadastraremprestimo = "INSERT INTO tabela_emprestimos(nome_aluno,rm_aluno,nome_livro,data,sala) VALUES(?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastraremprestimo = conexao_objeto.conexao.prepareStatement(sql_cadastraremprestimo);
            statement_cadastraremprestimo.setString(1, nome_aluno);
            statement_cadastraremprestimo.setString(2, rm_aluno);
            statement_cadastraremprestimo.setString(3, nome_livro);
            statement_cadastraremprestimo.setString(4, data);
            statement_cadastraremprestimo.setString(5, sala);
            if (!statement_cadastraremprestimo.execute()) {
                System.out.println("Empréstimo cadastrado!");
                return true;
            } else {
                System.out.println("Empréstimo NÃO cadastrado!");
                return false;
            }
        } catch (SQLException erro_cadastraremprestimo) {
            System.err.println("Problema ao tentar cadastrar empréstimo, ERRO: " + erro_cadastraremprestimo);
            return false;
        }
    }
}

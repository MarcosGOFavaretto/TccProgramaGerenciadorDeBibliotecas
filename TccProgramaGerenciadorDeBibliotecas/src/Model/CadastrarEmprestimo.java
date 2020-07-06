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

    public boolean cadastrarUsuario(String codigo_livro, String rm_aluno, String data_emprestimo, String data_devolucao, String quantidade) {
        try {
            sql_cadastraremprestimo = "INSERT INTO tabela_emprestimos(id_livro,rm_aluno,data_emprestimo,data_devolucao,quantidade) VALUES(?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastraremprestimo = conexao_objeto.conexao.prepareStatement(sql_cadastraremprestimo);
            statement_cadastraremprestimo.setString(1, codigo_livro);
            statement_cadastraremprestimo.setString(2, rm_aluno);
            statement_cadastraremprestimo.setString(3, data_emprestimo);
            statement_cadastraremprestimo.setString(4, data_devolucao);
            statement_cadastraremprestimo.setString(5, quantidade);
            if (!statement_cadastraremprestimo.execute()) {
                System.out.println("Empréstimo cadastrado!");
                System.out.println(codigo_livro);
                System.out.println(rm_aluno);
                System.out.println(data_emprestimo);
                System.out.println(data_devolucao);
                System.out.println(quantidade);
                
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

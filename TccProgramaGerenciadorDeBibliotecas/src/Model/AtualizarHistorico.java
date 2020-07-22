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
public class AtualizarHistorico {

    private Conexao conexao_objeto = new Conexao();
    private String sql_atualizarhistorico;
    private PreparedStatement statement_atualizarhistorico;
    private String sql_atualizardatahistorico;
    private PreparedStatement statement_atualizardatahistorico;

    public boolean atualizarHistorico(String id_emprestimo, String rm_aluno, String id_livro, String quantidade) {
        try {
            sql_atualizarhistorico = "UPDATE tabela_emprestimos SET rm_aluno=?, id_livro=?, quantidade=? WHERE id_emprestimo =?";
            conexao_objeto.AbrirConexao();
            statement_atualizarhistorico = conexao_objeto.conexao.prepareStatement(sql_atualizarhistorico);
            statement_atualizarhistorico.setString(1, rm_aluno);
            statement_atualizarhistorico.setString(2, id_livro);
            statement_atualizarhistorico.setString(3, quantidade);
            statement_atualizarhistorico.setString(4, id_emprestimo);
            if (!statement_atualizarhistorico.execute()) {
                System.out.println("Histórico atualizado!");
                return true;
            } else {
                System.out.println("Histórico NÃO atualizado!");
                return false;
            }
        } catch (SQLException erro_atualizarhistorio) {
            System.err.println("Problema ao tentar atualizar o histórico, ERRO: " + erro_atualizarhistorio);
            return false;
        }
    }

    public boolean atualizarDataHistorico(String id_emprestimo, String data_entrega) {
        try {
            sql_atualizardatahistorico = "UPDATE tabela_emprestimos SET data_entrega=? WHERE id_emprestimo =?";
            conexao_objeto.AbrirConexao();
            statement_atualizardatahistorico = conexao_objeto.conexao.prepareStatement(sql_atualizardatahistorico);
            statement_atualizardatahistorico.setString(1, data_entrega);
            statement_atualizardatahistorico.setString(2, id_emprestimo);
            if (!statement_atualizardatahistorico.execute()) {
                System.out.println("Data atualizada!");
                return true;
            } else {
                System.out.println("Data NÃO atualizada!");
                return false;
            }
        } catch (SQLException erro_atualizardatahistorico) {
            System.err.println("Problema ao tentar atualizar a data do historico, ERRO: " + erro_atualizardatahistorico);
            return false;
        }
    }
}

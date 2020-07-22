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
public class AtualizarEmprestimo {

    private Conexao conexao_objeto = new Conexao();
    private String sql_atualizaremprestimo;
    private PreparedStatement statement_atualizaremprestimo;
    private String sql_atualizardataentrega;
    private PreparedStatement statement_atualizardataentrega;
    private AtualizarHistorico atualizarhistorico_objeto = new AtualizarHistorico();

    public boolean atualizarEmprestimo(String id_emprestimo, String rm_aluno, String id_livro, String quantidade) {
        try {
            sql_atualizaremprestimo = "UPDATE tabela_historico SET rm_aluno=?, id_livro=?, quantidade=? WHERE id_emprestimo =?";
            conexao_objeto.AbrirConexao();
            statement_atualizaremprestimo = conexao_objeto.conexao.prepareStatement(sql_atualizaremprestimo);
            statement_atualizaremprestimo.setString(1, rm_aluno);
            statement_atualizaremprestimo.setString(2, id_livro);
            statement_atualizaremprestimo.setString(3, quantidade);
            statement_atualizaremprestimo.setString(4, id_emprestimo);
            if (!statement_atualizaremprestimo.execute()) {
                System.out.println("Empréstimo atualizado!");
                atualizarhistorico_objeto.atualizarHistorico(id_emprestimo, rm_aluno, id_livro, quantidade);
                return true;
            } else {
                System.out.println("Empréstimo NÃO atualizado!");
                return false;
            }
        } catch (SQLException erro_atualizaremprestimo) {
            System.err.println("Problema ao tentar atualizar o empréstimo, ERRO: " + erro_atualizaremprestimo);
            return false;
        }
    }

    public boolean atualizarDataEntrega(String id_emprestimo, String data_entrega) {
        try {
            sql_atualizardataentrega = "UPDATE tabela_historico SET data_entrega=? WHERE id_emprestimo =?";
            conexao_objeto.AbrirConexao();
            statement_atualizardataentrega = conexao_objeto.conexao.prepareStatement(sql_atualizardataentrega);
            statement_atualizardataentrega.setString(1, data_entrega);
            statement_atualizardataentrega.setString(2, id_emprestimo);
            if (!statement_atualizardataentrega.execute()) {
                System.out.println("Data atualizada!");
                return true;
            } else {
                System.out.println("Data NÃO atualizada!");
                return false;
            }
        } catch (SQLException erro_atualizardataentrega) {
            System.err.println("Problema ao tentar atualizar a data, ERRO: " + erro_atualizardataentrega);
            return false;
        }
    }
}

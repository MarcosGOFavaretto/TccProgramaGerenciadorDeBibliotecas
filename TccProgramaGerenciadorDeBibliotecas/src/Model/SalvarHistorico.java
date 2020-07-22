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
public class SalvarHistorico {

    private Conexao conexao_objeto = new Conexao();
    private String sql_salvarhistorico;
    private PreparedStatement statement_salvarhistorico;

    public boolean salvarhistorico(String id_emprestimo, String codigo_livro, String rm_aluno, String data_emprestimo, String data_devolucao, String quantidade) {
        try {
            sql_salvarhistorico = "INSERT INTO tabela_historico(id_livro,rm_aluno,data_emprestimo,data_entrega,quantidade,id_emprestimo) VALUES(?,?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_salvarhistorico = conexao_objeto.conexao.prepareStatement(sql_salvarhistorico);
            statement_salvarhistorico.setString(1, codigo_livro);
            statement_salvarhistorico.setString(2, rm_aluno);
            statement_salvarhistorico.setString(3, data_emprestimo);
            statement_salvarhistorico.setString(4, data_devolucao);
            statement_salvarhistorico.setString(5, quantidade);
            statement_salvarhistorico.setString(6, id_emprestimo);
            if (!statement_salvarhistorico.execute()) {
                System.out.println("Salvo no histórico!");
                return true;
            } else {
                System.out.println("O registro NÃO foi salvo no histórico!");
                return false;
            }
        } catch (SQLException erro_salvarhistorico) {
            System.err.println("Problema ao tentar salvar registro no histórico, ERRO: " + erro_salvarhistorico);
            return false;
        }
    }
}

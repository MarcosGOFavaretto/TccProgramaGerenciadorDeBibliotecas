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
public class CadastrarAgendamento {

    private Conexao conexao_objeto = new Conexao();
    private String sql_cadastraragendamento;
    private PreparedStatement statement_cadastraragendamento;

    public boolean cadastrarAgendamento(int rm_aluno, int id_livro, int quantidade) {
        try {
            sql_cadastraragendamento = "INSERT INTO tabela_agendamentos(rm_aluno,id_livro,quantidade) VALUES(?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastraragendamento = conexao_objeto.conexao.prepareStatement(sql_cadastraragendamento);
            statement_cadastraragendamento.setInt(1, rm_aluno);
            statement_cadastraragendamento.setInt(2, id_livro);
            statement_cadastraragendamento.setInt(3, quantidade);
            if (!statement_cadastraragendamento.execute()) {
                System.out.println("Agendamento cadastrado!");
                return true;
            } else {
                System.out.println("Agendamento NÃO cadastrado!");
                return false;
            }
        } catch (SQLException erro_cadastraragendamento) {
            System.err.println("Problema ao tentar cadastrar agendamento, ERRO: " + erro_cadastraragendamento);
            return false;
        }
    }
}

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
public class VerificarQuantidade {

    private String sql_verificarquantidadeagendamento;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_verificarquantidadeagendamento;
    private ResultSet resultset_verificarquantidadeagendamento;
    private int quantidade_banco = 0;

    public boolean verificarQuantidadeAgendamento(int quantidade, String id_livro) {

        try {
            sql_verificarquantidadeagendamento = "SELECT * FROM tabela_livros WHERE id_livro=?";
            conexao_objeto.AbrirConexao();
            statement_verificarquantidadeagendamento = conexao_objeto.conexao.prepareStatement(sql_verificarquantidadeagendamento);
            statement_verificarquantidadeagendamento.setString(1, id_livro);
            resultset_verificarquantidadeagendamento = statement_verificarquantidadeagendamento.executeQuery();
            quantidade_banco = resultset_verificarquantidadeagendamento.getInt("quantidade");
            if (quantidade_banco >= quantidade) {
                System.out.println("Livro disponível!");
                return true;
            } else {
                System.out.println("Livro indisponível!");
                return false;
            }
        } catch (SQLException erro_verificarquantidadeagendamento) {
            System.err.println("Problema ao tentar verificar a quantidade de livros para o agendamento, ERRO: " + erro_verificarquantidadeagendamento);
            return false;
        }
    }
}

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
public class VisualizarAgendamento {

    private String sql_visualizaragendamento = null;
    private ResultSet resultset_visualizaragendamento = null;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_visualizaragendamento = null;

    public ResultSet visualizarAgendamento() {
        try {
            sql_visualizaragendamento = "SELECT * FROM tabela_agendamentos WHERE 1";
            conexao_objeto.AbrirConexao();
            statement_visualizaragendamento = conexao_objeto.conexao.prepareStatement(sql_visualizaragendamento);
            resultset_visualizaragendamento = statement_visualizaragendamento.executeQuery();
            return resultset_visualizaragendamento;
        } catch (SQLException erro_visualizaragendamento) {
            System.err.println("Problema ao tentar visualizar os agendamentos, ERRO: " + erro_visualizaragendamento);
            return resultset_visualizaragendamento;
        }

    }
}

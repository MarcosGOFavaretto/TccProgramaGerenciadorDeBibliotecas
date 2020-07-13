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
public class VisualizarHistorico {

    private String sql_visualizarhistorico = null;
    private ResultSet resultset_visualizarhistorico = null;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_visualizarhistorico = null;

    public ResultSet visualizarHistorico() {
        try {
            sql_visualizarhistorico = "SELECT * FROM tabela_historico WHERE 1";
            conexao_objeto.AbrirConexao();
            statement_visualizarhistorico = conexao_objeto.conexao.prepareStatement(sql_visualizarhistorico);
            resultset_visualizarhistorico = statement_visualizarhistorico.executeQuery();
            return resultset_visualizarhistorico;
        } catch (SQLException erro_visualizarhistorico) {
            System.err.println("Problema ao tentar visualizar os empréstimos, ERRO: " + erro_visualizarhistorico);
            return resultset_visualizarhistorico;
        }

    }
}

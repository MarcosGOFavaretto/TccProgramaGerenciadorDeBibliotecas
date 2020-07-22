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
public class VisualizarAtrasos {

    private String sql_visualizaratrasos = null;
    private ResultSet resultset_visualizaratrasos = null;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_visualizaratrasos = null;

    public ResultSet visualizarAtrasos() {
        try {
            sql_visualizaratrasos = "SELECT * FROM tabela_emprestimos WHERE 1";
            conexao_objeto.AbrirConexao();
            statement_visualizaratrasos = conexao_objeto.conexao.prepareStatement(sql_visualizaratrasos);
            resultset_visualizaratrasos = statement_visualizaratrasos.executeQuery();
            return resultset_visualizaratrasos;
        } catch (SQLException erro_visualizaratrasos) {
            System.err.println("Problema ao tentar visualizar os atrasos, ERRO: " + erro_visualizaratrasos);
            return resultset_visualizaratrasos;
        }

    }
}

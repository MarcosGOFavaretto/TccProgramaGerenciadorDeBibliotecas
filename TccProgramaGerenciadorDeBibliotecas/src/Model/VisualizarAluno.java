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
public class VisualizarAluno {

    private String sql_visualizaraluno = null;
    private ResultSet resultset_visualizaraluno = null;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_visualizaraluno = null;

    public ResultSet visualizarAluno() {
        try {
            sql_visualizaraluno = "SELECT * FROM tabela_alunos WHERE 1";
            conexao_objeto.AbrirConexao();
            statement_visualizaraluno = conexao_objeto.conexao.prepareStatement(sql_visualizaraluno);
            resultset_visualizaraluno = statement_visualizaraluno.executeQuery();
            return resultset_visualizaraluno;
        } catch (SQLException erro_visualizaraluno) {
            System.err.println("Problema ao tentar visualizar os alunos, ERRO: " + erro_visualizaraluno);
            return resultset_visualizaraluno;
        }

    }
}

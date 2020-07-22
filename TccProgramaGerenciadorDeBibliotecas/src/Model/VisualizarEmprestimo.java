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
public class VisualizarEmprestimo {

    private String sql_visualizaremprestimo = null;
    private ResultSet resultset_visualizaremprestimo = null;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_visualizaremprestimo = null;
    private String sql_visualizarultimoemprestimo = null;
    private ResultSet resultset_visualizarultimoemprestimo = null;
    private PreparedStatement statement_visualizarultimoemprestimo = null;

    public ResultSet visualizarEmprestimo() {
        try {
            sql_visualizaremprestimo = "SELECT * FROM tabela_emprestimos WHERE 1";
            conexao_objeto.AbrirConexao();
            statement_visualizaremprestimo = conexao_objeto.conexao.prepareStatement(sql_visualizaremprestimo);
            resultset_visualizaremprestimo = statement_visualizaremprestimo.executeQuery();
            return resultset_visualizaremprestimo;
        } catch (SQLException erro_visualizaremprestimo) {
            System.err.println("Problema ao tentar visualizar os empréstimos, ERRO: " + erro_visualizaremprestimo);
            return resultset_visualizaremprestimo;
        }

    }

    public ResultSet visualizarUltimoEmprestimo() {
        try {
            this.resultset_visualizarultimoemprestimo = null;
            sql_visualizarultimoemprestimo = "SELECT * FROM tabela_emprestimos WHERE id_emprestimo=(select max(id_emprestimo) from tabela_emprestimos)";
            conexao_objeto.AbrirConexao();
            statement_visualizarultimoemprestimo = conexao_objeto.conexao.prepareStatement(sql_visualizarultimoemprestimo);
            resultset_visualizarultimoemprestimo = statement_visualizarultimoemprestimo.executeQuery();
            return resultset_visualizarultimoemprestimo;
        } catch (SQLException erro_visualizarultimoemprestimo) {
            System.err.println("Problema ao tentar visualizar os empréstimos, ERRO: " + erro_visualizarultimoemprestimo);
            return resultset_visualizarultimoemprestimo;
        }

    }

}

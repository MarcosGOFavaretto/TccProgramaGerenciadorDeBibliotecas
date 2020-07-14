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
public class VisualizarLivro {

    private int id_livro = 0;
    private String nome_livro = null;
    private String autor = null;
    private String editora = null;
    private String ano_lancamento = null;
    private String sql_visualizarlivro = null;
    private ResultSet resultset_visualizarlivro = null;
    private Conexao conexao_objeto = new Conexao();
    private PreparedStatement statement_visualizarlivro = null;

    public ResultSet visualizarLivro() {
        try {
            sql_visualizarlivro = "SELECT * FROM tabela_livros WHERE 1";
            conexao_objeto.AbrirConexao();
            statement_visualizarlivro = conexao_objeto.conexao.prepareStatement(sql_visualizarlivro);
            resultset_visualizarlivro = statement_visualizarlivro.executeQuery();
            return resultset_visualizarlivro;
        } catch (SQLException erro_visualizarlivro) {
            System.err.println("Problema ao tentar visualizar os livros, ERRO: " + erro_visualizarlivro);
            return resultset_visualizarlivro;
        }

    }
}

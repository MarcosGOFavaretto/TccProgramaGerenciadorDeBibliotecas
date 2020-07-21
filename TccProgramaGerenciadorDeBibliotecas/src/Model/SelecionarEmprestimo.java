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
public class SelecionarEmprestimo {

    // DECLARANDO AS VARIÁVEIS:
    private String sql_selecionaremprestimo = "";
    private ResultSet resultset_selecionaremprestimo = null;
    private PreparedStatement statement_selecionaremprestimo = null;
    private Conexao conexao_objeto = new Conexao();

    public ResultSet selecionarEmprestimo(int id_emprestimo) {
        try {
            sql_selecionaremprestimo = "SELECT * FROM tabela_emprestimos WHERE id_emprestimo=?";
            conexao_objeto.AbrirConexao();
            statement_selecionaremprestimo = conexao_objeto.conexao.prepareStatement(sql_selecionaremprestimo);
            statement_selecionaremprestimo.setInt(1, id_emprestimo);
            resultset_selecionaremprestimo = statement_selecionaremprestimo.executeQuery();
        } catch (SQLException erro_selecionaremprestimo) {
            System.err.println("Problema ao tentar selecionar o emprestimo, ERRO: " + erro_selecionaremprestimo);
        }
        return resultset_selecionaremprestimo;
    }
}

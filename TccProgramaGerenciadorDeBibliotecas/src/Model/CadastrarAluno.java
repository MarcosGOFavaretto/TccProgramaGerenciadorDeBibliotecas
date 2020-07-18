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
public class CadastrarAluno {

    private Conexao conexao_objeto = new Conexao();
    private String sql_cadastraraluno;
    private PreparedStatement statement_cadastraraluno;

    public boolean cadastrarAluno(String rm, String sala, String curso, String email, String telefone, String nome) {
        try {
            sql_cadastraraluno = "INSERT INTO tabela_alunos(rm_aluno,sala_aluno,curso_aluno,email_aluno,telefone_aluno,nome_aluno) VALUES(?,?,?,?,?,?)";
            conexao_objeto.AbrirConexao();
            statement_cadastraraluno = conexao_objeto.conexao.prepareStatement(sql_cadastraraluno);
            statement_cadastraraluno.setString(1, rm);
            statement_cadastraraluno.setString(2, sala);
            statement_cadastraraluno.setString(3, curso);
            statement_cadastraraluno.setString(4, email);
            statement_cadastraraluno.setString(5, telefone);
            statement_cadastraraluno.setString(6, nome);
            if (!statement_cadastraraluno.execute()) {
                System.out.println("Aluno cadastrado!");
                return true;
            } else {
                System.out.println("Aluno NÃO cadastrado!");
                return false;
            }
        } catch (SQLException erro_cadastraraluno) {
            System.err.println("Problema ao tentar cadastrar o aluno, ERRO: " + erro_cadastraraluno);
            return false;
        }
    }
}

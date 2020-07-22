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
public class ConfirmarEntrega {

    private Conexao conexao_objeto = new Conexao();
    private String sql_confirmarentrega = "";
    private String sql_salvarsituacao = "";
    private PreparedStatement statement_confirmarentrega = null;
    private PreparedStatement statement_salvarsituacao = null;

    public boolean confirmarEntrega(String id_emprestimo) {
        try {
            sql_confirmarentrega = "DELETE FROM tabela_emprestimos WHERE id_emprestimo=?";
            conexao_objeto.AbrirConexao();
            statement_confirmarentrega = conexao_objeto.conexao.prepareStatement(sql_confirmarentrega);
            statement_confirmarentrega.setString(1, id_emprestimo);
            statement_confirmarentrega.execute();
            salvarSituacao(id_emprestimo);
            return true;
        } catch (SQLException erro_confirmarentrega) {
            System.err.println("Problema ao tentar confirmar a entrega, ERRO: " + erro_confirmarentrega);
            return false;
        }
    }

    private void salvarSituacao(String id_emprestimo) {
        try {
            sql_salvarsituacao = "UPDATE tabela_historico SET situacao='ENTREGUE' WHERE id_emprestimo=?";
            conexao_objeto.AbrirConexao();
            statement_salvarsituacao = conexao_objeto.conexao.prepareStatement(sql_salvarsituacao);
            statement_salvarsituacao.setString(1, id_emprestimo);
            if (!statement_salvarsituacao.execute()) {
                System.err.println("Situação atualizada");
            } else {
                System.err.println("Situação NÃO atualizada");
            }

        } catch (SQLException erro_salvarsituacao) {
            System.err.println("Problema ao tentar salvar a situacao em historico, ERRO: " + erro_salvarsituacao);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author T-Gamer
 */
public class Conexao {

    // DECLARANDO AS VARIÁVEIS GLOBAIS:
    public static Connection conexao;
    private final String url = "jdbc:sqlite:/";
    private final String projeto = "C:\\Users\\T-Gamer\\TccProgramaGerenciadordeBiblioteca\\TccProgramaGerenciadorDeBibliotecas\\bancodedados";
    private final String bancodedados = "/bd.db";

    // Criando o método para abrir a conexão:
    public void AbrirConexao() {
        try {
            if (conexao == null) {
            Class.forName("org.sqlite.JDBC");
            conexao = DriverManager.getConnection(url + projeto + bancodedados);
            }
            System.out.println("CONEXÃO = Aberta");
        } catch (ClassNotFoundException | SQLException erro_conectaraobanco) {
            System.err.println("Problema ao tentar abrir a conexao ao banco de dados, ERRO: " + erro_conectaraobanco);
            System.out.println("CONEXÃO = Indeterminada");
        }
    }

    // Criando método para fechar a conexão:
    public void FecharConexao() {
        try {
            if (conexao != null) {
                this.conexao.close();
                conexao.clearWarnings();
                System.out.println("CONEXÃO = Fechada");
            }
        } catch (SQLException erro_fecharconexao) {
            System.err.println("Problema ao tentar fechar a conexão ao banco de dados, ERRO: " + erro_fecharconexao);
            System.out.println("CONEXÃO = Indeterminada");
        }
    }
}

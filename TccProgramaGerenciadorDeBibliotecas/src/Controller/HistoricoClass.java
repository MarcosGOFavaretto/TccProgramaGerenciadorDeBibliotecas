/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SalvarHistorico;
import Model.VisualizarHistorico;
import java.sql.ResultSet;

/**
 *
 * @author T-Gamer
 */
public class HistoricoClass {

    private int id_emprestimo;
    private String id_livro;
    private String id_aluno;
    private String data_emprestimo;
    private String data_devolucao;
    private String situacao;
    public ResultSet resultset_visualizarhistorico;
    SalvarHistorico cadastraremprestimo_objeto = new SalvarHistorico();
    VisualizarHistorico visualizarhistorico_objeto = new VisualizarHistorico();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public String getId_livro() {
        return id_livro;
    }

    public String getId_aluno() {
        return id_aluno;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public String getSituacao() {
        return situacao;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public void setId_livro(String id_livro) {
        this.id_livro = id_livro;
    }

    public void setId_aluno(String id_aluno) {
        this.id_aluno = id_aluno;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ResultSet visualizarHistorico() {
        resultset_visualizarhistorico = visualizarhistorico_objeto.visualizarHistorico();
        return resultset_visualizarhistorico;
    }
}

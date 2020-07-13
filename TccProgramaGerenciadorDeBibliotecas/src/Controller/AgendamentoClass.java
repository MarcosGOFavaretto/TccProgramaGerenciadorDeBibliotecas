/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastrarAgendamento;
import Model.VisualizarAgendamento;
import java.sql.ResultSet;

/**
 *
 * @author T-Gamer
 */
public class AgendamentoClass {

    private int id_agendamento;
    private int rm_aluno;
    private int id_livro;
    private int quantidade;
    public ResultSet resultset_visualizaragendamento;
    private CadastrarAgendamento cadastraragendamento_objeto = new CadastrarAgendamento();
    private VisualizarAgendamento visualizaragendamento_objeto = new VisualizarAgendamento();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_agendamento() {
        return id_agendamento;
    }

    public int getRm_aluno() {
        return rm_aluno;
    }

    public int getId_livro() {
        return id_livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_agendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public void setRm_aluno(int rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean cadastrarAgendamento(int rm_aluno, int id_livro, int quantidade) {
        if (cadastraragendamento_objeto.cadastrarAgendamento(rm_aluno, id_livro, quantidade)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarAgendamento() {
        resultset_visualizaragendamento = visualizaragendamento_objeto.visualizarAgendamento();
        return resultset_visualizaragendamento;
    }
}

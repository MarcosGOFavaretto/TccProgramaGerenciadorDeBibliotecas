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

    private int codigoDoAgendamento;
    private int registroDeMatriculaDoAluno;
    private int codigoDoLivro;
    private int quantidade;
    public ResultSet resultadosDaVisualizacaoDeAgendamentos;
    private CadastrarAgendamento objetoDaClasseCadastrarAgendamento = new CadastrarAgendamento();
    private VisualizarAgendamento objetoDaClasseVisualizarAgendamento = new VisualizarAgendamento();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getCodigoDoAgendamento() {
        return codigoDoAgendamento;
    }

    public int getRegistroDeMatriculaDoAluno() {
        return registroDeMatriculaDoAluno;
    }

    public int getCodigoDoLivro() {
        return codigoDoLivro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setCodigoDoAgendamento(int codigoDoAgendamento) {
        this.codigoDoAgendamento = codigoDoAgendamento;
    }

    public void setRegistroDeMatriculaDoAluno(int registroDeMatriculaDoAluno) {
        this.registroDeMatriculaDoAluno = registroDeMatriculaDoAluno;
    }

    public void setCodigoDoLivro(int codigoDoLivro) {
        this.codigoDoLivro = codigoDoLivro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean cadastrarAgendamento(int rm_aluno, int id_livro, int quantidade) {
        if (objetoDaClasseCadastrarAgendamento.cadastrarAgendamento(rm_aluno, id_livro, quantidade)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarAgendamento() {
        resultadosDaVisualizacaoDeAgendamentos = objetoDaClasseVisualizarAgendamento.visualizarAgendamento();
        return resultadosDaVisualizacaoDeAgendamentos;
    }
}

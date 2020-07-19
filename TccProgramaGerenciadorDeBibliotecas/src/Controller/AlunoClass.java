/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastrarAluno;
import Model.VisualizarAluno;
import java.sql.ResultSet;

/**
 *
 * @author T-Gamer
 */
public class AlunoClass {

    private String rm_aluno;
    private String sala_aluno;
    private String curso_aluno;
    private String email_aluno;
    private String telefone_aluno;
    private String nome_aluno;
    private CadastrarAluno cadastraraluno_objeto = new CadastrarAluno();
    private VisualizarAluno visualizaraluno_objeto = new VisualizarAluno();
    private ResultSet resultset_visualizaraluno;

    // CRIANDO OS MÉTODOS "GETTERS":
    public String getRm_aluno() {
        return rm_aluno;
    }

    public String getSala_aluno() {
        return sala_aluno;
    }

    public String getCurso_aluno() {
        return curso_aluno;
    }

    public String getEmail_aluno() {
        return email_aluno;
    }

    public String getTelefone_aluno() {
        return telefone_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    // CRIANDO OS MÉTODOS "SETTERS": 
    public void setRm_aluno(String rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public void setSala_aluno(String sala_aluno) {
        this.sala_aluno = sala_aluno;
    }

    public void setCurso_aluno(String curso_aluno) {
        this.curso_aluno = curso_aluno;
    }

    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    public void setTelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public boolean cadastrarAluno(String rm, String sala, String curso, String email, String telefone, String nome) {
        if (cadastraraluno_objeto.cadastrarAluno(rm, sala, curso, email, telefone, nome)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarAluno() {
        resultset_visualizaraluno = visualizaraluno_objeto.visualizarAluno();
        return resultset_visualizaraluno;
    }
}

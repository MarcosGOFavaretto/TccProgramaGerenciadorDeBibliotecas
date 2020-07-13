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
    private String sala;
    private String curso;
    private String email;
    private String telefone;
    private String nome;
    private CadastrarAluno cadastraraluno_objeto = new CadastrarAluno();
    private VisualizarAluno visualizaraluno_objeto = new VisualizarAluno();
    private ResultSet resultset_visualizaraluno;

    // CRIANDO OS MÉTODOS "GETTERS":
    public String getRm_aluno() {
        return rm_aluno;
    }

    public String getSala() {
        return sala;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    // CRIANDO OS MÉTODOS "SETTERS": 
    public void setRm_aluno(String rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

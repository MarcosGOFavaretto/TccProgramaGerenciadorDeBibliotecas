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

    private String registroDeMatriculaDoAluno;
    private String salaDoAluno;
    private String cursoDoAluno;
    private String emailDoAluno;
    private String telefoneDoAluno;
    private String nomeDoAluno;
    private CadastrarAluno objetoDaClasseCadastrarAluno = new CadastrarAluno();
    private VisualizarAluno objetoDaClasseVisualizarAluno = new VisualizarAluno();
    private ResultSet resultadosDaVisualizaçãoDosAlunos;

    // CRIANDO OS MÉTODOS "GETTERS":
    public String getRegistroDeMatriculaDoAluno() {
        return registroDeMatriculaDoAluno;
    }

    public String getSalaDoAluno() {
        return salaDoAluno;
    }

    public String getCursoDoAluno() {
        return cursoDoAluno;
    }

    public String getEmailDoAluno() {
        return emailDoAluno;
    }

    public String getTelefoneDoAluno() {
        return telefoneDoAluno;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    // CRIANDO OS MÉTODOS "SETTERS": 
    public void setRegistroDeMatriculaDoAluno(String registroDeMatriculaDoAluno) {
        this.registroDeMatriculaDoAluno = registroDeMatriculaDoAluno;
    }

    public void setSalaDoAluno(String salaDoAluno) {
        this.salaDoAluno = salaDoAluno;
    }

    public void setCursoDoAluno(String cursoDoAluno) {
        this.cursoDoAluno = cursoDoAluno;
    }

    public void setEmailDoAluno(String emailDoAluno) {
        this.emailDoAluno = emailDoAluno;
    }

    public void setTelefoneDoAluno(String telefoneDoAluno) {
        this.telefoneDoAluno = telefoneDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public boolean cadastrarUmNovoAluno(String rm, String sala, String curso, String email, String telefone, String nome) {
        if (objetoDaClasseCadastrarAluno.cadastrarAluno(rm, sala, curso, email, telefone, nome)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarTodosOsAlunos() {
        resultadosDaVisualizaçãoDosAlunos = objetoDaClasseVisualizarAluno.visualizarAluno();
        return resultadosDaVisualizaçãoDosAlunos;
    }
}

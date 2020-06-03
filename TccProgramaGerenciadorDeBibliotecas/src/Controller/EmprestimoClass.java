/*
 * Classe responsável pelas informações referentes aos empréstimos de livros
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastrarEmprestimo;
import Model.VisualizarEmprestimo;
import java.sql.ResultSet;

/**
 *
 * @author T-Gamer
 */
public class EmprestimoClass {

    private int id_emprestimo;
    private String nome_aluno;
    private String rm_aluno;
    private String nome_livro;
    private String data;
    private String sala;
    public ResultSet resultset_visualizaremprestimo;
    CadastrarEmprestimo cadastraremprestimo_objeto = new CadastrarEmprestimo();
    VisualizarEmprestimo visualizaremprestimo_objeto = new VisualizarEmprestimo();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public String getRm_aluno() {
        return rm_aluno;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public String getData() {
        return data;
    }

    public String getSala() {
        return sala;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public void setRm_aluno(String rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public boolean cadastrarEmprestimo(String nome_aluno, String rm_aluno, String nome_livro, String data, String sala) {
        if (cadastraremprestimo_objeto.cadastrarUsuario(nome_aluno, rm_aluno, nome_livro, data, sala)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarEmprestimo() {
        resultset_visualizaremprestimo = visualizaremprestimo_objeto.visualizarEmprestimo();
        return resultset_visualizaremprestimo;
    }
}

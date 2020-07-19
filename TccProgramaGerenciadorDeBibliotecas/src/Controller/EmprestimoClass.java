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
    private String id_livro;
    private String id_aluno;
    private String data_emprestimo;
    private String data_entrega;
    public ResultSet resultset_visualizaremprestimo;
    public ResultSet resultset_selecionaremprestimo;
    CadastrarEmprestimo cadastraremprestimo_objeto = new CadastrarEmprestimo();
    VisualizarEmprestimo visualizaremprestimo_objeto = new VisualizarEmprestimo();

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

    public String getData_entrega() {
        return data_entrega;
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

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public boolean cadastrarEmprestimo(String codigo_livro, String rm_aluno, String data_emprestimo, String data_devolucao, String quantidade) {
        if (cadastraremprestimo_objeto.cadastrarUsuario(codigo_livro, rm_aluno, data_emprestimo, data_devolucao, quantidade)) {
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

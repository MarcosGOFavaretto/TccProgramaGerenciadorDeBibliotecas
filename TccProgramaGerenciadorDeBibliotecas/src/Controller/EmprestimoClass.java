/*
 * Classe responsável pelas informações referentes aos empréstimos de livros
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AtualizarEmprestimo;
import Model.CadastrarEmprestimo;
import Model.SelecionarEmprestimo;
import Model.VisualizarEmprestimo;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author T-Gamer
 */
public class EmprestimoClass {

    private int id_emprestimo;
    private int rm_aluno;
    private int id_livro;
    private int quantidade;
    private Date data_emprestimo;
    private Date data_entrega;
    private String situacao;
    public ResultSet resultset_visualizaremprestimo;
    public ResultSet resultset_selecionaremprestimo;
    CadastrarEmprestimo cadastraremprestimo_objeto = new CadastrarEmprestimo();
    VisualizarEmprestimo visualizaremprestimo_objeto = new VisualizarEmprestimo();
    SelecionarEmprestimo selecionaremprestimo_objeto = new SelecionarEmprestimo();
    AtualizarEmprestimo atualizaremprestimo_objeto = new AtualizarEmprestimo();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public int getId_livro() {
        return id_livro;
    }

    public int getRm_aluno() {
        return rm_aluno;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public String getSituacao() {
        return situacao;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public void setRm_aluno(int rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public void selecionarEmprestimo(int id_emprestimo) throws SQLException {
        this.resultset_selecionaremprestimo = selecionaremprestimo_objeto.selecionarEmprestimo(id_emprestimo);
        setId_emprestimo(this.resultset_selecionaremprestimo.getInt("id_emprestimo"));
        setId_livro(this.resultset_selecionaremprestimo.getInt("id_livro"));
        setRm_aluno(this.resultset_selecionaremprestimo.getInt("rm_aluno"));
        setQuantidade(this.resultset_selecionaremprestimo.getInt("quantidade"));
        setData_emprestimo(this.resultset_selecionaremprestimo.getDate("data_emprestimo"));
        setData_entrega(this.resultset_selecionaremprestimo.getDate("data_entrega"));
    }

    public boolean atualizarEmprestimo(String id_emprestimo, String rm_aluno, String id_livro, String quantidade, String data_entrega) {
        if (atualizaremprestimo_objeto.atualizarEmprestimo(id_emprestimo, rm_aluno, id_livro, quantidade, data_entrega)) {
            return true;
        } else {
            return false;
        }
    }
}

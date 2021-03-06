/*
 * Classe responsável pelas informações referentes aos empréstimos de livros
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AtualizarEmprestimo;
import Model.CadastrarEmprestimo;
import Model.ConfirmarEntrega;
import Model.SelecionarEmprestimo;
import Model.VisualizarEmprestimo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author T-Gamer
 */
public class EmprestimoClass {

    private int codigoDoEmprestimo;
    private int registroDeMatriculaDoAluno;
    private int codigoDoLivro;
    private int quantidade;
    private String dataDaRealizacaoDoEmprestimo;
    private String dataDaRealizacaoDaEntrega;
    private String situacaoAtualDoEmprestimo;
    public ResultSet resultadosDaVisualizacaoDeEmprestimos;
    public ResultSet resultadosDaSelecaoDeEmpretimoEspecifico;
    CadastrarEmprestimo objetoDaClasseCadastrarEmprestimo = new CadastrarEmprestimo();
    VisualizarEmprestimo objetoDaClasseVisualizarEmprestimo = new VisualizarEmprestimo();
    SelecionarEmprestimo objetoDaClasseSelecionarEmprestimo = new SelecionarEmprestimo();
    AtualizarEmprestimo objetoDaClasseAtualizarEmprestimo = new AtualizarEmprestimo();
    ConfirmarEntrega objetoDaClasseConfirmarEntrega = new ConfirmarEntrega();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getCodigoDoEmprestimo() {
        return codigoDoEmprestimo;
    }

    public int getCodigoDoLivro() {
        return codigoDoLivro;
    }

    public int getRegistroDeMatriculaDoAluno() {
        return registroDeMatriculaDoAluno;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDataDaRealizacaoDoEmprestimo() {
        return dataDaRealizacaoDoEmprestimo;
    }

    public String getDataDaRealizacaoDaEntrega() {
        return dataDaRealizacaoDaEntrega;
    }

    public String getSituacaoAtualDoEmprestimo() {
        return situacaoAtualDoEmprestimo;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setCodigoDoEmprestimo(int codigoDoEmprestimo) {
        this.codigoDoEmprestimo = codigoDoEmprestimo;
    }

    public void setCodigoDoLivro(int codigoDoLivro) {
        this.codigoDoLivro = codigoDoLivro;
    }

    public void setRegistroDeMatriculaDoAluno(int registroDeMatriculaDoAluno) {
        this.registroDeMatriculaDoAluno = registroDeMatriculaDoAluno;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataDaRealizacaoDoEmprestimo(String dataDaRealizacaoDoEmprestimo) {
        this.dataDaRealizacaoDoEmprestimo = dataDaRealizacaoDoEmprestimo;
    }

    public void setDataDaRealizacaoDaEntrega(String dataDaRealizacaoDaEntrega) {
        this.dataDaRealizacaoDaEntrega = dataDaRealizacaoDaEntrega;
    }

    public void setSituacaoAtualDoEmprestimo(String situacaoAtualDoEmprestimo) {
        this.situacaoAtualDoEmprestimo = situacaoAtualDoEmprestimo;
    }

    public boolean cadastrarUmNovoEmprestimo(String codigoDoLivro, String registroDeMatriculaDoAluno, String dataDaRealizacaoDoEmprestimo, String dataDaRealizacaoDaEntrega, String quantidadeDeLivrosASeremEmprestados) {
        if (objetoDaClasseCadastrarEmprestimo.cadastrarUsuario(codigoDoLivro, registroDeMatriculaDoAluno, dataDaRealizacaoDoEmprestimo, dataDaRealizacaoDaEntrega, quantidadeDeLivrosASeremEmprestados)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarTodosOsEmprestimos() {
        resultadosDaVisualizacaoDeEmprestimos = objetoDaClasseVisualizarEmprestimo.visualizarEmprestimo();
        return resultadosDaVisualizacaoDeEmprestimos;
    }

    public void selecionarEmprestimoEspecifico(int codigoDoEmprestimo) throws SQLException {
        this.resultadosDaSelecaoDeEmpretimoEspecifico = objetoDaClasseSelecionarEmprestimo.selecionarEmprestimo(codigoDoEmprestimo);
        setCodigoDoEmprestimo(this.resultadosDaSelecaoDeEmpretimoEspecifico.getInt("id_emprestimo"));
        setCodigoDoLivro(this.resultadosDaSelecaoDeEmpretimoEspecifico.getInt("id_livro"));
        setRegistroDeMatriculaDoAluno(this.resultadosDaSelecaoDeEmpretimoEspecifico.getInt("rm_aluno"));
        setQuantidade(this.resultadosDaSelecaoDeEmpretimoEspecifico.getInt("quantidade"));
        setDataDaRealizacaoDoEmprestimo(this.resultadosDaSelecaoDeEmpretimoEspecifico.getString("data_emprestimo"));
        setDataDaRealizacaoDaEntrega(this.resultadosDaSelecaoDeEmpretimoEspecifico.getString("data_entrega"));
    }

    public boolean atualizarEmprestimoEspecifico(String codigoDoEmprestimo, String registroDeMatriculaDoAluno, String codigoDoLivro, String quantidadeDeLivrosASeremEmprestados) {
        if (objetoDaClasseAtualizarEmprestimo.atualizarEmprestimo(codigoDoEmprestimo, registroDeMatriculaDoAluno, codigoDoLivro, quantidadeDeLivrosASeremEmprestados)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean confirmarEntregaDoLivro(String codigoDoEmprestimo) {
        if (objetoDaClasseConfirmarEntrega.confirmarEntrega(codigoDoEmprestimo)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean atualizarADataDeDevolucao(String codigoDoEmprestimo, String dataDaRealizacaoDaEntrega) {
        if (objetoDaClasseAtualizarEmprestimo.atualizarDataEntrega(codigoDoEmprestimo, dataDaRealizacaoDaEntrega)) {
            return true;
        } else {
            return false;
        }
    }
}

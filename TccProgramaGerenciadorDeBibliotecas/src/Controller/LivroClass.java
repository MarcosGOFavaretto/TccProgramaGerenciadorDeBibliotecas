/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastrarLivro;
import Model.VisualizarLivro;
import java.sql.ResultSet;

/**
 *
 * @author T-Gamer
 */
public class LivroClass {

    private int id_livro;
    private String nome_livro;
    private String autor;
    private String editora;
    private String ano_lancamento;
    private CadastrarLivro cadastrarlivro_objeto = new CadastrarLivro();
    public ResultSet resultset_visualizarlivro;
    VisualizarLivro visualizarlivro_objeto = new VisualizarLivro();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_livro() {
        return id_livro;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public CadastrarLivro getCadastrarlivro_objeto() {
        return cadastrarlivro_objeto;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public void setCadastrarlivro_objeto(CadastrarLivro cadastrarlivro_objeto) {
        this.cadastrarlivro_objeto = cadastrarlivro_objeto;
    }

    public boolean cadastrarLivro(String nome_livro, String autor, String editora, String ano_lancamento) {
        if (cadastrarlivro_objeto.cadastrarUsuario(nome_livro, autor, editora, ano_lancamento)) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet visualizarLivro() {
        resultset_visualizarlivro = visualizarlivro_objeto.visualizarLivro();
        return resultset_visualizarlivro;
    }
}

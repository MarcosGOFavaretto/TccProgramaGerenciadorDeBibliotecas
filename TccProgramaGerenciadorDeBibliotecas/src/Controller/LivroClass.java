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
    private String autor_livro;
    private String editora_livro;
    private String ano_lancamento_livro;
    private String quantidade_livro;
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

    public String getAutor_livro() {
        return autor_livro;
    }

    public String getEditora_livro() {
        return editora_livro;
    }

    public String getAno_lancamento_livro() {
        return ano_lancamento_livro;
    }

    public String getQuantidade_livro() {
        return quantidade_livro;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public void setAutor_livro(String autor_livro) {
        this.autor_livro = autor_livro;
    }

    public void setEditora_livro(String editora_livro) {
        this.editora_livro = editora_livro;
    }

    public void setAno_lancamento_livro(String ano_lancamento_livro) {
        this.ano_lancamento_livro = ano_lancamento_livro;
    }

    public void setQuantidade_livro(String quantidade_livro) {
        this.quantidade_livro = quantidade_livro;
    }

    public boolean cadastrarLivro(String nome_livro, String autor, String editora, String ano, String quantidade) {
        if (cadastrarlivro_objeto.cadastrarUsuario(nome_livro, autor, editora, ano, quantidade)) {
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

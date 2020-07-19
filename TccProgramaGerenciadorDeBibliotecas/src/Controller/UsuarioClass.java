/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastrarUsuario;

/**
 *
 * @author T-Gamer
 */
public class UsuarioClass {

    private int id_usuario;
    private int rm_usuario;
    private String nome_usuario;
    private String senha_usuario;
    private String email_usuario;
    private String telefone_usuario;
    private String endereco_usuario;
    private CadastrarUsuario cadastrarusuario_objeto = new CadastrarUsuario();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_usuario() {
        return id_usuario;
    }

    public int getRm_usuario() {
        return rm_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public String getTelefone_usuario() {
        return telefone_usuario;
    }

    public String getEndereco_usuario() {
        return endereco_usuario;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setRm_usuario(int rm_usuario) {
        this.rm_usuario = rm_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setTelefone_usuario(String telefone_usuario) {
        this.telefone_usuario = telefone_usuario;
    }

    public void setEndereco_usuario(String endereco_usuario) {
        this.endereco_usuario = endereco_usuario;
    }

    public boolean cadastrarUsuario(String nome, String email, String senha, String endereco, String telefone) {
        if (cadastrarusuario_objeto.cadastrarUsuario(nome, email, senha, endereco, telefone)) {
            return true;
        } else {
            return false;
        }
    }
}

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
    private String nome;
    private String senha;
    private String email;
    private String telefone;
    private String endereco;
    private CadastrarUsuario cadastrarusuario_objeto = new CadastrarUsuario();

    // CRIANDO OS MÉTODOS "GETTERS":
    public int getId_usuario() {
        return id_usuario;
    }

    public int getRm_usuario() {
        return rm_usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setRm_usuario(int rm_usuario) {
        this.rm_usuario = rm_usuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean cadastrarUsuario(String rm_usuario, String nome, String senha, String email, String telefone, String endereco) {
        if (cadastrarusuario_objeto.cadastrarUsuario(rm_usuario, nome, senha, email, telefone, endereco)) {
            return true;
        } else {
            return false;
        }
    }
}

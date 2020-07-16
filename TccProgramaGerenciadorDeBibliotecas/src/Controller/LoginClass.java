/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConsultarUsuario;

/**
 *
 * @author T-Gamer
 */
public class LoginClass {

    private String email;
    private String senha;
    public Boolean login = false;
    private ConsultarUsuario consultarusuario_objeto = new ConsultarUsuario();

    // CRIANDO OS MÉTODOS "GETTERS":
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getLogin() {
        return login;
    }

    // CRIANDO OS MÉTODOS "SETTERS":
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    // Criando método para a validação do usuário:
    /* ERRO MVC
    public void ConsultarUsuario(String email, String senha) {
        if (consultarusuario_objeto.ConsultarUsuario(this.email, this.senha)) {
            login = true;
        } else {
            login = false;
        }
    }
     */
}

package com.company.Login;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        setUsuario(usuario);
        setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean setUsuario(String usuario) {
        if (usuario.length() > 0) {
            this.usuario = usuario;
            return true;
        }else
            return false;

    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if (senha.length() > 0) {
            this.senha = senha;
            return true;
        }else
            return false;
    }
}

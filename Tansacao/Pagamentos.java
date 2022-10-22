package com.company.Tansacao;

public class Pagamentos {
    private String tipo;

    public Pagamentos(String tipo) {
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        if(tipo.length() > 0) {
            this.tipo = tipo;
            return true;
        }else
            return false;
    }
}

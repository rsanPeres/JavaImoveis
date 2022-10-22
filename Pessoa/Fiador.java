package com.company.Pessoa;

public class Fiador {
    private String cpfFiador;
    private String nomeFiador;


    public Fiador(String cpfFiador, String nomeFiador) {
        setCpfFiador(cpfFiador);
        setNomeFiador(nomeFiador);
    }

    public String getCpfFiador() {
        return cpfFiador;
    }

    public void setCpfFiador(String cpfFiador) {
        this.cpfFiador = cpfFiador;
    }

    public String getNomeFiador() {
        return nomeFiador;
    }

    public void setNomeFiador(String nomeFiador) {
        this.nomeFiador = nomeFiador;
    }

    @Override
    public String toString() {
        return "Fiador: " + "cpf Fiador: " + cpfFiador + ", nomeFiador: " + nomeFiador;
    }
}

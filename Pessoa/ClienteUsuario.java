package com.company.Pessoa;

import com.company.Endereco.Endereco;

public class ClienteUsuario extends Cliente{
    private Fiador fiador;


    public ClienteUsuario(String CPF, String nome, int telefone1, String email, String profissao, Endereco address, String imovelID, Fiador fiador) {
        super(CPF, nome, telefone1, email, profissao, address, imovelID);
        setFiador(fiador);
    }

    public ClienteUsuario(String CPF, String nome, int telefone1, int telefone2, String email, String sexo, String profissao, String imovelID, String estadoCivil, Endereco address, Fiador fiador) {
        super(CPF, nome, telefone1, telefone2, email, sexo, profissao, imovelID, estadoCivil, address);
        setFiador(fiador);
    }

    public Fiador getFiador() {
        return fiador;
    }

    public void setFiador(Fiador fiador) {
        this.fiador = fiador;
    }

    @Override
    public String toString() {
        return "ClienteUsuario: " +
                "imovelID: " + imovelID +
                ", estadoCivil: " + estadoCivil +
                ", fiador: " + fiador +
                ", CPF: " + CPF  +
                ", nome: " + nome +
                ", telefone1: " + telefone1 +
                ", telefone2: " + telefone2 +
                ", email: " + email +
                ", sexo: " + sexo +
                ", profissao: " + profissao +
                ", address: " + address.toString();
    }
}

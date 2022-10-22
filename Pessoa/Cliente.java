package com.company.Pessoa;

import com.company.Endereco.Endereco;

import java.io.Serializable;


public class Cliente extends DadosPessoa implements Serializable {
    protected String imovelID;
    protected String estadoCivil;

    public Cliente(){}


    public Cliente(String CPF, String nome, int telefone1,  String email,  String profissao, Endereco address, String imovelID) {
        super(CPF, nome, telefone1,email, profissao, address);
        setImovelID(imovelID);
    }

    public Cliente(String CPF, String nome, int telefone1, int telefone2, String email, String sexo, String profissao, String imovelID, String estadoCivil, Endereco address) {
        super(CPF, nome, telefone1, telefone2, email, sexo, profissao, address);
        setImovelID(imovelID);
        setEstadoCivil(estadoCivil);
    }

    public String getImovelID() {
        return imovelID;
    }

    public boolean setImovelID(String imovelID) {
        if(imovelID.length() > 0) {
            this.imovelID = imovelID;
            return true;
        }else
            return false;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public boolean setEstadoCivil(String estadoCivil) {
        if (estadoCivil.length() > 0) {
            this.estadoCivil = estadoCivil;
            return true;
        }else
            return false;
    }
    public String toString(){
        return super.toString() +", "+ getImovelID() +", "+ getEstadoCivil();
    }

}

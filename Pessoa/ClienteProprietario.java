package com.company.Pessoa;

import com.company.Endereco.Endereco;
import com.company.Tansacao.Transacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteProprietario extends Cliente{
    private Date data1imovel;
    private Transacao transacao;


    public ClienteProprietario(String CPF, String nome, int telefone1, String email, String profissao, Endereco address, String imovelID) {
        super(CPF, nome, telefone1, email, profissao, address, imovelID);
    }

    public ClienteProprietario(String CPF, String nome, int telefone1, int telefone2, String email, String sexo, String profissao, String imovelID, String estadoCivil, Endereco address, Date data1imovel, Fiador fiador) {
        super(CPF, nome, telefone1, telefone2, email, sexo, profissao, imovelID, estadoCivil, address);
        setData1imovel(data1imovel);

    }

    public Date getData1imovel() {
        return data1imovel;
    }

    public boolean setData1imovel(Date data1imovel) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dat = format.format(data1imovel);
        if(isDateValid(dat)) {
            this.data1imovel = data1imovel;
            return true;
        }else
            return false;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {

        this.transacao = transacao;
    }

    @Override
    public String toString() {
        return "Cliente Proprietario: " +
                "imovelID: " + imovelID +
                ", estadoCivil: " + estadoCivil  +
                ", data1imovel: " + data1imovel +
                ", CPF:" + CPF +
                ", nome:" + nome +
                ", telefone1: " + telefone1 +
                ", telefone2: " + telefone2 +
                ", email: " + email +
                ", sexo:" + sexo +
                ", profissão: " + profissao +
                ", address:" + address;
    }
}

package com.company.Tansacao;

import com.company.Pessoa.ClienteProprietario;
import com.company.Pessoa.Corretor;
import com.company.imoveis.Imovel;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.company.validaData.ValidaData.isDateValid;

public class Transacao implements Serializable {
    private Date dataTransacao;
    private int numContrato;
    private String formaPagamento;
    private Pagamentos pagamentos;
    private Imovel imovel;
    private ClienteProprietario clientProp;
    private double valorTransacao;

    public Transacao(){}

    public Transacao(Imovel imovel, ClienteProprietario clientProp){
        setClientProp(clientProp);
        setImovel(imovel);
    }

    public Transacao(Date dataTransacao, int numContrato, String formaPagamento, Pagamentos pagamentos) {
        setDataTransacao(dataTransacao);
        setNumContrato(numContrato);
        setFormaPagamento(formaPagamento);
        setPagamentos(pagamentos);
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public boolean setDataTransacao(Date dataTransacao) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dat = format.format(dataTransacao);

        if (isDateValid(dat)){
            this.dataTransacao = dataTransacao;
            return true;
        }else
            return false;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public boolean setNumContrato(int numContrato) {
        if(numContrato > 0) {
            this.numContrato = numContrato;
            return true;
        }else
            return false;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public boolean setFormaPagamento(String formaPagamento) {
        if(formaPagamento.length() > 0) {
            this.formaPagamento = formaPagamento;
            return true;
        }else
            return false;

    }

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamentos pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public ClienteProprietario getClientProp() {
        return clientProp;
    }

    public void setClientProp(ClienteProprietario clientProp) {
        this.clientProp = clientProp;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public boolean setValorTransacao(double valorTransacao) {
        if(valorTransacao > 0) {
            this.valorTransacao = valorTransacao;
            return true;
        }else
            return false;
    }

    public boolean comissao(Corretor corretorTransacao){
        corretorTransacao.setVendasMes(this.valorTransacao);
        return true;
    }

    @Override
    public String toString() {
        return "Transacao: " +
                "dataTransacao: " + dataTransacao +
                ", numContrato: " + numContrato +
                ", formaPagamento: " + formaPagamento +
                ", pagamentos: " + pagamentos +
                ", imovel: " + imovel +
                ", clientProp: " + clientProp +
                ", valorTransacao: " + valorTransacao;
    }
}

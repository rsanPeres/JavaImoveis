package com.company.imoveis;

import com.company.Endereco.Endereco;
import com.company.Pessoa.ClienteProprietario;
import com.company.Pessoa.Corretor;
import com.company.Tansacao.Transacao;
import com.company.validaData.ValidaData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Imovel extends ValidaData implements Serializable {
    protected String imovelID;
    protected String tipoNegocio;
    protected byte statusImovel;
    protected Date dataDisponibilidade;
    protected Date dataConstrucao;
    protected double precoProprietario;
    protected double precoFechado;
    protected double valorImobiliaria;
    protected Endereco address;
    protected ClienteProprietario cliprop;

    public Imovel(){

    }

    public Imovel(String imovelID, ClienteProprietario cli, double valorImobiliaria, String tipoNegocio, Date dataConstrucao, Date dataDisponibilidade, double precoProprietario, double precoFechado, Endereco address, String statusImovel) {
        setImovelID(imovelID);
        setTipoNegocio(tipoNegocio);
        setStatusImovel(statusImovel);
        setDataDisponibilidade(dataDisponibilidade);
        setDataConstrucao(dataConstrucao);
        setPrecoProprietario(precoProprietario);
        setPrecoFechado(precoFechado);
        setValorImobiliaria(valorImobiliaria);
        setAddress(address);
        setCliprop(cli);

    }


    public Imovel(ClienteProprietario proprietario, String imovelID) {
        setCliprop(proprietario);
        setImovelID(imovelID);
    }

    public String getImovelID() {

        return imovelID;
    }

    public boolean setImovelID(String imovelID) {
        if(imovelID.length() > 0) {
            this.imovelID = imovelID;
            return true;
        }

        else return false;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public boolean setTipoNegocio(String tipoNegocio) {
        if(tipoNegocio.length() > 0) {
            this.tipoNegocio = tipoNegocio;
            return true;
        }

        else return false;
    }

    public String getStatusImovel() {
        if(statusImovel == 1) {
            return "Ativo";
        }if(statusImovel == 2){
            return "Inativo";
        }else
            return "Em uso";
    }

    public boolean setStatusImovel(String statusImovel) {
        if(statusImovel.equalsIgnoreCase("Ativo")){
            this.statusImovel = 1;
            return true;
        } else if(statusImovel.equalsIgnoreCase("Inativo")){
            this.statusImovel = 2;
            return true;
        } else if(statusImovel.equalsIgnoreCase("Uso")) {
            this.statusImovel = 3;
            return true;
        }
        else return false;
    }

    public Date getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public boolean setDataDisponibilidade(Date dataDisponibilidade) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dat = format.format(dataDisponibilidade);

        if (isDateValid(dat)){
        this.dataDisponibilidade = dataDisponibilidade;
        return true;

        }else
        return false;
    }


    public Date getDataConstrucao() {
        return dataConstrucao;
    }

    public boolean setDataConstrucao(Date dataConstrucao) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dat = format.format(dataConstrucao);

        if (isDateValid(dat)){
            this.dataConstrucao = dataConstrucao;
            return true;

        }else
            return false;

    }

    public double getPrecoProprietario() {
        return precoProprietario;
    }

    public boolean setPrecoProprietario(double precoProprietario) {
        if(precoProprietario > 0) {
            this.precoProprietario = precoProprietario;
            return true;
        }else return false;
    }

    public double getPrecoFechado() {
        return precoFechado;
    }

    public boolean setPrecoFechado(double precoFechado) {
        if(precoFechado > 0) {
            this.precoFechado = precoFechado;
            return true;
        }else return false;

    }

    public double getValorImobiliaria() {
        return valorImobiliaria;
    }

    public void setValorImobiliaria(double valorImobiliaria) {
        this.valorImobiliaria = valorImobiliaria;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }

    public static String verProprietario(String idImovel, ArrayList imoveis){

        if(imoveis.contains(idImovel)){
            return imoveis.get(imoveis.indexOf(idImovel)).toString();
        }else return "falha";

    }
    public boolean efetuaTransacao(String statusImovel, String tipoNegocio, double precoFechado, Transacao trans, Corretor corretor, Date dataTrans, String formaPg) {
        setPrecoFechado(precoFechado);
        setStatusImovel(statusImovel);
        setTipoNegocio(tipoNegocio);
        trans.comissao(corretor);
        trans.setValorTransacao(precoFechado);
        trans.setDataTransacao(dataTrans);
        trans.setFormaPagamento(formaPg);

        return true;
    }

    public ClienteProprietario getCliprop() {
        return cliprop;
    }

    public void setCliprop(ClienteProprietario cliprop) {
        this.cliprop = cliprop;
    }

    public abstract int getQtdVagaGaragem();
    public abstract int getQtdSuites();
    public abstract boolean isArmariosEmbutidos();
    public abstract int getQtdQuartos();

    public abstract float calculaIndiceVendaLocacao();//descrever

    @Override
    public String toString() {
        return "Imovel: " +
                "imovelID: " + imovelID +
                ", tipoNegocio: " + tipoNegocio +
                ", statusImovel: " + statusImovel +
                ", dataDisponibilidade: " + dataDisponibilidade +
                ", dataConstrucao: " + dataConstrucao +
                ", precoProprietario: " + precoProprietario +
                ", precoFechado: " + precoFechado +
                ", valorImobiliaria: " + valorImobiliaria +
                ", address: " + address.toString() +
                ", cliprop: " + cliprop.toString();
    }
}

package com.company.imoveis;

import com.company.Endereco.Endereco;
import com.company.Pessoa.ClienteProprietario;

import java.util.Date;

public class CaracteristicasImovel extends Imovel{
    protected float areaImovel;
    protected int qtdQuartos;
    protected int qtdSuites;
    protected int qtdSalaEstar;
    protected int qtdVagaGaragem;
    protected boolean armariosEmbutidos;
    protected String descricaoImovel;

    public CaracteristicasImovel(){

    }

    public CaracteristicasImovel(String imovelID, ClienteProprietario cli, double valorImobiliaria, String tipoNegocio, Date dataConstrucao, Date dataDisponibilidade, double precoProprietario, double precoFechado, Endereco address, String statusImovel, float areaImovel, int qtdQuartos, int qtdSuites, int qtdSalaEstar, int qtdVagaGaragem, boolean armariosEmbutidos, String descricaoImovel) {
        super(imovelID, cli, valorImobiliaria, tipoNegocio, dataConstrucao, dataDisponibilidade, precoProprietario, precoFechado, address, statusImovel);
        setAreaImovel(areaImovel);
        setQtdQuartos(qtdQuartos);
        setQtdSuites(qtdSuites);
        setQtdSalaEstar(qtdSalaEstar);
        setQtdVagaGaragem(qtdVagaGaragem);
        setArmariosEmbutidos(armariosEmbutidos);
        setDescricaoImovel(descricaoImovel);
    }


    public CaracteristicasImovel(ClienteProprietario proprietario, String imovelID) {
        super(proprietario, imovelID);
    }

    public float getAreaImovel() {
        return areaImovel;
    }

    public boolean setAreaImovel(float areaImovel) {
        if(areaImovel > 0)
            this.areaImovel = areaImovel;
        else
            return false;

        return true;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public boolean setQtdQuartos(int qtdQuartos) {
        if(qtdQuartos > 0)
            this.qtdQuartos = qtdQuartos;
        else
            return false;

        return true;

    }

    public int getQtdSuites() {
        return qtdSuites;
    }

    public boolean setQtdSuites(int qtdSuites) {
        if(qtdSuites >= 0) {
            this.qtdSuites = qtdSuites;
            return true;
        }else
            return false;

    }

    public int getQtdSalaEstar() {
        return qtdSalaEstar;
    }

    public boolean setQtdSalaEstar(int qtdSalaEstar) {
        if(qtdSalaEstar >= 0) {
            this.qtdSalaEstar = qtdSalaEstar;
            return true;
        }else return false;

    }

    public int getQtdVagaGaragem() {
        return qtdVagaGaragem;
    }

    public boolean setQtdVagaGaragem(int qtdVagaGaragem) {
        if(qtdVagaGaragem >= 0) {
            this.qtdVagaGaragem = qtdVagaGaragem;
            return true;
        }

        else return false;
    }

    public boolean isArmariosEmbutidos() {
        return armariosEmbutidos;
    }

    public void setArmariosEmbutidos(boolean armariosEmbutidos) {
        this.armariosEmbutidos = armariosEmbutidos;
    }

    public String getDescricaoImovel() {
        return descricaoImovel;
    }

    public boolean setDescricaoImovel(String descricaoImovel) {
        if(descricaoImovel.length() >= 0) {
            this.descricaoImovel = descricaoImovel;
            return true;
        }
        else return false;
    }

    public float calculaIndiceVendaLocacao() {
        //para moradias é considerado o preço dividido pela area do imovel(valores utilizados para calculo do valor de imóveis)
        // somado a duas caracteristicas importates como suites e vagas para carros. Quanto maior o valor maior o
        // interecesse no negócio
        float indice = qtdSuites + qtdVagaGaragem + ((float) precoProprietario / areaImovel);
        return indice;
    }

    @Override
    public String toString() {
        return "CaracteristicasImovel: " + super.toString() +
                "areaImovel: " + areaImovel +
                ", qtdQuartos: " + qtdQuartos +
                ", qtdSuites: " + qtdSuites +
                ", qtdSalaEstar: " + qtdSalaEstar +
                ", qtdVagaGaragem: " + qtdVagaGaragem +
                ", armariosEmbutidos: " + armariosEmbutidos +
                ", descricaoImovel: " + descricaoImovel;
    }
}

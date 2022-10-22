package com.company.imoveis;

import com.company.Endereco.Endereco;
import com.company.Pessoa.ClienteProprietario;

import java.util.Date;

public class Terreno extends Imovel{

    private float areaTerreno;
    private float larguraTerreno;
    private float comprimentoTerreno;
    private boolean acliveDeclive;

    public Terreno(){
    }

    public Terreno(String imovelID, ClienteProprietario cli, double valorImobiliaria, String tipoNegocio, Date dataConstrucao, Date dataDisponibilidade, double precoProprietario, double precoFechado, Endereco address, String statusImovel, float areaTerreno, float larguraTerreno, float comprimentoTerreno, boolean acliveDeclive) {
        super(imovelID, cli, valorImobiliaria, tipoNegocio, dataConstrucao, dataDisponibilidade, precoProprietario, precoFechado, address, statusImovel);
        setAreaTerreno(areaTerreno);
        setLarguraTerreno(larguraTerreno);
        setComprimentoTerreno(comprimentoTerreno);
        setAcliveDeclive(acliveDeclive);
    }

    public Terreno(ClienteProprietario proprietario, String imovelID) {
        super(proprietario, imovelID);

    }


    public float getAreaTerreno() {
        return areaTerreno;
    }

    public boolean setAreaTerreno(float areaTerreno) {
        if(areaTerreno > 0) {
            this.areaTerreno = areaTerreno;
            return true;
        }else
            return false;
    }

    public float getLarguraTerreno() {
        return larguraTerreno;
    }

    public boolean setLarguraTerreno(float larguraTerreno) {
        if (larguraTerreno > 0) {
            this.larguraTerreno = larguraTerreno;
            return true;
        }else
            return false;

    }

    public float getComprimentoTerreno() {
        return comprimentoTerreno;
    }

    public boolean setComprimentoTerreno(float comprimentoTerreno) {
        if(comprimentoTerreno > 0) {
            this.comprimentoTerreno = comprimentoTerreno;
            return true;
        }else
            return false;
    }

    public boolean isAcliveDeclive() {
        return acliveDeclive;
    }

    public void setAcliveDeclive(boolean acliveDeclive) {
        this.acliveDeclive = acliveDeclive;
    }

    @Override
    public float calculaIndiceVendaLocacao() {//descrever
        //se o terreno apresentar declive e aclive é somado um valor que reduz o indice de interesse no terreno
        //se não apresentar mantem o interesse de acordo como a valor dividido por area
        if(acliveDeclive) {
            float indice = (float)precoProprietario / (areaTerreno + 2);
            return indice;
        }
        return ((float)precoProprietario / (areaTerreno));
    }

    @Override
    public int getQtdSuites() {
        return 0;
    }

    @Override
    public int getQtdVagaGaragem() {
        return 0;
    }

    @Override
    public boolean isArmariosEmbutidos() {
        return false;
    }

    @Override
    public int getQtdQuartos() {
        return 0;
    }

    @Override
    public String toString() {
        return "Terreno: " + super.toString() +
                "areaTerreno: " + areaTerreno +
                ", larguraTerreno: " + larguraTerreno +
                ", comprimentoTerreno: " + comprimentoTerreno +
                ", acliveDeclive: " + acliveDeclive;
    }
}

package com.company.imoveis;

import com.company.Endereco.Endereco;
import com.company.Pessoa.ClienteProprietario;

import java.util.Date;

public class SalaComercial extends Imovel {
    private float areaComercial;
    private int qtdComodos;
    private int qtdBanheiros;

    public SalaComercial(){}

    public SalaComercial(String imovelID, ClienteProprietario proprietario){
        super(proprietario, imovelID);

    }

    public SalaComercial(String imovelID, ClienteProprietario cli, double valorImobiliaria, String tipoNegocio, Date dataConstrucao, Date dataDisponibilidade, double precoProprietario, double precoFechado, Endereco address, String statusImovel, float areaComercial, int qtdComodos, int qtdBanheiros) {
        super(imovelID, cli, valorImobiliaria, tipoNegocio, dataConstrucao, dataDisponibilidade, precoProprietario, precoFechado, address, statusImovel);
        setAreaComercial(areaComercial);
        setQtdComodos(qtdComodos);
        setQtdBanheiros(qtdBanheiros);
    }


    public float getAreaComercial() {
        return areaComercial;
    }

    public boolean setAreaComercial(float areaComercial) {
        if (areaComercial > 0) {
            this.areaComercial = areaComercial;
            return true;
        } else
            return false;
    }

    public int getQtdComodos() {
        return qtdComodos;
    }

    public boolean setQtdComodos(int qtdComodos) {
        if (qtdComodos > 0) {
            this.qtdComodos = qtdComodos;
            return true;
        } else
            return false;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public boolean setQtdBanheiros(int qtdBanheiros) {
        if (qtdBanheiros > 0) {
            this.qtdBanheiros = qtdBanheiros;
            return true;
        }
        return false;
    }


    public float calculaIndiceVendaLocacao() {
        //para salas comerciais são considerados os valores da area somados a quantidade de comodos dividido pelo preço
        float indice = this.areaComercial + this.qtdComodos/ ((float) this.precoProprietario) ;
        return 0;
    }

    @Override
    public int getQtdVagaGaragem() {
        return 0;
    }

    @Override
    public int getQtdSuites() {
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
        return "SalaComercial: " + super.toString() +
                "areaComercial: " + areaComercial +
                ", qtdComodos: " + qtdComodos +
                ", qtdBanheiros: " + qtdBanheiros;
    }
}

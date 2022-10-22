package com.company.imoveis;

import com.company.Endereco.Endereco;
import com.company.Pessoa.ClienteProprietario;

import java.util.Date;

public class Casa extends CaracteristicasImovel {
    private boolean eCondominio;
    private boolean temPiscina;

    public Casa(){
    }

    public Casa(String imovelID, ClienteProprietario proprietario){
        super(proprietario, imovelID);

    }


    public Casa(String imovelID, ClienteProprietario cli, double valorImobiliaria, String tipoNegocio, Date dataConstrucao, Date dataDisponibilidade, double precoProprietario, double precoFechado, Endereco address, String statusImovel, float areaImovel, int qtdQuartos, int qtdSuites, int qtdSalaEstar, int qtdVagaGaragem, boolean armariosEmbutidos, String descricaoImovel, boolean eCondominio, boolean temPiscina) {
        super(imovelID, cli, valorImobiliaria, tipoNegocio, dataConstrucao, dataDisponibilidade, precoProprietario, precoFechado, address, statusImovel, areaImovel, qtdQuartos, qtdSuites, qtdSalaEstar, qtdVagaGaragem, armariosEmbutidos, descricaoImovel);
        seteCondominio(eCondominio);
        setTemPiscina(temPiscina);
    }




    public boolean iseCondominio() {
        return eCondominio;
    }

    public void seteCondominio(boolean eCondominio) {
        this.eCondominio = eCondominio;
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPicina) {
        this.temPiscina = temPicina;
    }

    public float calculaIndiceVendaLocacao() {
        //para o calculo desse indice foi somado 1 ao valor calculado com as caracteristicas da super, se a casa apresentar piscina
        //se não o indice de interece é baseado apenas nas caracteristicas da super
        if(temPiscina) {
            return super.calculaIndiceVendaLocacao() + 1;
        }
        return super.calculaIndiceVendaLocacao();
    }

    @Override
    public String toString() {
        return "Casa: " + super.toString() +
                "eCondominio: " + eCondominio +
                ", temPiscina: " + temPiscina;
    }
}
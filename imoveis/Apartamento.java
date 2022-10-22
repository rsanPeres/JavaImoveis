package com.company.imoveis;

import com.company.Endereco.Endereco;
import com.company.Pessoa.ClienteProprietario;

import java.util.Date;

public class Apartamento extends CaracteristicasImovel{
    private int andar;
    private double valorCondominio;
    private boolean portariaTotal;

    public Apartamento (){}

    public Apartamento(String imovelID, ClienteProprietario proprietario, int andar){
        super(proprietario, imovelID);
        setAndar(andar);

    }

    public Apartamento(String imovelID, ClienteProprietario cli, double valorImobiliaria, String tipoNegocio, Date dataConstrucao, Date dataDisponibilidade, double precoProprietario, double precoFechado, Endereco address, String statusImovel, float areaImovel, int qtdQuartos, int qtdSuites, int qtdSalaEstar, int qtdVagaGaragem, boolean armariosEmbutidos, String descricaoImovel, int andar, double valorCondominio, boolean portariaTotal) {
        super(imovelID, cli, valorImobiliaria, tipoNegocio, dataConstrucao, dataDisponibilidade, precoProprietario, precoFechado, address, statusImovel, areaImovel, qtdQuartos, qtdSuites, qtdSalaEstar, qtdVagaGaragem, armariosEmbutidos, descricaoImovel);
        setAndar(andar);
        setValorCondominio(valorCondominio);
        setPortariaTotal(portariaTotal);
    }

    public Apartamento(ClienteProprietario proprietario, String imovelID) {
        super(proprietario, imovelID);

    }


    public int getAndar() {
        return andar;
    }

    public boolean setAndar(int andar) {
        if(andar > 0)
            this.andar = andar;
        else {
            return false;
        }
        return true;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public boolean setValorCondominio(double valorCondominio) {
        if(valorCondominio > 0)
        this.valorCondominio = valorCondominio;
        else {
            return false;
        }
        return true;
    }

    public boolean isPortariaTotal() {
        return portariaTotal;
    }

    public void setPortariaTotal(boolean portariaTotal) {
            this.portariaTotal = portariaTotal;
    }


    public float calculaIndiceVendaLocacao() {
        //para o cálculo de indice de endereço é usado as caracteristicas anteriores somado ao andar
        //pois, geralmente o ultimo andar é o mais caro/menos barulho maior conforto
       float indice = super.calculaIndiceVendaLocacao() + andar;
        return indice;
    }

    @Override
    public String toString() {
        return "Apartamento: " + super.toString() +
                "andar: " + andar +
                ", valorCondominio: " + valorCondominio +
                ", portariaTotal: " + portariaTotal;
    }
}
